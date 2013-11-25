/*_______________________________________________________*/
/**
 * Fichier : PackagedElementComponent.java
 *
 * Créé le 6 févr. 2012 à 21:52:36
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;

import javax.swing.JLabel;
import org.eclipse.uml2._1._0._0.uml.PackagedElement;

/*_______________________________________________________*/
/** Composant graphique derivant de JLabel et contenant un PackagedElement en attribut.
 */
public class PackagedElementComponent extends JLabel
{
	/** Generated serial ID */
	private static final long serialVersionUID = 1381435713026885992L;
	
	/** PackagedElement source. */
	private PackagedElement packagedElement;
	
	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ packagedElement.
	 * @return La valeur du champ packagedElement.
	 */
	public PackagedElement getPackagedElement()
	{
		return packagedElement;
	}

	/*_______________________________________________________*/
	/** Constructeur.
	 * @param p PackagedElement source.
	 */
	public PackagedElementComponent(PackagedElement p)
	{
		super();
		packagedElement = p;
	}
	
	/*_______________________________________________________*/
	/** Constructeur sans arguments.
	 */
	public PackagedElementComponent()
	{
		super();
	}
	
	/*_______________________________________________________*/
	/** Retourne le nom du PackagedElement
	 * @return Le nom du PackagedElement
	 * @see java.awt.Component#toString()
	 */
	@Override
	public String toString()
	{
		return packagedElement.getName();
	}
}

/*_______________________________________________________*/
/* Fin du ficher PackagedElementComponent.java
/*_______________________________________________________*/