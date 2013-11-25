/*_______________________________________________________*/
/**
 * Fichier : ClassContextMenu.java
 *
 * Créé le 14 févr. 2012 à 14:58:22
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */
/*_______________________________________________________*/
/**
 * Fichier : Export.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import dragAndDrop.UMLDropTarget;

import modelisation.ClassLayer;

/*_______________________________________________________*/
/** Menu contextuel apparaissant lors d'un clic droit de la souris sur un panel contenant une classe.
 */
public class ClassContextMenu extends JPopupMenu implements ActionListener
{
	/** Generated serial version ID */
	private static final long serialVersionUID = 5911162736842319887L;
	
	/** Menu permettant d'ajouter un attribut a la classe */
	private JMenuItem addAttribute = new JMenuItem("Ajouter un attribut");
	
	/** Menu permettant d'ajouter une methode a la classe */
	private JMenuItem addMethod = new JMenuItem("Ajouter une methode");
	
	/** Menu permettant de supprimer la representation graphique */
	private JMenuItem deleteClassFromRepresentation = new JMenuItem("Supprimer la classe de la representation");
	
	/** Menu permettant de supprimer la classe du modele, ainsi que toutes ses representations */
	private JMenuItem deleteClassFromModel = new JMenuItem("Supprimer la classe du modele");
	
	/** Interface graphique */
	private Interface inter;

	/*_______________________________________________________*/
    /** Constructeur
     * @param i L'interface appelante
     */
    public ClassContextMenu(Interface i)
    {
        add(addAttribute);
        add(addMethod);
        add(deleteClassFromRepresentation);
        add(deleteClassFromModel);
        inter = i;
        addAttribute.addActionListener(this);
        addMethod.addActionListener(this);
        deleteClassFromModel.addActionListener(this);
        deleteClassFromRepresentation.addActionListener(this);
    }

	/*_______________________________________________________*/
	/** Methode appelee lors du clic sir
	 * @param e
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == addAttribute)
		{
			AttributePropertyDialog apf = new AttributePropertyDialog(inter);
		}
		else if(e.getSource() == addMethod)
		{
			OperationPropertyDialog apf = new OperationPropertyDialog(inter);
		}
		else if(e.getSource() == deleteClassFromModel)
		{
			inter.deleteFromModelAndRepresentation();
		}
		else if(e.getSource() == deleteClassFromRepresentation)
		{
			for(ClassLayer classLayer : inter.getSelectedClassLayers())
			{
				inter.getLastIfContentPane_modelisation().remove(classLayer);
				((JComponent)inter.getMyGlassPane()).removeAll();
				inter.getMyGlassPane().repaint();
				((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
			}
			inter.getSelectedClassLayers().removeAll(inter.getSelectedClassLayers());
			((JComponent)inter.getMyGlassPane()).removeAll();
			inter.getMyGlassPane().repaint();
			((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
			inter.getLastIf_modelisation().repaint();
		}
	}
}

/*_______________________________________________________*/
/* Fin du ficher ContextMenu.java
/*_______________________________________________________*/