/*_______________________________________________________*/
/**
 * Fichier : ParcoursProfondeur.java
 *
 * Créé le 6 janv. 2012 à 10:33:21
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */
package application;

import java.util.ArrayList;


import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

/*_______________________________________________________*/
/**
 * Fichier : RechercheProfondeur.java
 *
 * Créé le 6 janv. 2012 à 10:33:21
 *
 * Auteurs : XMIGraph : Beaulaton Delphine, Domingues Remi, Plan Michael, Pourcher-Portalier Adrien
 */

/*_______________________________________________________*/
/** Classe ParcoursProfondeur, permet d'effectuer le parcours en profondeur d'un arbre et de modeliser son contenu selon une strategie de modelisation.
 */
public class ParcoursProfondeur 
{
	/** Gestion de l'arbre. */
	private TreeManager treeManager;
	
	/** Historique des objets visites dans l'arbre recu. */
	private ArrayList<EObject> histo = new ArrayList<EObject>();
	
	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ modeliser.
	 * @return La valeur du champ modeliser.
	 */
	public TreeManager getTreeManager()
	{
		return treeManager;
	}

	/*_______________________________________________________*/
	/** Constructeur de la classe ParcoursProfondeur.
	 */
	public ParcoursProfondeur()
	{
		treeManager = new TreeManager();
	}
	
	/*_______________________________________________________*/
	/** Permet de parcourir en profondeur l'objet passe en parametre, afin d'appliquer une fonction de modelisation sur chacun des objets rencontres dans celui-ci.
	 * @param object L'objet a parcourir.
	 * @param profondeur Le degre de profondeur (utilise pour l'affichage de l'arbre).
	 */
	public void parcourir (EObject object, int profondeur)
	{
		//Ajout de l'objet courant a l'historique
		histo.add(object);
		//Appel d'une fonction d'affichage de l'element.
		treeManager.modeliser(object, profondeur);
		TreeIterator<EObject> fils = object.eAllContents();
		while (fils != null && fils.hasNext()) //On parcours la totalité des fils de l'element courant.
		{
			
			EObject current = fils.next();
			//Verification de l'abscence de l'objet dans l'historique.
			if (!histo.contains(current))
			{
				//Appel recursif de la fonction sur le fils.
				parcourir(current, profondeur + 1);
			}
		}
	}
}
