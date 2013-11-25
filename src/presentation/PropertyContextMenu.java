/*_______________________________________________________*/
/**
 * Fichier : PropertyContextMenu.java
 *
 * Créé le 14 févr. 2012 à 14:58:22
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package presentation;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import modelisation.AttributeComponent;
import modelisation.ClassLayer;
import modelisation.MethodComponent;

/*_______________________________________________________*/
/** Menu contextuel apparaissant lors d'un clic droit de la souris sur un attribut ou une methode de la fenetre de proprietes
 */
public class PropertyContextMenu extends JPopupMenu implements ActionListener
{
	/** Generated serial version ID */
	private static final long serialVersionUID = 5911162736842319887L;
	
	/** Menu permettant de modifier l'element */
	private JMenuItem modify = new JMenuItem("Modifier");
	
	/** Menu permettant de supprimer l'element */
	private JMenuItem delete = new JMenuItem("Supprimer");
	
	/** Interface graphique */
	private Interface inter;
	
	/** true si le menu est lie a des attributs, false s'il est lie a des methodes */
	private boolean attributes;

	/*_______________________________________________________*/
	/** Modifie la valeur du champ attributes.
	 * @param attributes La valeur du champ attributes.
	 */
	public void setAttributes(boolean attributes)
	{
		this.attributes = attributes;
	}

	/*_______________________________________________________*/
    /** Constructeur
     * @param i L'interface appelante
     */
    public PropertyContextMenu(Interface i)
    {
        add(modify);
        add(delete);
        inter = i;
        modify.addActionListener(this);
        delete.addActionListener(this);
    }
    
    /*_______________________________________________________*/
	/** Met a jour toutes les representations graphiques de l'element courant.
	 * @param objComponent L'attribut ou la methode source
	 * @param delete true s'il faut supprimer l'objet, false s'il faut le modifier
	 */
	private void updateAllRepresentations(Object objComponent, boolean delete)
	{
		List<ClassLayer> list = new ArrayList<ClassLayer>();
		for(JScrollPane sp_model : inter.getSp_modelisation())
		{
			if(sp_model != null)
			{
				for(Component c : ((JInternalFrame)sp_model.getViewport().getComponent(0)).getContentPane().getComponents())
				{
					if(c instanceof ClassLayer && ((ClassLayer)c).getClassComponent().getPackageData().equals(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData()))
					{
						list.add((ClassLayer)c);
					}
				}
				for(ClassLayer c : list)
				{
					if(objComponent instanceof AttributeComponent)
					{
						c.getClassComponent().getListAttribute().remove(c.getClassComponent().getListAttribute().indexOf(objComponent));
						inter.getCb_attributs().removeItem(inter.getCb_attributs().getSelectedItem());
					}
					else if(objComponent instanceof MethodComponent)
					{
						c.getClassComponent().getListMethod().remove(c.getClassComponent().getListMethod().indexOf(objComponent));
						inter.getCb_methodes().removeItem(inter.getCb_methodes().getSelectedItem());
					}
				}
				sp_model.repaint();
			}
		}
	}

	/*_______________________________________________________*/
	/** Methode appelee lors du clic sur un attribut ou une methode
	 * @param e
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(attributes)
		{
			if(e.getSource() == modify)
			{
				AttributePropertyDialog apf = new AttributePropertyDialog(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedAttribute().get(inter.getCb_attributs().getSelectedIndex()), inter);
				inter.getCb_attributs().setSelectedItem(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedAttribute().get(inter.getCb_attributs().getSelectedIndex()).getName());
			}
			else if(e.getSource() == delete)
			{
				inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedAttribute().remove(inter.getCb_attributs().getSelectedIndex());
				updateAllRepresentations(inter.getSelectedClassLayers().get(0).getClassComponent().getListAttribute().get(inter.getCb_attributs().getSelectedIndex()), true);
			}
		}
		else
		{
			if(e.getSource() == modify)
			{
				OperationPropertyDialog opf = new OperationPropertyDialog(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedOperation().get(inter.getCb_methodes().getSelectedIndex()), inter);
				inter.getCb_methodes().setSelectedItem(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedOperation().get(inter.getCb_methodes().getSelectedIndex()).getName());
			}
			else if(e.getSource() == delete)
			{
				inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedOperation().remove(inter.getCb_methodes().getSelectedIndex());
				updateAllRepresentations(inter.getSelectedClassLayers().get(0).getClassComponent().getListMethod().get(inter.getCb_methodes().getSelectedIndex()), true);
			}
		}
	}
}

/*_______________________________________________________*/
/* Fin du ficher ContextMenu.java
/*_______________________________________________________*/