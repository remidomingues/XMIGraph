/*_______________________________________________________*/
/**
 * Fichier : UMLTransferHandler.java
 *
 * Créé le 5 févr. 2012 à 11:29:10
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package dragAndDrop;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.TransferHandler;

import modelisation.PackagedElementComponent;

/*_______________________________________________________*/
/** Classe UMLTransferHandler, dérive de TransferHandler.
 * Permet l'import de donnees entre un JComponent source et un Transferable destination et inversement.
 */
public class UMLTransferHandler extends TransferHandler
{
	/** Generated serial ID */
	private static final long serialVersionUID = 2397664149597169566L;

	/*_______________________________________________________*/
	/** Retourne un booleen indiquant si le composant passe en parametre peut ou non etre le composant de destination
	 * d'un objet de type UMLClassComponent ou String.
	 * @param component Le composant a tester.
	 * @param dataflavors Tableau de DataFlavor contenant le type des objets que l'on souhaite recevoir.
	 * @return True si le composant est adequat, false sinon.
	 * @see javax.swing.TransferHandler#canImport(javax.swing.JComponent, java.awt.datatransfer.DataFlavor[])
	 */
	public boolean canImport(JComponent component, DataFlavor[] dataflavors)
	{
		for (int i = 0; i < dataflavors.length; ++i)
		{
			if (dataflavors[i].equals(UMLTransferableElement.dataFlavor))
			{
				return true;
			}
			if (dataflavors[i].equals(DataFlavor.stringFlavor))
			{
				return true;
			}
		}
	return false;
	}
	
		/*_______________________________________________________*/
		/** Retourne un entier correspondant a la constante COPY_OR_MOVE.
		 * @param cp Le composant source.
		 * @return Un entier correspondant a la constante COPY_OR_MOVE.
		 * @see javax.swing.TransferHandler#getSourceActions(javax.swing.JComponent)
		 */
		public int getSourceActions(JComponent cp)
		{
			return COPY_OR_MOVE;
		}
	
	/*_______________________________________________________*/
	/** Retourne un objet de Type Transferable contenant les donnees du JComponent passe en parametre.
	 * @param component Le JComponent source.
	 * @return Le Transferable contenant les donnees du JComponent source.
	 * @see javax.swing.TransferHandler#createTransferable(javax.swing.JComponent)
	 */
	protected Transferable createTransferable(JComponent component)
	{
		if(component instanceof JList)
		{
			Object obj = ((JList)component).getSelectedValue();
			if(obj instanceof PackagedElementComponent)
			return new UMLTransferableElement((PackagedElementComponent)obj);
		}
		return null;
	}	
	
	/*_______________________________________________________*/
	/** Constructeur de la classe UMLTransferHandler.
	 * @param s Le nom de la propriete a transferer.
	 */
	public UMLTransferHandler(String s)
	{
		super(s);
	}
}

/*_______________________________________________________*/
/* Fin du ficher MyTransferHandler.java
/*_______________________________________________________*/