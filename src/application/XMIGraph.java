/*_______________________________________________________*/
/**
 * Fichier : XMIGraph.java
 *
 * Créé le 1 févr. 2012 à 19:43:15
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package application;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2._1._0._0.uml.UmlPackage;
import org.omg.xmi.XmiPackage;
import org.omg.xmi.util.XmiResourceFactoryImpl;

/*_______________________________________________________*/
/** Classe majeure du logiciel XMIGraph, permet l'import et le parsing de fichiers XMI repondant aux normes des formats UML 2.1 et XMI 2.1.1 exportes par BOUML.
 *  Les donnes importees peuvent ensuite etre modelisees sous forme de diagramme UML.
 */
public class XMIGraph
{
	/** Permet le parcours en profondeur de l'arbre obtenu par parsing des donnees contenues dans le document XMI. */
	private ParcoursProfondeur parcoursProfondeur;
	
	/** Namespace utilise dans les fichiers XMI a importer. */
	private String XMI_NAMESPACE = "http://schema.omg.org/spec/XMI/2.1";
	
	/** Arbre contenant les donnes importees a partir du fichier specifie. */
	private EObject document;
	
	/** Nom du systeme d'exploitation courant. */
	private String operatingSystem = System.getProperty("os.name");
	
	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ parcoursProfondeur.
	 * @return La valeur du champ parcoursProfondeur.
	 */
	public ParcoursProfondeur getParcoursProfondeur()
	{
		return parcoursProfondeur;
	}

	/*_______________________________________________________*/
	/** Constructeur de la classe XMIGraph.
	 * @param file Fichier a parser.
	 */
	public XMIGraph(String file)
	{	  
		/*
		File umlEcore;
		if(operatingSystem.contains("Windows"))
		{
			umlEcore = new File("bin\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore");
		}
		else
		{
			umlEcore = new File("bin/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore");
		}
		*/
		//Le fichier uml.ecore est copie de src vers bin si celui-ci n'est pas present dans l'emplacement requis du dossier bin.
		boolean b = true;
		/*
		if(!umlEcore.exists())
		{
			b = initUmlEcoreFile();
		}
		*/
		if(b)
		{
			try
			{
				//Instanciation des package UmlPackageImpl et XmiPackageImpl.
				UmlPackage.eINSTANCE.getClass();
				XmiPackage.eINSTANCE.getClass();
				try
				{
					parse(file);
					modelisate();
				}
				catch(FileNotFoundException e)
				{
					System.err.println("Le document n'a pas ete trouvé.");
				}
				catch(NullPointerException e)
				{
					System.err.println("La lecture des informations contenues dans le fichier XMI importé a retournée une erreur.\nCertains éléments ou attributs peuvent être manquants ou invalides.");
				}
				catch(IOException e)
				{
					System.err.println("Le document specfie n'a pu etre importe.\nCette erreur peut etre causee par l'utilisation d'un format XMI ou UML non supporte.\nLes versions actuellement supportees sont XMI 2.1 et UML 2.1.\nNous conseillons par ailleurs l'utilisation de BOUML afin d'exporter vos fichiers dans un format utilisable par le logiciel present.");
				}
			}
			catch(ExceptionInInitializerError e)
			{
				if(operatingSystem.contains("Windows"))
				{
					System.err.println("Le fichier bin\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore est manquant. Veuillez le copier a partir du fichier src\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore.");
				}
				else
				{
					System.err.println("Le fichier bin/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore est manquant. Veuillez le copier a partir du fichier src/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore.");
				}
			}
		}
	}
	
	/*_______________________________________________________*/
	/** Instancie l'attribut parcoursProfondeur afin de modeliser le document importe.
	 */
	private void modelisate()
	{
		parcoursProfondeur = new ParcoursProfondeur();
		parcoursProfondeur.parcourir(document, 0);
	}
	
	/*_______________________________________________________*/
	/** Charge en memoire et modelise le document dont le nom est passe en parametre.
	 * @param file Le nom du document a parser.
	 * @throws IOException, NullPointerException, FileNotFoundException 
	 * @throws NullPointerException 
	 * @throws FileNotFoundException 
	 */
	private void parse(String file) throws IOException, NullPointerException, FileNotFoundException
	{
		FileInputStream xmiFile = null;
		
		//Creation de l'URI associee a l'element racine du fichier XMI. => NAMESPACES XSD / EXPORT BOUML DIFFERENTS
		URI xmiUri = URI.createURI(XMI_NAMESPACE);
		
		//Instanciation de la classe ResourceImpl liee a l'URI specifiee.
		Resource resource = new XmiResourceFactoryImpl().createResource(xmiUri);
		
		//Chargement du fichier en memoire.
		xmiFile = new FileInputStream(file);
		
		//Parsing du fichier charge en memoire.
		resource.load(xmiFile,null);
		System.out.println("Le fichier " + file.substring(file.lastIndexOf("\\")+1, file.length()) + " a ete importé.");
		//Recuperation des elements parses.
		document = (EObject)resource.getContents().get(0);
	}
	
	/*_______________________________________________________*/
	/** Copie le fichier uml.ecore situe dans un sous-dossier du dossier src vers un sous-dossier du dossier bin.
	 * @return true si la copie a ete correctement effectuee, false sinon
	 */
	private boolean initUmlEcoreFile()
	{
		int line;
		FileReader input = null;
		FileWriter output = null;
		//Creation des fichiers source et destination
		try
		{
			if(operatingSystem.contains("Windows"))
			{
				input = new FileReader("src\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore");
			}
			else
			{
				input = new FileReader("src/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore");
			}
			try
			{
				if(operatingSystem.contains("Windows"))
				{
					output = new FileWriter("bin\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore");
				}
				else
				{
					output = new FileWriter("bin/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore");
				}
			    try
				{
					while ((line = input.read()) != -1)
					{
							output.write(line);
					}
					 try
					{
						input.close();
					}
				    catch (IOException e)
				    {
				    	return false;
				    }
				    try
					{
						output.close();
					}
				    catch (IOException e)
				    {
				    	return false;
				    }
				}
			    catch (IOException e)
				{
					if(operatingSystem.contains("Windows"))
					{
						System.err.println("La copie du fichier bin\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore vers src\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore a rencontré une erreur.\nVeuillez effectuer cette copie manuellement.");
					}
					else
					{
						System.err.println("La copie du fichier bin/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore vers src/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore a rencontré une erreur.\nVeuillez effectuer cette copie manuellement.");
					}
					 try
						{
							input.close();
						}
					    catch (IOException e2) {}
					    try
						{
							output.close();
						}
					    catch (IOException e3) {}
					    return false;
				}
			}
			catch (IOException e1)
			{
				if(operatingSystem.contains("Windows"))
				{
					System.err.println("La création du fichier de sortie bin\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore a rencontré une erreur.");
				}
				else
				{
					System.err.println("La création du fichier de sortie bin/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore a rencontré une erreur.");
				}
				return false;
			}
		}
		catch (FileNotFoundException e1)
		{
			if(operatingSystem.contains("Windows"))
			{
				System.err.println("Le fichier src\\org\\eclipse\\uml2\\_1\\_0\\_0\\uml\\impl\\uml.ecore est introuvable.");
			}
			else
			{
				System.err.println("Le fichier src/org/eclipse/uml2/_1/_0/_0/uml/impl/uml.ecore est introuvable.");
			}
			return false;
		}
		return true;
	}
}

/*_______________________________________________________*/
/* Fin du ficher XMIGraph.java
/*_______________________________________________________*/