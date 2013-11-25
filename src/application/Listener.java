/*_______________________________________________________*/
/**
 * Fichier : Listener.java
 *
 * Créé le 8 mars 2012 à 19:56:55
 *
 * Auteur : inter.getXmigraph() Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package application;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import modelisation.AttributeComponent;
import modelisation.ClassLayer;

import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.VisibilityKind;

import presentation.AttributePropertyDialog;
import presentation.Help;
import presentation.Interface;
import presentation.OperationPropertyDialog;
import presentation.Interface.MoveSource;
import dragAndDrop.UMLDropTarget;
import exportation.Export;
import exportation.ExportPDF;
import exportation.ExportPNG;

/*_______________________________________________________*/
/** Listener ecoutant les composants de l'interface et effectuant les traitements adequats.
 */
public class Listener implements ActionListener, MouseListener, MouseMotionListener, KeyListener, ChangeListener, ComponentListener, DocumentListener
{
	/** Interface dont les composants sont abonnees a l'instance courante */
	private Interface inter;
	
	/*_______________________________________________________*/
	/** Constructeur
	 * @param i Interface a ecouter
	 */
	public Listener(Interface i)
	{
		inter = i;
	}
	
	/*_______________________________________________________*/
	/** Execute les actions en fonction des JMenuItem invoques
	 * @param e Le composant source.
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
			//Cas de la fermeture de la fenetre
			if (e.getSource() == inter.getMn_exit())
			{
				inter.dispose();
			}
			
			else if(inter.getBt_modelisation().contains(e.getSource()))
			{
				int i = inter.getBt_modelisation().indexOf(e.getSource());
				inter.deleteTab(i);
			}
	
			else if (e.getSource() == inter.getMn_supprimer())
			{
				inter.deleteTab(inter.getTp_modelisation().getSelectedIndex());
			}
			
			else if (e.getSource() == inter.getMn_supprimerTous())
			{
				inter.deleteAllTabs();
			}
			
			else if (e.getSource() == inter.getMn_ajouter())
			{
				inter.addTab();
			}
			//Cas d'export d'un fichier XMI en PDF a partir du menu courant
			else if (e.getSource() == inter.getMn_PDF())
			{
				if (inter.getXmigraph() == null)
				{
					System.err.println("Vous devez importer un fichier XMI avant de pouvoir l'exporter.");
				}
				else
				{
					Export ex = new ExportPDF();
					System.out.println("Export en cours...");
					ex.export(inter.getLastIf_modelisation());
					System.out.println("Export terminé.");
					inter.getLastIf_modelisation().requestFocus();
				}
			}
			//Cas d'export d'un fichier XMI en PNG a partir du menu courant
			else if (e.getSource() == inter.getMn_image())
			{
				if (inter.getXmigraph() == null)
				{
					System.err.println("Vous devez importer un fichier XMI avant de pouvoir l'exporter.");
				}
				else
				{
					Export ex = new ExportPNG();
					System.out.println("Export en cours...");
					ex.export(inter.getLastIf_modelisation());
					System.out.println("Export terminé.");
					inter.getLastIf_modelisation().requestFocus();
				}
			}
			//Si on veut modifier la visibilite de la classe
			else if(e.getSource() instanceof JRadioButton)
			{
				if(e.getSource() == inter.getRb_package())
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setVisibility(VisibilityKind.PACKAGE);
				if(e.getSource() == inter.getRb_private())
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setVisibility(VisibilityKind.PRIVATE);
				if(e.getSource() == inter.getRb_protected())
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setVisibility(VisibilityKind.PROTECTED);
				if(e.getSource() == inter.getRb_public())
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setVisibility(VisibilityKind.PUBLIC);
			}
			//Si on veut modifier les proprietes abstract ou static
			else if(e.getSource() instanceof JCheckBox)
			{
				if(e.getSource() == inter.getCb_abstract())
				{
					if(inter.getCb_abstract().isSelected())
					{
						inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setIsAbstract(true);
					}
					else
					{
						inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setIsAbstract(false);
					}
					inter.updateAllRepresentations(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData());
				}
			}
			
			//Si on veut modifier la visibilite de la classe
			else if(e.getSource() instanceof JRadioButton)
			{
				if(e.getSource() == inter.getRb_package())
				{
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setVisibility(VisibilityKind.PACKAGE);
				}
				if(e.getSource() == inter.getRb_private())
				{
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setVisibility(VisibilityKind.PRIVATE);
				}
				if(e.getSource() == inter.getRb_protected())
				{
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setVisibility(VisibilityKind.PROTECTED);
				}
				if(e.getSource() == inter.getRb_public())
				{
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setVisibility(VisibilityKind.PUBLIC);
					inter.updateAllRepresentations(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData());
				}
			}
			//Si on veut modifier les proprietes abstract ou static
			else if(e.getSource() instanceof JCheckBox)
			{
				if(e.getSource() == inter.getCb_abstract())
				{
					if(inter.getCb_abstract().isSelected())
					{
						inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setIsAbstract(true);
					}
					else
					{
						inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setIsAbstract(false);
					}
				}
				inter.updateAllRepresentations(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData());	
			}
			else if (e.getSource() instanceof JButton)
			{
				if (e.getSource() == inter.getBt_addAttribute())
				{
					AttributePropertyDialog apf = new AttributePropertyDialog(inter);
					((JComponent)inter.getMyGlassPane()).removeAll();
					inter.getMyGlassPane().repaint();
					((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
					inter.getLastIf_modelisation().requestFocus();
				}
				if (e.getSource() == inter.getBt_addMethod())
				{
					OperationPropertyDialog apf = new OperationPropertyDialog(inter);
					((JComponent)inter.getMyGlassPane()).removeAll();
					inter.getMyGlassPane().repaint();
					((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
					inter.getLastIf_modelisation().requestFocus();
				}
				if (e.getSource() == inter.getBt_modifyAttribute())
				{
					if(inter.getCb_attributs().getItemCount() > 0)
					{
						AttributePropertyDialog apf = new AttributePropertyDialog(
								(OwnedAttribute)inter.getXmigraph().getParcoursProfondeur().getTreeManager().getOwnedAttributeFromId(
								inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getId(), 
								((AttributeComponent)inter.getCb_attributs().getSelectedItem()).getId()), inter);
						//inter.getCb_attributs().setSelectedItem(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedAttribute().get(inter.getCb_attributs().getSelectedIndex()).getName());
						((JComponent)inter.getMyGlassPane()).removeAll();
						inter.getMyGlassPane().repaint();
						((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
						inter.getLastIf_modelisation().requestFocus();
					}
				}
				if (e.getSource() == inter.getBt_modifyMethod())
				{
					if(inter.getCb_methodes().getItemCount() > 0)
					{
						OperationPropertyDialog opf = new OperationPropertyDialog(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedOperation().get(inter.getCb_methodes().getSelectedIndex()), inter);
						inter.getCb_methodes().setSelectedItem(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedOperation().get(inter.getCb_methodes().getSelectedIndex()).getName());
						((JComponent)inter.getMyGlassPane()).removeAll();
						inter.getMyGlassPane().repaint();
						((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
						inter.getLastIf_modelisation().requestFocus();
				}
					}
				if (e.getSource() == inter.getBt_deleteAttribute() && inter.getCb_attributs().getSelectedIndex() != -1)
				{
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedAttribute().remove(
							inter.getXmigraph().getParcoursProfondeur().getTreeManager().getOwnedAttributeFromId(
									inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getId(), 
									((AttributeComponent)inter.getCb_attributs().getSelectedItem()).getId()));
					inter.updateAllRepresentations(inter.getCb_attributes().getSelectedItem());
					((JComponent)inter.getMyGlassPane()).removeAll();
					inter.getMyGlassPane().repaint();
					((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
				}
				if (e.getSource() == inter.getBt_deleteMethod() && inter.getCb_methodes().getSelectedIndex() != -1)
				{
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedOperation().remove(inter.getCb_methodes().getSelectedIndex());
					inter.updateAllRepresentations(inter.getSelectedClassLayers().get(0).getClassComponent().getListMethod().get(inter.getCb_methodes().getSelectedIndex()));
					((JComponent)inter.getMyGlassPane()).removeAll();
					inter.getMyGlassPane().repaint();
					((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
				}
			}
			//Cas d'import d'un fichier XMI
			else if(e.getSource() == inter.getMn_import())
			{
				inter.importXmiFile();
				inter.getLastIf_modelisation().requestFocus();
			}
			//Ouverture de la fenetre d'aide
			else if (e.getSource() == inter.getMn_accesAide())
			{
				new Help();
				inter.getLastIf_modelisation().requestFocus();
			}
		}
		catch(Exception e2)
		{
			System.err.println("Le traitement de l'action souhaitée a retouné une erreur.");
		}
	}
	
	/*_______________________________________________________*/
	/** Methode appelee lors d'un clic de souris.
	 * @param e MouseEvent source.
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent e)
	{
		try
		{
			if(e.getButton() == MouseEvent.BUTTON3 )
			{
				if(e.getSource() instanceof ClassLayer)
				{
					PointerInfo pointer = MouseInfo.getPointerInfo();
					inter.getClassContextMenu().show(e.getComponent(), pointer.getLocation().x - ((ClassLayer)e.getSource()).getLocationOnScreen().x, pointer.getLocation().y - ((ClassLayer)e.getSource()).getLocationOnScreen().y);
				}
				else if(e.getSource() == inter.getCb_attributes() && inter.getCb_attributes().getItemCount() > 0)
				{
					inter.getPropertyContextMenu().setAttributes(true);
					inter.getPropertyContextMenu().show(e.getComponent(), e.getX(), e.getY());
				}
				else if(e.getSource() == inter.getCb_methodes() && inter.getCb_methodes().getItemCount() > 0)
				{
					inter.getPropertyContextMenu().setAttributes(false);
					inter.getPropertyContextMenu().show(e.getComponent(), e.getX(), e.getY());
				}
			}
		}
		catch(Exception e2)
		{
			System.err.println("Le traitement de l'action souhaitée a retourné une erreur.");
		}
	}

	/*_______________________________________________________*/
	/** Non utilise.
	 * @param e MouseEvent source.
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent e) {}

	/*_______________________________________________________*/
	/** Non utilise.
	 * @param e MouseEvent source.
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent e) {}

	/*_______________________________________________________*/
	/** Methode appelee lors de l'enfoncement d'un bouton de la souris
	 * @param e MouseEvent source.
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent e) 
	{
		try
		{
			if(e.getButton() == MouseEvent.BUTTON3)
			{
				inter.setRightClicPressed(true);
			}
			if (e.getSource() instanceof ClassLayer && inter.isCtrlPressed())
			{
				//Deselection de l'element source
				if(inter.getSelectedClassLayers().contains(e.getSource()))
				{
					((ClassLayer)e.getSource()).setBackground(new Color(255, 255, 185));
					inter.getSelectedClassLayers().remove(e.getSource());
					((JComponent)inter.getMyGlassPane()).removeAll();
					inter.getMyGlassPane().repaint();
					((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
				}
				//Selection de l'element source
				else
				{
					inter.setClassLayerSelected((ClassLayer)e.getSource());
				}
			}
			else if((e.getSource() instanceof ClassLayer) && !inter.isCtrlPressed())
			{
				if(!inter.getSelectedClassLayers().contains(e.getSource()) || !inter.isRightClicPressed())
				{
					//Deselection de tous les elements selectionnes
					for(ClassLayer classLayer : inter.getSelectedClassLayers())
					{
						classLayer.setBackground(new Color(255, 255, 185));
					}
					inter.getSelectedClassLayers().removeAll(inter.getSelectedClassLayers());
					((JComponent)inter.getMyGlassPane()).removeAll();
					inter.getMyGlassPane().repaint();
					((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
					//Selection de l'element source
					inter.setClassLayerSelected((ClassLayer)e.getSource());
				}
			}
			if(e.getSource() instanceof ClassLayer)
			{
				inter.propertiesImpl();
			}
		}
		catch(Exception e2)
		{
			System.err.println("Le traitement de l'action souhaitée a retourné une erreur.");
		}
	}

	/*_______________________________________________________*/
	/** Methode appelee lors du relachement d'un bouton de la souris
	 * @param e MouseEvent source.
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent e)
	{
		try
		{
			if(e.getButton() == MouseEvent.BUTTON3)
			{
				inter.setRightClicPressed(false);
			}
			if(!(e.getSource() instanceof ClassLayer) && !inter.isCtrlPressed() && !inter.isMouseDragged()  && e.getSource() != inter.getCb_attributes() && e.getSource() != inter.getCb_methodes() && e.getSource() != inter.getPl_properties())
			{
				for(ClassLayer classLayer : inter.getSelectedClassLayers())
				{
					classLayer.setBackground(new Color(255, 255, 185));
				}
				inter.getSelectedClassLayers().removeAll(inter.getSelectedClassLayers());
				((JComponent)inter.getMyGlassPane()).removeAll();
				inter.getMyGlassPane().repaint();
				if(inter.getXmigraph() != null)
				{
					((UMLDropTarget)inter.getLastIf_modelisation().getDropTarget()).findRelations();
				}
				inter.disablePropertiesPanel();
			}
			inter.setMouseDragged(false);
		}
		catch(Exception e2)
		{
			System.err.println("Le traitement de l'action souhaitée a retourné une erreur.");
		}
	}

	/*_______________________________________________________*/
	/** Fonction appelee lors du deplacement de la souris avec un bouton enfonce
	 * @param e MouseEvent source
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseDragged(MouseEvent e) 
	{
			inter.setMouseDragged(true);
			if(inter.getSelectedClassLayers().size() != 0 && e.getSource() instanceof ClassLayer)
			{
				inter.moveClassLayers(MoveSource.mouse);
			}
	}

	/*_______________________________________________________*/
	/** Non utilisee
	 * @param arg0 Non utilise
	 * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseMoved(MouseEvent arg0) {}

	/*_______________________________________________________*/
	/** Methode appelee lors de l'enfoncement d'une touche.
	 * @param e Non utilise
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e)
	{
		try
		{
			//Suppression de la representation graphique
			if(e.getKeyCode() == KeyEvent.VK_DELETE && inter.getSelectedClassLayers().size() != 0)
			{
				//Suppression du modele
				if(inter.isCtrlPressed())
				{
					inter.deleteFromModelAndRepresentation();
				}
				else
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
					inter.getSp_modelisation().get(inter.getTp_modelisation().getSelectedIndex()).getViewport().repaint();
					inter.disablePropertiesPanel();
				}
			}
			else if(e.getKeyCode() == KeyEvent.VK_CONTROL)
			{
				inter.setCtrlPressed(true);
			}
			else if(e.getKeyCode() == KeyEvent.VK_SHIFT)
			{
				inter.setShiftPressed(true);
			}
			else if(e.getKeyCode() == KeyEvent.VK_A && inter.isCtrlPressed())
			{
				for(Component c : inter.getLastIfContentPane_modelisation().getComponents())
				{
					if(c instanceof ClassLayer)
					{
						inter.setClassLayerSelected((ClassLayer)c);
					}
				}
			}
			else if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				inter.moveClassLayers(MoveSource.up);
			}
			else if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				inter.moveClassLayers(MoveSource.down);
			}
			else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				inter.moveClassLayers(MoveSource.right);
			}
			else if(e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				inter.moveClassLayers(MoveSource.left);
			}
			else if(e.getKeyCode() == KeyEvent.VK_T && inter.isCtrlPressed())
			{
					inter.addTab();
			}
			else if(e.getKeyCode() == KeyEvent.VK_F4 && !inter.getTf_nom().hasFocus() && inter.isCtrlPressed())
			{
				if(inter.isShiftPressed())
				{
					inter.deleteAllTabs();
				}
				else
				{
					inter.deleteTab(inter.getTp_modelisation().getSelectedIndex());
				}
			}
			else if(e.getKeyCode() == KeyEvent.VK_N && !inter.getTf_nom().hasFocus() && inter.isCtrlPressed())
			{
				inter.importXmiFile();
				inter.setCtrlPressed(false);
			}
			else if(e.getKeyCode() == KeyEvent.VK_1 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 1)
			{
				inter.getTp_modelisation().setSelectedIndex(0);
			}
			else if(e.getKeyCode() == KeyEvent.VK_2 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 2)
			{
				inter.getTp_modelisation().setSelectedIndex(1);
			}
			else if(e.getKeyCode() == KeyEvent.VK_3 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 3)
			{
				inter.getTp_modelisation().setSelectedIndex(2);
			}
			else if(e.getKeyCode() == KeyEvent.VK_4 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 4)
			{
				inter.getTp_modelisation().setSelectedIndex(3);
			}
			else if(e.getKeyCode() == KeyEvent.VK_5 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 5)
			{
				inter.getTp_modelisation().setSelectedIndex(4);
			}
			else if(e.getKeyCode() == KeyEvent.VK_6 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 6)
			{
				inter.getTp_modelisation().setSelectedIndex(5);
			}
			else if(e.getKeyCode() == KeyEvent.VK_7 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 7)
			{
				inter.getTp_modelisation().setSelectedIndex(6);
			}
			else if(e.getKeyCode() == KeyEvent.VK_8 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 8)
			{
				inter.getTp_modelisation().setSelectedIndex(7);
			}
			else if(e.getKeyCode() == KeyEvent.VK_9 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 9)
			{
				inter.getTp_modelisation().setSelectedIndex(8);
			}
			else if(e.getKeyCode() == KeyEvent.VK_0 && !inter.getTf_nom().hasFocus() && inter.getSp_modelisation().size() >= 10)
			{
				inter.getTp_modelisation().setSelectedIndex(9);
			}
			else if(e.getKeyCode() == KeyEvent.VK_F&& !inter.getTf_nom().hasFocus() && inter.isCtrlPressed())
			{
				inter.getTp_onglets().setSelectedIndex(0);
			}
			else if(e.getKeyCode() == KeyEvent.VK_E && !inter.getTf_nom().hasFocus() && inter.isCtrlPressed())
			{
				inter.getTp_onglets().setSelectedIndex(1);
			}
		}
		catch(Exception e2)
		{
			System.err.println("Le traitement de l'action souhaitée a retourné une erreur.");
		}
	}

	/*_______________________________________________________*/
	/** Met a jour des booleens permettant d'indiquer si certaines touches sont actives ou non
	 * @param e Non utilise
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_CONTROL)
		{
			inter.setCtrlPressed(false);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SHIFT)
		{
			inter.setShiftPressed(false);
		}
	}

	/*_______________________________________________________*/
	/** Modifie le nom de tous les ClassLayer et de l'objet du model correspondants, lorsqu'une touche a ete tapee
	 * @param e Non utilise
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) 
	{
		try
		{
			if(inter.getTf_nom().hasFocus())
			 {
				inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().setName(inter.getTf_nom().getText().trim() + e.getKeyChar());
				inter.updateAllRepresentations(inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData());
			 }	
		}
		catch(Exception e2)
		{
			System.err.println("La mise à jour des propriétés de la classe sélectionnée a retournée une erreur.");
		}
	}
	
	/*_______________________________________________________*/
	/** Permet la gestion de la couleur des onglets lors d'un changement sur le JTabbedPane les contenant
	 * @param e Non utilise
	 * @see javax.swing.event.ChangeListener#stateChanged(javax.swing.event.ChangeEvent)
	 */
	@Override
	public void stateChanged(ChangeEvent e)
	{
		if(e.getSource().equals(inter.getTp_modelisation()) && inter.getTp_modelisation().getSelectedIndex() != -1 && inter.getTp_modelisation().getTabComponentAt(inter.getTp_modelisation().getSelectedIndex()) != null)
		{
			inter.configureTabsColor();
		}
		else if(e.getSource().equals(inter.getTp_onglets()))
		{
			if((((JTabbedPane)e.getSource()).getBackgroundAt(((JTabbedPane)e.getSource()).getSelectedIndex()).equals(new Color(255, 255, 255))))
			{
				((JTabbedPane)e.getSource()).setBackgroundAt(((JTabbedPane)e.getSource()).getSelectedIndex(), new Color(238, 238, 238));
			}
		}
	}

	/*_______________________________________________________*/
	/** Non utilisee
	 * @param arg0 Non utilise
	 * @see java.awt.event.ComponentListener#componentHidden(java.awt.event.ComponentEvent)
	 */
	@Override
	public void componentHidden(ComponentEvent arg0) {}

	/*_______________________________________________________*/
	/** Non utilisee
	 * @param arg0 Non utilise
	 * @see java.awt.event.ComponentListener#componentMoved(java.awt.event.ComponentEvent)
	 */
	@Override
	public void componentMoved(ComponentEvent arg0) {}
	
	/*_______________________________________________________*/
	/** Methode appelee lorsque la JFrame presente est redimensionnee.
	 * @param e Non utilise
	 * @see java.awt.event.ComponentListener#componentResized(java.awt.event.ComponentEvent)
	 */
	@Override
	public void componentResized(ComponentEvent e)
	{
		try
		{
			inter.getVerticalRightSplit().setDividerLocation((int)(inter.getSize().height/2.25));
			inter.getVerticalLeftSplit().setDividerLocation((int)(inter.getSize().height/1.6));
			inter.getHorizontalSplit().setDividerLocation((int)(inter.getSize().width/1.35));
		}
		catch(Exception e2)
		{
			System.err.println("Le redimensionnement des composants de l'interface a retourné une erreur.");
		}
	}

	/*_______________________________________________________*/
	/** Non utilisee
	 * @param arg0 Non utilise
	 * @see java.awt.event.ComponentListener#componentShown(java.awt.event.ComponentEvent)
	 */
	@Override
	public void componentShown(ComponentEvent arg0) {}

	/*_______________________________________________________*/
	/** 
	 * @param arg0
	 * @see javax.swing.event.DocumentListener#changedUpdate(javax.swing.event.DocumentEvent)
	 */
	@Override
	public void changedUpdate(DocumentEvent arg0) {}

	/*_______________________________________________________*/
	/** 
	 * @param e
	 * @see javax.swing.event.DocumentListener#insertUpdate(javax.swing.event.DocumentEvent)
	 */
	@Override
	public void insertUpdate(DocumentEvent e)
	{
		try
		{
			if(e.getDocument().equals(inter.getTa_errorConsole().getDocument()) && inter.getTp_onglets().getSelectedIndex() != 1)
			{
				inter.getTp_onglets().setBackgroundAt(1, new Color(255, 255, 255));
			}
			else if(e.getDocument().equals(inter.getTa_outputConsole().getDocument()) && inter.getTp_onglets().getSelectedIndex() != 0)
			{
				inter.getTp_onglets().setBackgroundAt(0, new Color(255, 255, 255));
			}
		}
		catch(Exception e2)
		{
			System.err.println("La notification d'arrivée d'un message dans un onglet de la console a retourné une erreur.");
		}
	}

	/*_______________________________________________________*/
	/** 
	 * @param arg0
	 * @see javax.swing.event.DocumentListener#removeUpdate(javax.swing.event.DocumentEvent)
	 */
	@Override
	public void removeUpdate(DocumentEvent arg0) {}
}

/*_______________________________________________________*/
/* Fin du ficher Listener.java
/*_______________________________________________________*/