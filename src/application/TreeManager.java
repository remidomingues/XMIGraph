/*_______________________________________________________*/
/**
 * Fichier : TreeManager.java
 *
 * Créé le 1 févr. 2012 à 19:36:49
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

import modelisation.PackagedElementComponent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2._1._0._0.uml.JType;
import org.eclipse.uml2._1._0._0.uml.Model;
import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.PackageableElement;
import org.eclipse.uml2._1._0._0.uml.PackagedElement;
import org.eclipse.uml2._1._0._0.uml.impl.PackageableElementImpl;

/*_______________________________________________________*/
/** Gere l'arbre contenant les classes de stockages obtenu suite au parsing.
 */
public class TreeManager
{
	/** Modele de la liste d'affichage des elements dans l'interface graphique */
	private DefaultListModel model = new DefaultListModel();

	/** Liste contenant les associations, agregations, compositions, heritages et dependances entre classes modelisees */
	private List<PackagedElement> UMLRelations = new ArrayList<PackagedElement>();
	
	/** Reference sur la classe de stockage de l'element XMI uml:Model */
	private Model xmiModel;
	
	/** Identifiant utilise pour la generation d'identifiants XMI */
	private int xmiId = -1;
	
	/** LIste des types primitifs */
	private List<String> primitiveTypes = new ArrayList<String>();
	
	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ primitiveTypes.
	 * @return La valeur du champ primitiveTypes.
	 */
	public List<String> getPrimitiveTypes()
	{
		return primitiveTypes;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ uMLRelations.
	 * @return La valeur du champ uMLRelations.
	 */
	public List<PackagedElement> getUMLRelations()
	{
		return UMLRelations;
	}
	
	/**
	 * getter du modele permettant a la liste d'y accedder
	 * @return le modele contenant les objets a afficher
	 */
	public DefaultListModel getModel()
	{
		return model;
	}
	
	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ xmiId.
	 * @return La valeur du champ xmiId.
	 */
	public int getXmiId()
	{
		if(xmiId == -1)
		{
			xmiId = getHigherId();
		}
		++xmiId;
		return xmiId;
	}
	
	/*_______________________________________________________*/
	/** Retourne l'identifiant le plus eleve trouve dans les elements ownedMember de Model
	 * @return L'identifiant le plus eleve trouve dans les elements ownedMember de Model
	 */
	private int getHigherId()
	{
		int id = 0;
		for(PackageableElement pe : xmiModel.getOwnedMember())
		{
			try
			{
				if(Integer.parseInt(pe.getId()) > id)
				{
					id = Integer.parseInt(pe.getId());
				}
			}
			catch(NumberFormatException e) {}
		}
		return id;
	}
	
	/*_______________________________________________________*/
	/** Ajoute un type (element XMI ownedMember) a la liste de types de la classe de stockage de l'element XMI model
	 * @param id L'identifiant du type
	 * @param value La valeur du type
	 */
	public void addType(String id, String value)
	{
		PackageableElement pe = new PackageableElementImpl();
		pe.setId(id);
		pe.setName(value);
		pe.setType("uml:DataType");
		xmiModel.getOwnedMember().add(pe);
	}
	
	/*_______________________________________________________*/
	/** Met a jour la valeur d'un type
	 * @param id L'id du type
	 * @param value La valeur du type
	 */
	public void updateType(String id, String value)
	{
		for(PackageableElement pe : xmiModel.getOwnedMember())
		{
			if(pe.getId().equals(id))
			{
				pe.setName(value);
			}
		}
	}
	
	/*_______________________________________________________*/
	/** Supprime un type
	 * @param id L'id du type
	 */
	public void removeType(String id)
	{
		for(PackageableElement pe : xmiModel.getOwnedMember())
		{
			if(pe.getId().equals(id))
			{
				xmiModel.getOwnedMember().remove(pe);
			}
		}
	}
	
	/*_______________________________________________________*/
	/** Retourne le type Java correspondant au JType passe en parametre
	 * @param jtype Le JType utilise pour chercher le type Java
	 * @return Le type Java correspondant.
	 */
	public String getTypeFromJtype(JType jtype)
	{
		if(jtype == null)
		{
			return "";
		}
		if(jtype.getType().equals("uml:Class"))
		{
			return getTypeFromId(jtype.getIdref());
		}
		else if(jtype.getType().equals("uml:PrimitiveType"))
		{
			return jtype.getHref().split("#")[1];
		}
		return "";
	}
	
	/*_______________________________________________________*/
	/** Retourne la valeur d'un type dont l'id est passe en parametre
	 * @param id L'id tu type
	 * @return La valeur du type
	 */
	public String getTypeFromId(String id)
	{
		for(PackageableElement pe : xmiModel.getOwnedMember())
		{
			if(pe.getId().equals(id))
			{
				return pe.getName();
			}
		}
		for(PackagedElement pe : xmiModel.getPackagedElement().get(0).getPackagedElement())
		{
			if(pe.getId().equals(id))
			{
				return pe.getName();
			}
		}
		return "";
	}
	
	public OwnedAttribute getOwnedAttributeFromId(String packagedElementId, String ownedAttributeId)
	{
		for(int i = 0; i < model.getSize(); ++i)
		{
			Object o = model.get(i);
			if(o instanceof PackagedElementComponent && ((PackagedElementComponent)o).getPackagedElement().getId().equals(packagedElementId))
			{
				{
					for(OwnedAttribute oa : ((PackagedElementComponent)o).getPackagedElement().getOwnedAttribute())
					{
						if(oa.getId().equals(ownedAttributeId))
						{
							return oa;
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Ajoute au fur et a mesure de la lecture de l'arbre parse 
	 * les Classes lues et leurs attributs dans le Modele
	 * @param object Objet a ajouter dans la liste
	 * @param profondeur dans l'arbre, inutile ici (aucune indentation)
	 */
	public void modeliser(EObject object, int profondeur) 
	{
		if (object.getClass().getSimpleName().equals("PackagedElementImpl"))
		{
			if(((PackagedElement)object).getType().equals("uml:Class"))
			{
				PackagedElementComponent pec = new PackagedElementComponent((PackagedElement)object);
				model.add(model.getSize(), pec);
				
				if (((PackagedElement)object).getGeneralization().size() > 0)
				{
					UMLRelations.add((PackagedElement)object);
				}
			}
			else if(!((PackagedElement)object).getType().equals("uml:Class") && !((PackagedElement)object).getType().equals("uml:Package"))
			{
				UMLRelations.add((PackagedElement)object);
			}
		}
		else if(object.getClass().getSimpleName().equals("ModelImpl"))
		{
			xmiModel = (Model)object;
		}
	}
	
	/*_______________________________________________________*/
	/** Constructeur
	 */
	public TreeManager()
	{
		primitiveTypes.add("byte");
		primitiveTypes.add("short");
		primitiveTypes.add("int");
		primitiveTypes.add("float");
		primitiveTypes.add("double");
		primitiveTypes.add("char");
		primitiveTypes.add("byte");
		primitiveTypes.add("boolean");
	}
}
