/*_______________________________________________________*/
/**
 * Fichier : AttributePropertyDialog.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package presentation;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.VisibilityKind;
import org.eclipse.uml2._1._0._0.uml.impl.JTypeImpl;
import org.eclipse.uml2._1._0._0.uml.impl.OwnedAttributeImpl;

import modelisation.AttributeComponent;
import modelisation.ClassLayer;



/*_______________________________________________________*/
/** Classe permettant l'ajout et la modification d'attributs liees a un PackagedElement du modele.
 */
public class AttributePropertyDialog extends PropertyDialog implements ActionListener
{	
	/** Generated serial version ID */
	private static final long serialVersionUID = 1L;

	/** Affichage de isOrdered */
	private JCheckBox cb_isOrdered;
	
	/** Affichage de isReadOnly */
	private JCheckBox cb_isReadOnly;
	
	/** Affichage du Type de l'attribut */
	private JTextField tf_type;
	
	/** Bouton de Validation */
	private JButton bt_validate;
	
	/** ComboBox sur la visibilite */
	private JComboBox co_visibilite;

	/**	Interface utilise pour la gestion des types */
	private Interface inter;
	
	/** Attribut a modifier ou creer lie au modele */
	private OwnedAttribute localOwnedAttribute;
	
	/** JFrame utilisee pour l'affichage de boites de dialogue d'erreurs */
	private JFrame frame = new JFrame();

	/*_______________________________________________________*/
	/** Constructeur permettant de modifier un attribut
	 * @param attr L'attribut a modifier
	 * @param i L'interface appelante
	 */
	public AttributePropertyDialog(OwnedAttribute attr, Interface i)
	{
		super(i,"Propriete de " + attr.getName(),true);
		inter = i;
		localOwnedAttribute = attr;
		init();
	}
	
	/*_______________________________________________________*/
	/** Constructeur permettant de creer un attribut
	 * @param i L'interface appelante
	 */
	public AttributePropertyDialog(Interface i)
	{
		super(i,"Nouvel Attribut",true);
		inter = i;
		localOwnedAttribute = new OwnedAttributeImpl();
		init();
	}
	
	/*_______________________________________________________*/
	/** Initialise la fenetre et ses composants
	 */
	private void init()
	{
		pl_mainPanel = new JPanel();
		pl_mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		Layout = new GridLayout(4,2,5,5);
		pl_mainPanel.setLayout(Layout);
		pl_mainPanel.add(new JLabel("  Nom de l'attribut :  "));
		tf_name = new JTextField(localOwnedAttribute.getName());
		tf_name.setHorizontalAlignment(SwingConstants.CENTER);
		pl_mainPanel.add(tf_name);
		pl_mainPanel.add(new JLabel("  Type de l'attribut :  "));
		tf_type = new JTextField(inter.getXmigraph().getParcoursProfondeur().getTreeManager().getTypeFromJtype(localOwnedAttribute.getJType()));
		tf_type.setHorizontalAlignment(SwingConstants.CENTER);
		pl_mainPanel.add(tf_type);
		cb_isStatic = new JCheckBox("Statique ",localOwnedAttribute.isIsStatic());
		pl_mainPanel.add(cb_isStatic);
		cb_isOrdered = new JCheckBox("Ordonne ",localOwnedAttribute.isIsOrdered());
		pl_mainPanel.add(cb_isOrdered);
		cb_isReadOnly = new JCheckBox("Lecture Seule ",localOwnedAttribute.isIsReadOnly());
		pl_mainPanel.add(cb_isReadOnly);
		co_visibilite = new JComboBox();
		co_visibilite.setEditable(false);
		co_visibilite.insertItemAt("Public",0);
		co_visibilite.insertItemAt("Package",1);
		co_visibilite.insertItemAt("Protected",2);
		co_visibilite.insertItemAt("Private",3);
		if(localOwnedAttribute == null || localOwnedAttribute.getVisibility() == VisibilityKind.PRIVATE)
		{
			co_visibilite.setSelectedIndex(3);
		}
		else if(localOwnedAttribute.getVisibility() == VisibilityKind.PUBLIC)
		{
			co_visibilite.setSelectedIndex(0);
		}
		else if(localOwnedAttribute.getVisibility() == VisibilityKind.PACKAGE)
		{
			co_visibilite.setSelectedIndex(1);
		}
		else if(localOwnedAttribute.getVisibility() == VisibilityKind.PROTECTED)
		{
			co_visibilite.setSelectedIndex(2);
		}
		pl_mainPanel.add(co_visibilite);
		
		bt_validate = new JButton("Valider");
		bt_validate.addActionListener(this);
		JPanel pl_validate = new JPanel();
		pl_validate.add(bt_validate);
		bt_validate.setPreferredSize(new Dimension(80, 25));
		pl_validate.setBorder(new EmptyBorder(new Insets(0, 3, 3, 3)));
		
		this.setPreferredSize(new Dimension(320,200));
		this.setMinimumSize(new Dimension(320,200));
		this.add(pl_mainPanel, BorderLayout.CENTER);
		this.add(pl_validate, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
	}

	/*_______________________________________________________*/
	/** Methode appelee lors d'une action de l'utilisateur sur un composant.
	 * @param e Composant source.
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == bt_validate)
		{
			if(tf_name.getText().equals("") || tf_type.getText().equals(""))
			{
				JOptionPane.showMessageDialog(frame, "La saisie est invalide.\nLe nom et le type doivent etre renseignes.", "Erreur", JOptionPane.PLAIN_MESSAGE);
			}
			else
				{
				AttributeComponent attributeComponent =null;
				for(AttributeComponent ac : inter.getSelectedClassLayers().get(0).getClassComponent().getListAttribute())
				{
					if(localOwnedAttribute.getId() == ac.getId())
					{
						attributeComponent = ac;
					}
				}
				
				String attrName = tf_name.getText();
				String attrType = tf_type.getText();
				boolean attrStatic = cb_isStatic.isSelected();
				boolean attrReadOnly = cb_isReadOnly.isSelected();
				boolean attrOrdered = cb_isOrdered.isSelected();
				VisibilityKind attrVisibility = VisibilityKind.PUBLIC;
				if (co_visibilite.getSelectedItem().equals("Public"))
				{
					attrVisibility = VisibilityKind.PUBLIC;
				}
				if (co_visibilite.getSelectedItem().equals("Protected"))
				{
					attrVisibility = VisibilityKind.PROTECTED;
				}
				if (co_visibilite.getSelectedItem().equals("Package"))
				{
					attrVisibility = VisibilityKind.PACKAGE;
				}
				if (co_visibilite.getSelectedItem().equals("Private"))
				{
					attrVisibility = VisibilityKind.PRIVATE;
				}
				
				localOwnedAttribute.setName(attrName);
				localOwnedAttribute.setIsOrdered(attrOrdered);
				localOwnedAttribute.setIsReadOnly(attrReadOnly);
				localOwnedAttribute.setIsStatic(attrStatic);
				localOwnedAttribute.setType("uml:Property");
				localOwnedAttribute.setVisibility(attrVisibility);
				setType();
				
				if(attributeComponent == null)
				{
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedAttribute().add(localOwnedAttribute);
					String attrId =  String.format("XMI_ID_%d", (inter.getXmigraph().getParcoursProfondeur().getTreeManager()).getXmiId());
					localOwnedAttribute.setId(attrId);
					attributeComponent = new AttributeComponent(attrName, co_visibilite.getSelectedItem().toString().toLowerCase(), attrType, attrStatic, attrId);
					updateAllRepresentations(attributeComponent, true);
				}
				else
				{
					attributeComponent.setVisibilityAttribute(co_visibilite.getSelectedItem().toString().toLowerCase());
					attributeComponent.setTypeAttribute(attrType);
					attributeComponent.setStatic(attrStatic);
					attributeComponent.setNameAttribute(attrName);
					updateAllRepresentations(attributeComponent, false);
				}
				this.dispose();
			}
		}
	}
	
	/*_______________________________________________________*/
	/** Cree ou met a jour l'attribut type du localOwnedAttribute
	 */
	private void setType()
	{
		if(localOwnedAttribute.getJType() == null)
		{
			localOwnedAttribute.setJType(new JTypeImpl());
		}
		if(inter.getXmigraph().getParcoursProfondeur().getTreeManager().getPrimitiveTypes().contains(tf_type.getText()))
		{
			localOwnedAttribute.getJType().setType("uml:PrimitiveType");
			localOwnedAttribute.getJType().setHref(String.format("http://schema.omg.org/spec/UML/2.1/uml.xml#%s", tf_type.getText()));
		}
		else
		{
			localOwnedAttribute.getJType().setType("uml:Class");
			String idref = String.format("%d", inter.getXmigraph().getParcoursProfondeur().getTreeManager().getXmiId());
			localOwnedAttribute.getJType().setIdref(idref);
			inter.getXmigraph().getParcoursProfondeur().getTreeManager().addType(idref, tf_type.getText());
		}
	}
	
	/*_______________________________________________________*/
	/** Met a jour toutes les representations graphiques de l'element courant.
	 * @param attributeComponent L'attribut source.
	 * @param create true si c'est une creation, false si c'est une modification
	 */
	private void updateAllRepresentations(AttributeComponent attributeComponent, boolean create)
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
					if(create)
					{
						c.getClassComponent().addAttribute(attributeComponent);
						c.getClassComponent().repaint();
						c.setSize(c.getClassComponent().getWidth(), c.getClassComponent().getHeight());
					}
					else
					{
						c.getClassComponent().getListAttribute().set(inter.getCb_attributs().getSelectedIndex(), attributeComponent);
					}
				}
				inter.propertiesImpl();
				sp_model.repaint();
			}
		}
	}
}
