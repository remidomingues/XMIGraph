/*_______________________________________________________*/
/**
 * Fichier : UMLTransferableElement.java
 *
 * Créé le 5 févr. 2012 à 11:24:48
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package dragAndDrop;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

import modelisation.PackagedElementComponent;


/*_______________________________________________________*/
/** Classe UMLTransferableElement, dérive de Transferable.
 * Contient la valeur de l'objet source afin de la restituer a l'objet destination.
 */
public class UMLTransferableElement implements Transferable
{
		/** Objet utilise pour l'identification des types contenus par l'instance courante. */
		public static DataFlavor dataFlavor;
		
		/** Objet a transferer. */
		private PackagedElementComponent packagedElementComponent;
		
		/*_______________________________________________________*/
		/** Constructeur de la classe UMLTransferableElement
		 * @param pec Le PackagedElementComponent a stocker.
		 */
		public UMLTransferableElement(PackagedElementComponent pec)
		{
			String mimeType = DataFlavor.javaJVMLocalObjectMimeType  + ";class=" + PackagedElementComponent.class.getName();
			try
			{
				dataFlavor = new DataFlavor(mimeType);
				packagedElementComponent = pec;
			}
			catch (ClassNotFoundException e)
			{
				System.err.println("Gestionnaire Drag and drop : La classe specifiee est introuvable.");
			}
		}
		

		/*_______________________________________________________*/
		/** Retourne un tableau de DataFlavor contenant les types disponibles pour le transfert de donnees gere par l'instance courante.
		 * @return Le tableau de DataFlavor contenant l'attribut dataFlavor (qui contient l'identifiant du type UMLGraphicalElement) et un DataFlavor contenant l'identifiant du type String.
		 * @see java.awt.datatransfer.Transferable#getTransferDataFlavors()
		 */
		public DataFlavor[] getTransferDataFlavors()
		{
			return new DataFlavor[] {dataFlavor, DataFlavor.stringFlavor};
		}

		/*_______________________________________________________*/
		/** Retourne un booleen permettant d'indiquer si le DataFlavor passe en parametre est supporte par l'instance courante.
		 * @param df Le DataFlavor a verifier.
		 * @return True si le DataFlavor est supporte, false sinon.
		 * @see java.awt.datatransfer.Transferable#isDataFlavorSupported(java.awt.datatransfer.DataFlavor)
		 */
		public boolean isDataFlavorSupported(DataFlavor df)
		{
			return (df.equals(dataFlavor) || df.equals(DataFlavor.stringFlavor));
		}
		
		/*_______________________________________________________*/
		/** Retourne l'objet source ou sa description.
		 * @param df Permet d'indiquer si la valeur de retour souhaitee est un objet de type UmlGraphicalElement ou bien une chaine de caractere.
		 * @return L'objet source de type UmlGraphicalElement, ou la description obtenue par le toString() de celui-ci.
		 * @see java.awt.datatransfer.Transferable#getTransferData(java.awt.datatransfer.DataFlavor)
		 */
		public Object getTransferData(DataFlavor df)
		{
			if (df == null)
			{
				System.err.println("Gestionnaire Drag and drop : Le format de donnees souhaite pour le transfert est inconnu.");
			}
			if (df.equals(dataFlavor))
			{
				return packagedElementComponent;
			}
			if (df.equals(DataFlavor.stringFlavor))
			{
				return packagedElementComponent.toString();
			}
			else
			{
				System.err.println("Gestionnaire Drag and drop : Le transfert de donnees vers le composant destination a echoue.");
			}
			return null;
		}
}

/*_______________________________________________________*/
/* Fin du ficher TransferableExampl.java
/*_______________________________________________________*/