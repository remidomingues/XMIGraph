/*_______________________________________________________*/
/**
 * Fichier : RenduListe.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */
package presentation;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.ListCellRenderer;

import modelisation.PackagedElementComponent;

/*_______________________________________________________*/
/** Classe ClassListCellRenderer, herite de JLabel et implemente ListCellRenderer
 * Cette classe gère l'affichage des donnees presentees par la JList de l'interface graphique.
 */
public class RenduListe extends PackagedElementComponent implements ListCellRenderer
{
	/** Generated serial version ID */
	private static final long serialVersionUID = -2137902933575513834L;

	/*_______________________________________________________*/
	/** Methode retournant le composant de la liste mis en forme.
	 * @param list La JList contenant le composant.
	 * @param value L'objet issu du modele dont il faut afficher l'attribut name si c'est un packagedElement de type uml:Class
	 * @param index L'index de cet objet dans le modele, correspondant a l'element de la liste ayant le focus.
	 * @param isSelected True si l'element correspondant a l'index est selectionne.
	 * @param cellHasFocus True si l'element correspondant a l'index a le focus.
	 * @return Le composant mis en forme.
	 * @see javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList, java.lang.Object, int, boolean, boolean)
	 */
	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
	{
		if(value.getClass().getSimpleName().equals("PackagedElementComponent") && ((PackagedElementComponent)value).getPackagedElement().getType().equals("uml:Class"))
		{
			this.setText(((PackagedElementComponent)value).toString());
			this.setPreferredSize(new Dimension(255, 15));
			if(isSelected)
			{
				this.setOpaque(true);
				this.setForeground(Color.RED);
				this.setBackground(new Color(212, 226, 255));
			}
			else
			{
				this.setForeground(Color.BLACK);
				this.setBackground(Color.WHITE);
			}
		}
		else
		{
			this.setText("UnknownElement");
		}
		return this;
	}
	
	/*_______________________________________________________*/
	/** Constructeur de la classe ClassListCellRenderer.
	 */
	public RenduListe()
	{
		super();
	}
	
}
