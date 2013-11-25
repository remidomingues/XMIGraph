/*_______________________________________________________*/
/**
 * Fichier : OperationPropertyDialog.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package presentation;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
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
import javax.swing.border.EmptyBorder;

import org.eclipse.uml2._1._0._0.uml.OwnedOperation;
import org.eclipse.uml2._1._0._0.uml.OwnedParameter;
import org.eclipse.uml2._1._0._0.uml.Referenced;
import org.eclipse.uml2._1._0._0.uml.VisibilityKind;
import org.eclipse.uml2._1._0._0.uml.impl.JTypeImpl;
import org.eclipse.uml2._1._0._0.uml.impl.OwnedOperationImpl;
import org.eclipse.uml2._1._0._0.uml.impl.OwnedParameterImpl;
import org.eclipse.uml2._1._0._0.uml.impl.ReferencedImpl;

import modelisation.ClassLayer;
import modelisation.MethodComponent;

/*_______________________________________________________*/
/** Classe permettant l'ajout et la modification de methode liees a un PackagedElement du modele.
 */
public class OperationPropertyDialog extends PropertyDialog implements ActionListener
{	
	/** Generated serial version ID */
	private static final long serialVersionUID = 1L;
	
	/** Classe de stockage */
	private OwnedOperation localOwnedOperation;

	/** Affichage du isAbstract */
	protected JCheckBox cb_isAbstract;

	/** User Control du name, return et booleens, il est fixe */
	private JPanel pl_static = new JPanel();
	
	/** User Control des Exceptions, il est dynamique */
	private ArrayList<JPanel> pl_exception = new ArrayList<JPanel>();
	
	/** User Control des Parametres, il est dynamique */
	private ArrayList<JPanel> pl_parametre = new ArrayList<JPanel>();
	
	/** Affichage du Nom de l'exception */
	private ArrayList<JTextField> tf_exceptionName = new ArrayList<JTextField>();
	
	/** Affichage du Nom du param */
	private ArrayList<JTextField> tf_parametreName = new ArrayList<JTextField>();
	
	/** Affichage du Type du param */
	private ArrayList<JTextField> tf_parametreType = new ArrayList<JTextField>();
	
	/** Bouton Ajouter qui rajoute des Exceptions */
	private JButton bt_ajouterException = new JButton(new ImageIcon(getClass().getResource("/add.png")));
	
	/** Bouton Ajouter qui rajoute des Parametres */
	private JButton bt_ajouterParametre = new JButton(new ImageIcon(getClass().getResource("/add.png")));
	
	/** Bouton Enlever qui supprime des Exceptions */
	private ArrayList<JButton> bt_enleverException = new ArrayList<JButton>();
	
	/** Bouton Enlever qui supprime des Parametres */
	private ArrayList<JButton> bt_enleverParametre = new ArrayList<JButton>();
	
	/** Affichage du Type de retour */
	private JTextField tf_returnType;
	
	/** Bouton de Validation */
	private JButton bt_validate = new JButton("Valider");
	
	/** Panel du Deuxieme User Control Parametre */
	private JPanel pl_pa = new JPanel();
	
	/** Layout du Deuxieme User Control */
	private GridLayout la_pa = new GridLayout(1,1,5,5);
	
	/** Panel du Troisieme UserControl Exception */
	private JPanel pl_ex = new JPanel();
	
	/** Layout du Troisieme User Control */
	private GridLayout la_ex = new GridLayout(1,1,5,5);
	
	/** ComboBox sur la visibilite */
	private JComboBox co_visibilite;
	
	/**	Interface utilise pour la gestion des types */
	private Interface inter;
	
	/** JFrame utilisee pour l'affichage de boites de dialogue d'erreurs */
	private JFrame frame = new JFrame();

	/*_______________________________________________________*/
	/** Constructeur permettant de modifier une methode
	 * @param methode La method a modifier
	 * @param i L'interface appelante
	 */
	public OperationPropertyDialog(OwnedOperation methode, Interface i)
	{
		super(i,"Propriete de " + methode.getName(),true);
		inter = i;
		localOwnedOperation = methode;
		init();
	}
	
	/*_______________________________________________________*/
	/** Constructeur permettant de modifier une methode
	 * @param i L'interface appelante
	 */
	public OperationPropertyDialog(Interface i)
	{
		super(i,"Nouvelle Methode",true);
		inter = i;
		localOwnedOperation = new OwnedOperationImpl();
		init();
	}
	
	/*_______________________________________________________*/
	/** Initialise la fenetre et ses composants
	 */
	private void init()
	{
		//Definition du premier User Control Statique
		pl_static.setLayout(new GridLayout(2,3,5,5));
		pl_static.add(new JLabel(" Nom de la méthode : "));
		tf_name = new JTextField(localOwnedOperation.getName());
		tf_name.setPreferredSize(new Dimension(100,23));
		pl_static.add(tf_name);
		cb_isAbstract = new JCheckBox("Abstrait ",localOwnedOperation.isIsAbstract());
		pl_static.add(cb_isAbstract);
		pl_static.add(new JLabel(" Type de retour : "));
		for (OwnedParameter op : localOwnedOperation.getOwnedParameter())
		{
			if (op.getDirection().equals("return"))
			{
				if (inter.getXmigraph().getParcoursProfondeur().getTreeManager().getTypeFromJtype(op.getJType()).equals(""))
				{
					tf_returnType = new JTextField("void");
				}
				else
				{
					tf_returnType = new JTextField(inter.getXmigraph().getParcoursProfondeur().getTreeManager().getTypeFromJtype(op.getJType()));
				}
			}
		}
		if(tf_returnType == null)
		{
			tf_returnType = new JTextField();
		}
		tf_returnType.setPreferredSize(new Dimension(100,23));
		pl_static.add(tf_returnType);
		cb_isStatic = new JCheckBox("Statique ",localOwnedOperation.isIsStatic());
		pl_static.add(cb_isStatic);
		
		// Ajout des Users Control au mainLayout
		pl_mainPanel = new JPanel();
		pl_mainPanel.setLayout(new BorderLayout());
		pl_mainPanel.add(pl_static,BorderLayout.NORTH);
		
		//Definition du deuxieme User Control Parametre
		JPanel pl_centre = new JPanel();
		pl_centre.setLayout(new GridLayout(2,1,5,5));
		
		pl_pa.setLayout(la_pa);
		JLabel param = new JLabel("Parametres : ");
		JPanel pl_labelPa = new JPanel();
		pl_labelPa.setLayout(new FlowLayout());
		pl_labelPa.add(param);
		bt_ajouterParametre.setPreferredSize(new Dimension(20,20));
		pl_labelPa.add(bt_ajouterParametre);
		pl_pa.add(pl_labelPa);

		for (OwnedParameter s : localOwnedOperation.getOwnedParameter())
		{
			if (!s.getDirection().equals("return"))
			{
				la_pa.setRows(la_pa.getRows()+1);
				createParameter(s);
			}
		}
		pl_centre.add(new JScrollPane(pl_pa));
		
		//Definition du troisieme User Control Exception
		pl_ex.setLayout(la_ex);
		JLabel excep = new JLabel("Exceptions : ");
		JPanel pl_labelEx = new JPanel();
		pl_labelEx.setLayout(new FlowLayout());
		pl_labelEx.add(excep);
		bt_ajouterException.setPreferredSize(new Dimension(20,20));
		pl_labelEx.add(bt_ajouterException);
		pl_ex.add(pl_labelEx);
		
		for (Referenced e : localOwnedOperation.getRaisedException())
		{
			la_ex.setRows(la_ex.getRows()+1);
			createException(e);
			
		}
		pl_centre.add(new JScrollPane(pl_ex));
		pl_mainPanel.add(pl_centre,BorderLayout.CENTER);
		
		//Definition du Dernier User Control
		JPanel pl_btn = new JPanel();
		pl_btn.setLayout(new FlowLayout());
		co_visibilite = new JComboBox();
		co_visibilite.setEditable(false);
		co_visibilite.insertItemAt("Public",0);
		co_visibilite.insertItemAt("Package",1);
		co_visibilite.insertItemAt("Protected",2);
		co_visibilite.insertItemAt("Private",3);
		if(localOwnedOperation == null || localOwnedOperation.getVisibility() == VisibilityKind.PUBLIC)
		{
			co_visibilite.setSelectedIndex(0);
		}
		else if(localOwnedOperation.getVisibility() == VisibilityKind.PACKAGE)
		{
			co_visibilite.setSelectedIndex(1);
		}
		else if(localOwnedOperation.getVisibility() == VisibilityKind.PROTECTED)
		{
			co_visibilite.setSelectedIndex(2);
		}
		else if(localOwnedOperation.getVisibility() == VisibilityKind.PRIVATE)
		{
			co_visibilite.setSelectedIndex(3);
		}
		pl_btn.add(co_visibilite);
		pl_btn.add(bt_validate);
		pl_mainPanel.add(pl_btn,BorderLayout.SOUTH);
		
		//Abonnement
		bt_ajouterException.addActionListener(this);
		bt_ajouterParametre.addActionListener(this);
		bt_validate.addActionListener(this);
		
		// Configuration de la JFrame
		pl_mainPanel.setBorder(new EmptyBorder(10,10,10,10));
		this.setPreferredSize(new Dimension(400,300));
		this.setMinimumSize(new Dimension(400,300));
		this.add(pl_mainPanel);
		this.pack();
		this.setVisible(true);
	}
	
	/** Cree un User Control d'Exception 
	 * @param referenced L'exception a afficher
	 */
	private void createException(Referenced referenced)
	{
		String nom;
		if (referenced == null)
		{
			nom = "";
		}
		else
		{
			nom = inter.getXmigraph().getParcoursProfondeur().getTreeManager().getTypeFromId(referenced.getIdref());
		}
		JPanel pl_excep = new JPanel(); 
		pl_excep.setLayout(new FlowLayout());
		pl_excep.add(new JLabel("  Type : "));
		JTextField tf_excepName = new JTextField(nom);
		tf_excepName.setPreferredSize(new Dimension(150,23));
		tf_exceptionName.add(tf_excepName);
		pl_excep.add(tf_excepName);
		JButton bt_enlev = new JButton(new ImageIcon(getClass().getResource("/minus.png")));
		bt_enlev.setPreferredSize(new Dimension(20,20));
		bt_enlev.addActionListener(this);
		bt_enleverException.add(bt_enlev);
		pl_excep.add(bt_enlev);
		pl_exception.add(pl_excep);
		pl_ex.add(pl_excep);
	}
	
	/** Cree un User Control de Param */
	private void createParameter(OwnedParameter ownedParameter)
	{
		String nom; String type;
		if (ownedParameter == null)
		{
			nom = "";
			type = "";
		}
		else
		{
			nom = ownedParameter.getName();
			type = inter.getXmigraph().getParcoursProfondeur().getTreeManager().getTypeFromJtype(ownedParameter.getJType());
		}
		//panel pour la ligne
		JPanel pl_param = new JPanel();
		pl_param.setLayout(new FlowLayout());
		pl_param.add(new JLabel("  Nom : "));
		JTextField tf_paramName = new JTextField(nom);
		tf_paramName.setPreferredSize(new Dimension(100,23));
		tf_parametreName.add(tf_paramName);
		pl_param.add(tf_paramName);
		pl_param.add(new JLabel("  Type : "));
		JTextField tf_paramType = new JTextField(type);
		tf_paramType.setPreferredSize(new Dimension(100,23));
		tf_parametreType.add(tf_paramType);
		pl_param.add(tf_paramType);
		JButton bt_param = new JButton(new ImageIcon(getClass().getResource("/minus.png")));
		bt_param.setPreferredSize(new Dimension(20,20));
		bt_param.addActionListener(this);
		bt_enleverParametre.add(bt_param);
		pl_param.add(bt_param);
		pl_parametre.add(pl_param);
		pl_pa.add(pl_param);
	}
	
	/** Supprime un User Control Exception */
	private void supprimerException(int index)
	{
		pl_ex.remove(pl_exception.get(index));
		bt_enleverException.remove(bt_enleverException.get(index));
		tf_exceptionName.remove(tf_exceptionName.get(index));
		pl_exception.remove(pl_exception.get(index));
	}
	
	/** Supprime un User Control Parametre */
	private void supprimerParametre(int index)
	{
		pl_pa.remove(pl_parametre.get(index));
		tf_parametreName.remove(tf_parametreName.get(index));
		tf_parametreType.remove(tf_parametreType.get(index));
		bt_enleverParametre.remove(bt_enleverParametre.get(index));
		pl_parametre.remove(pl_parametre.get(index));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == bt_validate)
		{
			if(tf_name.getText().equals(""))
			{
				JOptionPane.showMessageDialog(frame, "La saisie est invalide.\nLe nom de la methode doit etre renseigne.", "Erreur", JOptionPane.PLAIN_MESSAGE);
			}
			else
			{
				try
				{
					MethodComponent methodComponent = null;
					for(MethodComponent mc : inter.getSelectedClassLayers().get(0).getClassComponent().getListMethod())
					{
						if(localOwnedOperation.getId() == mc.getId())
						{
							methodComponent = mc;
						}
					}
				
				String methodName = tf_name.getText();
				String methodReturnType = tf_returnType.getText();
				if(methodReturnType.equals(""))
				{
					methodReturnType = "void";
				}
				boolean methodStatic = cb_isStatic.isSelected();
				boolean methodAbstract = cb_isAbstract.isSelected();
				
				localOwnedOperation.setName(tf_name.getText());
				localOwnedOperation.setType("uml:Operation");
				localOwnedOperation.setIsAbstract(cb_isAbstract.isSelected());
				localOwnedOperation.setIsStatic(cb_isStatic.isSelected());
				localOwnedOperation.getOwnedParameter().removeAll(localOwnedOperation.getOwnedParameter());
				
				VisibilityKind opVisibility = VisibilityKind.PUBLIC;
				if (co_visibilite.getSelectedItem().equals("Public"))
				{
					opVisibility = VisibilityKind.PUBLIC;
				}
				if (co_visibilite.getSelectedItem().equals("Protected"))
				{
					opVisibility = VisibilityKind.PROTECTED;
				}
				if (co_visibilite.getSelectedItem().equals("Package"))
				{
					opVisibility = VisibilityKind.PACKAGE;
				}
				if (co_visibilite.getSelectedItem().equals("Private"))
				{
					opVisibility = VisibilityKind.PRIVATE;
				}
				localOwnedOperation.setVisibility(opVisibility);
				
				List<String> params = new ArrayList<String>();
				for (JTextField tf : tf_parametreName)
				{
					manageParameter(tf, false);
					params.add(tf_parametreType.get(tf_parametreName.indexOf(tf)).getText());
					
				}
				manageParameter(tf_returnType, true);
				localOwnedOperation.getRaisedException().removeAll(localOwnedOperation.getRaisedException());
				for (JTextField tf : tf_exceptionName)
				{
					if(!tf.getText().equals(""))
					{
						ReferencedImpl re = new ReferencedImpl();
						re.setIdref(String.format("%d", (inter.getXmigraph().getParcoursProfondeur().getTreeManager()).getXmiId()));
						inter.getXmigraph().getParcoursProfondeur().getTreeManager().addType(re.getIdref(), tf.getText());
						localOwnedOperation.getRaisedException().add(re);
					}
				}
				
				if(methodComponent == null)
				{
					localOwnedOperation.setType("uml:Operation");
					inter.getSelectedClassLayers().get(0).getClassComponent().getPackageData().getOwnedOperation().add(localOwnedOperation);
					String methodId =  String.format("%d", (inter.getXmigraph().getParcoursProfondeur().getTreeManager()).getXmiId());
					localOwnedOperation.setId(methodId);
					methodComponent = new MethodComponent(methodName,co_visibilite.getSelectedItem().toString().toLowerCase(), methodReturnType, params, methodAbstract, methodStatic, methodId);
					updateAllRepresentations(methodComponent, true);
				}
				else
				{
					methodComponent.setStatic(methodStatic);
					methodComponent.setAbstract(methodAbstract);
					methodComponent.setNameMethod(methodName);
					methodComponent.setParamMethod(params);
					methodComponent.setReturnType(methodReturnType);
					methodComponent.setVisibilityMethod(co_visibilite.getSelectedItem().toString().toLowerCase());
					updateAllRepresentations(methodComponent, false);
				}
				this.dispose();
			}
			catch(IllegalArgumentException e1)
			{
				JOptionPane.showMessageDialog(frame, "La saisie est invalide.\nLe nom ou le type d'un parametre est manquant.", "Erreur", JOptionPane.PLAIN_MESSAGE);
			}
		}
		}
		
		if (e.getSource() == bt_ajouterParametre)
		{
			la_pa.setRows(la_pa.getRows()+1);
			createParameter(null);
			pl_mainPanel.updateUI();
		}
		
		if (e.getSource() == bt_ajouterException)
		{
			la_ex.setRows(la_ex.getRows()+1);
			createException(null);
			pl_mainPanel.updateUI();
		}
		
		if (bt_enleverException.contains(e.getSource()))
		{
			int i = bt_enleverException.indexOf(e.getSource());
			supprimerException(i);
			la_ex.setRows(la_ex.getRows()-1);
			pl_mainPanel.updateUI();
		}
		
		if (bt_enleverParametre.contains(e.getSource()))
		{
			int i = bt_enleverParametre.indexOf(e.getSource());
			supprimerParametre(i);
			la_pa.setRows(la_pa.getRows()-1);
			pl_mainPanel.updateUI();
		}
	}
	
	/*_______________________________________________________*/
	/** Gere la creation et la mise a jour du parametre passe en parametre
	 * @param tf Le nom du parametre
	 * @param isReturnParam true si le parametre correspond au type de retour, false sinon
	 * @throws IllegalArgumentException Si le nom ou le type du parametre n'est pas renseigne
	 */
	private void manageParameter(JTextField tf, boolean isReturnParam) throws IllegalArgumentException
	{
		if(isReturnParam || (!tf.getText().equals("") && !tf_parametreType.get(tf_parametreName.indexOf(tf)).getText().equals("")))
		{
			OwnedParameterImpl op = new OwnedParameterImpl();
			op.setId(String.format("%d",  (inter.getXmigraph().getParcoursProfondeur().getTreeManager()).getXmiId()));
			op.setType("uml:Parameter");
			if(!isReturnParam)
			{
				op.setName(tf.getText());
				op.setDirection("in");
				setType(op, tf_parametreType.get(tf_parametreName.indexOf(tf)).getText());
			}
			else
			{
				op.setName("return");
				op.setDirection("return");
				if(tf.getText().equals(""))
				{
					tf.setText("void");
				}
				setType(op, tf.getText());
			}
			localOwnedOperation.getOwnedParameter().add(op);
		}
		else if(!isReturnParam && (tf.getText().equals("") && !tf_parametreType.get(tf_parametreName.indexOf(tf)).getText().equals("")) || (!tf.getText().equals("") && tf_parametreType.get(tf_parametreName.indexOf(tf)).getText().equals("")))
		{
			throw new IllegalArgumentException();
		}
	}
	
	/*_______________________________________________________*/
	/** Cree ou met a jour l'attribut type de l'OwnedParameter passe en parametre
	 * @param ownedParameter L'OwnedParameter dont le type doit etre cree ou mis a jour
	 * @param value La valeur du type
	 */
	private void setType(OwnedParameter ownedParameter, String value)
	{
		if(ownedParameter.getJType() == null)
		{
			ownedParameter.setJType(new JTypeImpl());
		}
		if(inter.getXmigraph().getParcoursProfondeur().getTreeManager().getPrimitiveTypes().contains(value))
		{
			ownedParameter.getJType().setType("uml:PrimitiveType");
			ownedParameter.getJType().setHref(String.format("http://schema.omg.org/spec/UML/2.1/uml.xml#%s", value));
		}
		else
		{
			ownedParameter.getJType().setType("uml:Class");
			String idref = String.format("%d", inter.getXmigraph().getParcoursProfondeur().getTreeManager().getXmiId());
			ownedParameter.getJType().setIdref(idref);
			inter.getXmigraph().getParcoursProfondeur().getTreeManager().addType(idref, value);
		}
	}
	
	/*_______________________________________________________*/
	/** Met a jour toutes les representations graphiques de l'element courant.
	 * @param methodComponent La methode source.
	 * @param create true si c'est une creation, false si c'est une modification
	 */
	private void updateAllRepresentations(MethodComponent methodComponent, boolean create)
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
						c.getClassComponent().addMethod(methodComponent);
						c.getClassComponent().repaint();
						c.setSize(c.getClassComponent().getWidth(), c.getClassComponent().getHeight());
					}
					else
					{
						c.getClassComponent().getListMethod().set(inter.getCb_methodes().getSelectedIndex(), methodComponent);
					}
				}
				inter.propertiesImpl();
				sp_model.repaint();
			}
		}
	}
}
