/*_______________________________________________________*/
/**
 * Fichier : Interface.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package presentation;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.TransferHandler;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileFilter;

import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.PackagedElement;

import modelisation.AttributeComponent;
import modelisation.ClassLayer;
import modelisation.MethodComponent;
import modelisation.PackagedElementComponent;
import modelisation.MyGlassPane;

import dragAndDrop.UMLDropTarget;
import dragAndDrop.UMLTransferHandler;
import application.Listener;
import application.XMIGraph;

/**
 * Classe servant d'interface graphique et de point de lancement du projet XMI Graph
 * Contient tous les JComponents necessaire au bon fonctionnement de la JFrame principale
 * Affiche les traitements du parser et du parcours en profondeur
 * 
 * Codification des JComponents : ls* = JList, sp* = JScrollPane,
 * pl* = JPanel, ta* = JTextArea, mn* = JMenu, JMenuItem
*/
public class Interface extends JFrame
{
	/** Serializaion de la fenetre */
	private static final long serialVersionUID = 1L;
	
	/** Classe gerant le parsing du document specifie, ainsi que la modelisation des elements parses */
	private XMIGraph xmigraph;
	
	 /** true si la touche ctrl est active, false sinon */
	private boolean isCtrlPressed = false;
	
	/** true si la souris est en mouvement, false sinon */
	private boolean isMouseDragged = false;
	
	/** true si le bouton gauche de la souris est enfonce, false sinon */
	private boolean isRightClicPressed = false;
	
	/** true si la touche shift est enfoncee, false sinon */
	private boolean isShiftPressed = false;
	
	/** List de references sur les composants graphiques representant des classes selectionnes */
	private List<ClassLayer> selectedClassLayers = new ArrayList<ClassLayer>();
	
	/** Le layout utilise pour organiser la fenetre	 */
	private BorderLayout mainLayout = new BorderLayout();
	
	/**JPanel qui stocke la console et le dessin */
	private JPanel pl_mainPanel = new JPanel();

	/** JList qui permet l'affichage des classes importees et sa scrollbar */
	private JList ls_xmiClasses = new JList();
	
	/** La liste contenant les classes issues du fichier XMI */
	private JScrollPane sp_xmiClasses;
	
	/** ScrollPane contenant la console d'affichage de la sortie standard */
	private JScrollPane sp_outputConsole;	
	
	/** ScrollPane contenant la console d'affichage de la sortie d'erreur */
	private JScrollPane sp_errorConsole;	
	
	/** Console d'affichage de la sortie standard */
	private JTextArea ta_outputConsole = new JTextArea();
	
	/** Console d'affichage de la sortie d'erreur */
	private JTextArea ta_errorConsole = new JTextArea();
	
	/** Le panel de proprietes */
	private JPanel pl_properties = new JPanel();
	
	// === Les Attributs des Menus ===//
	/** Menu de la fenetre et ses sous-menus */
	private JMenuBar menuBar = new JMenuBar();
	
	/** Menu fichier contenant les sous-menus Importer et Quitter */
	private JMenu mn_file = new JMenu("Fichier");
	
	/** Sous-menu import permettant d'importer un fichier XMI */
	private JMenuItem mn_import = new JMenuItem("Importer");
	
	/** Sous-menu exit, permet de quitter le logiciel */
	private JMenuItem mn_exit = new JMenuItem("Quitter");

	/** Menu Export contenant les exports possible*/
	private JMenu mn_export = new JMenu("Exporter");
	
	/** Sous-menu donnant acces a la fonctionnalite d'export en PDF */
	private JMenuItem mn_PDF = new JMenuItem("Vers PDF");
	
	/** Sous-menu donnant acces a la fonctionnalite d'export Image */
	private JMenuItem mn_image = new JMenuItem("Vers PNG");
	
	/** Menu Onglets contenant les sous-menus Ajouter Supprimer et Supprimer tout*/
	private JMenu mn_onglets = new JMenu("Onglets");
	
	/** Sous-menu permettant d'ajouter un onglet */
	private JMenuItem mn_ajouter = new JMenuItem("Ajouter un onglet");

	/** Sous-menu supprimer onglet permettant de supprimer l'onglet actif */
	private JMenuItem mn_supprimer = new JMenuItem("Fermer l'onglet");
	
	/** Sous-menu supprimer onglet permettant de supprimer tous les onglets */
	private JMenuItem mn_supprimerTous = new JMenuItem("Fermer tous les onglets");
	
	/** Menu Aide contenant les raccourcis*/
	private JMenu mn_aide = new JMenu("Aide");
	
	/** Sous-menu donnant acces a la liste des raccourcis */
	private JMenuItem mn_accesAide = new JMenuItem("Ouvrir l'Aide");
	
	/** Filtre utilise dans des FileChooser afin de ne permettre la selection que de fichiers XMI */
	private FileFilter xmiFileFilter = new FileFilter() 
	{
		/**
		 * Libelle du selecteur
		 */
		@Override
		public String getDescription() 
		{
			return "Fichiers XMI";
		}
		
		/**
		 * selecteur lui meme
		 */
		@Override
		public boolean accept(File f) 
		{
			Pattern p = Pattern .compile(".*\\.xmi");
			Matcher m = p.matcher(f.getName());
			if(m.matches() || f.isDirectory())
				return true;
			else
				return false;
		}
	};
	
	/** Menu contextuel affiche lors d'un clic droit sur un ClassLayer */
	private ClassContextMenu classContextMenu = new ClassContextMenu(this);
	
	/** Menu contextuel affiche lors d'un clic droit sur une methode ou un attribut affiche dans la fenetre proprietes */
	private PropertyContextMenu propertyContextMenu = new PropertyContextMenu(this);
	
	/** JSplitPane utilise pour le redimensionnement vertical de l'espace partage par les panels de modelisation et les consoles */
	private JSplitPane verticalLeftSplit;
	
	/** JSplitPane utilise pour le redimensionnement vertical de l'espace partage par le JScrollPane de la liste de classes UML, et par la fenetre de proprietes */
	private JSplitPane verticalRightSplit;

	/** JSplitPane utilise pour le redimensionnement horizontal de l'espace partage par le verticalSplit et le panel contenant la JList et les proprietes */
	private JSplitPane horizontalSplit;
	
	// === Onglets === //
	/** Les differents onglets de la console */
	private JTabbedPane tp_onglets = new JTabbedPane();
	
	/** JTabbedPane de reception des panels de graphics */
	private JTabbedPane tp_modelisation =  new JTabbedPane();
	
	/**GlassPane d'affichage des fleches*/
	private ArrayList<MyGlassPane> gp_modelisation = new ArrayList<MyGlassPane>();
	
	/** JPanel de reception des graphics representants les classes et relations*/
	private	ArrayList<JScrollPane> sp_modelisation = new ArrayList<JScrollPane>();
	
	/** Boutons fermer associe aux Onglets */
	private	ArrayList<JButton> bt_modelisation = new ArrayList<JButton>();
	
	/** Index du prochain onglet a creer */
	private int currentTabIndex = 1;
	
	/**  champ de la fenetre Propertie : le JtextField 
	 * contenant le nom de la classe */
	private JTextField tf_nom = new JTextField("Nom");
	
	/**  champ de la fenetre Propertie  : une checkbox qui contient 
	 * la propriete abstract */
	private JCheckBox cb_abstract = new JCheckBox("Abstract",false);
	
	/** Le Groupe des radio boutons	 */
	private ButtonGroup bg_visibility = new ButtonGroup();
	
	/**   champ de la fenetre Propertie  : une checkbox qui contient 
	 * la visibilite private */
	private JRadioButton rb_private= new JRadioButton("Private");

	/**  champ de la fenetre Propertie  : une checkbox qui contient 
	 * la visibilite protected */
	private JRadioButton rb_protected= new JRadioButton("Protected");
	
	/**  champ de la fenetre Propertie  : une checkbox qui contient 
	 * la visibilite public */
	private JRadioButton rb_public= new JRadioButton("Public");
	
	/**  champ de la fenetre Propertie  : une checkbox qui contient 
	 * la visibilite package */
	private JRadioButton rb_package= new JRadioButton("Package");
	
	/**Panel qui contient les attributs de la classe
	 */
	private JPanel jp_attributs = new JPanel();
	
	/** Panel qui contient les methodes de la classe
	 */
	private JPanel jp_methodes = new JPanel();

	/** Jcombobox qui contient les attributs de la classe
	 */
	private JComboBox cb_attributes = new JComboBox();
	
	/** Jcombobox qui contient les methodes de la classe
	 */
	private JComboBox cb_methodes = new JComboBox();
	
	/** JFrame utilisee pour l'affichage de boites de dialogue d'erreurs */
	private JFrame frame = new JFrame();

	/**Jpanel qui contient les champs de modifications du Jpanel propertie*/
	private JPanel jp_inPropertie = new JPanel();
	
	/** GridBagLayout utilise pour la fenetre de proprietes */
	private GridBagLayout gridBagLayout = new GridBagLayout();
	
	/** Contraintes utilisees pour le positionnement des composants dans le GridBagLayout */
	private GridBagConstraints gridBagConstraints = new GridBagConstraints();
	
	/** JLabel qui contient le titre attributs*/
	private JLabel jl_attributs = new JLabel("Attributs");
	
	/** JLabel qui contient le titre methodes*/
	private JLabel jl_methodes = new JLabel("Méthodes");
	
	/** JButton pour ajouter un attribut*/
	private JButton bt_addAttribute = new JButton(new ImageIcon(getClass().getResource("/add.png")));

	/** JButton pour ajouter une methode*/
	private JButton bt_addMethod = new JButton(new ImageIcon(getClass().getResource("/add.png")));
	
	/** JButton pour supprimer un attribut*/
	private JButton bt_deleteAttribute = new JButton(new ImageIcon(getClass().getResource("/delete.png")));

	/**JButton pour supprimer une methode*/
	private JButton bt_deleteMethod = new JButton(new ImageIcon(getClass().getResource("/delete.png")));
	
	/** JButton pour modifier un attribut*/
	private JButton bt_modifyAttribute = new JButton(new ImageIcon(getClass().getResource("/update.png")));

	/**JButton pour modifier une methode*/
	private JButton bt_modifyMethod = new JButton(new ImageIcon(getClass().getResource("/update.png")));
	
	/** Listener abonne aux composants de l'instance courante, effectuant les traitements adequats */
	private Listener listener = new Listener(this);

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ isCtrlPressed.
	 * @return La valeur du champ isCtrlPressed.
	 */
	public boolean isCtrlPressed()
	{
		return isCtrlPressed;
	}

	/*_______________________________________________________*/
	/** Modifie la valeur du champ isCtrlPressed.
	 * @param isCtrlPressed La valeur du champ isCtrlPressed.
	 */
	public void setCtrlPressed(boolean isCtrlPressed)
	{
		this.isCtrlPressed = isCtrlPressed;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ isMouseDragged.
	 * @return La valeur du champ isMouseDragged.
	 */
	public boolean isMouseDragged()
	{
		return isMouseDragged;
	}

	/*_______________________________________________________*/
	/** Modifie la valeur du champ isMouseDragged.
	 * @param isMouseDragged La valeur du champ isMouseDragged.
	 */
	public void setMouseDragged(boolean isMouseDragged)
	{
		this.isMouseDragged = isMouseDragged;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ tp_onglets.
	 * @return La valeur du champ tp_onglets.
	 */
	public JTabbedPane getTp_onglets()
	{
		return tp_onglets;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ mn_import.
	 * @return La valeur du champ mn_import.
	 */
	public JMenuItem getMn_import()
	{
		return mn_import;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ mn_accesAide.
	 * @return La valeur du champ mn_accesAide.
	 */
	public JMenuItem getMn_accesAide()
	{
		return mn_accesAide;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ cb_attributes.
	 * @return La valeur du champ cb_attributes.
	 */
	public JComboBox getCb_attributes()
	{
		return cb_attributes;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ isRightClicPressed.
	 * @return La valeur du champ isRightClicPressed.
	 */
	public boolean isRightClicPressed()
	{
		return isRightClicPressed;
	}

	/*_______________________________________________________*/
	/** Modifie la valeur du champ isRightClicPressed.
	 * @param isRightClicPressed La valeur du champ isRightClicPressed.
	 */
	public void setRightClicPressed(boolean isRightClicPressed)
	{
		this.isRightClicPressed = isRightClicPressed;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ listener.
	 * @return La valeur du champ listener.
	 */
	public Listener getListener()
	{
		return listener;
	}

	/*_______________________________________________________*/
	/** Modifie la valeur du champ isShiftPressed.
	 * @param isShiftPressed La valeur du champ isShiftPressed.
	 */
	public void setShiftPressed(boolean isShiftPressed)
	{
		this.isShiftPressed = isShiftPressed;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ cb_abstract.
	 * @return La valeur du champ cb_abstract.
	 */
	public JCheckBox getCb_abstract()
	{
		return cb_abstract;
	}

	/*_______________________________________________________*/
	/** Modifie la valeur du champ cb_abstract.
	 * @param cb_abstract La valeur du champ cb_abstract.
	 */
	public void setCb_abstract(JCheckBox cb_abstract)
	{
		this.cb_abstract = cb_abstract;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ pl_properties.
	 * @return La valeur du champ pl_properties.
	 */
	public JPanel getPl_properties()
	{
		return pl_properties;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ isShiftPressed.
	 * @return La valeur du champ isShiftPressed.
	 */
	public boolean isShiftPressed()
	{
		return isShiftPressed;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ ta_outputConsole.
	 * @return La valeur du champ ta_outputConsole.
	 */
	public JTextArea getTa_outputConsole()
	{
		return ta_outputConsole;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ ta_errorConsole.
	 * @return La valeur du champ ta_errorConsole.
	 */
	public JTextArea getTa_errorConsole()
	{
		return ta_errorConsole;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ mn_exit.
	 * @return La valeur du champ mn_exit.
	 */
	public JMenuItem getMn_exit()
	{
		return mn_exit;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ mn_PDF.
	 * @return La valeur du champ mn_PDF.
	 */
	public JMenuItem getMn_PDF()
	{
		return mn_PDF;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ mn_image.
	 * @return La valeur du champ mn_image.
	 */
	public JMenuItem getMn_image()
	{
		return mn_image;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ classContextMenu.
	 * @return La valeur du champ classContextMenu.
	 */
	public ClassContextMenu getClassContextMenu()
	{
		return classContextMenu;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ verticalLeftSplit.
	 * @return La valeur du champ verticalLeftSplit.
	 */
	public JSplitPane getVerticalLeftSplit()
	{
		return verticalLeftSplit;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ verticalRightSplit.
	 * @return La valeur du champ verticalRightSplit.
	 */
	public JSplitPane getVerticalRightSplit()
	{
		return verticalRightSplit;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ horizontalSplit.
	 * @return La valeur du champ horizontalSplit.
	 */
	public JSplitPane getHorizontalSplit()
	{
		return horizontalSplit;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ bt_modelisation.
	 * @return La valeur du champ bt_modelisation.
	 */
	public ArrayList<JButton> getBt_modelisation()
	{
		return bt_modelisation;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ tf_nom.
	 * @return La valeur du champ tf_nom.
	 */
	public JTextField getTf_nom()
	{
		return tf_nom;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ bt_addAttribute.
	 * @return La valeur du champ bt_addAttribute.
	 */
	public JButton getBt_addAttribute()
	{
		return bt_addAttribute;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ bt_addMethod.
	 * @return La valeur du champ bt_addMethod.
	 */
	public JButton getBt_addMethod()
	{
		return bt_addMethod;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ bt_deleteAttribute.
	 * @return La valeur du champ bt_deleteAttribute.
	 */
	public JButton getBt_deleteAttribute()
	{
		return bt_deleteAttribute;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ bt_deleteMethod.
	 * @return La valeur du champ bt_deleteMethod.
	 */
	public JButton getBt_deleteMethod()
	{
		return bt_deleteMethod;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ bt_modifyAttribute.
	 * @return La valeur du champ bt_modifyAttribute.
	 */
	public JButton getBt_modifyAttribute()
	{
		return bt_modifyAttribute;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ bt_modifyMethod.
	 * @return La valeur du champ bt_modifyMethod.
	 */
	public JButton getBt_modifyMethod()
	{
		return bt_modifyMethod;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ mn_supprimer.
	 * @return La valeur du champ mn_supprimer.
	 */
	public JMenuItem getMn_supprimer()
	{
		return mn_supprimer;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ mn_supprimerTous.
	 * @return La valeur du champ mn_supprimerTous.
	 */
	public JMenuItem getMn_supprimerTous()
	{
		return mn_supprimerTous;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ tp_modelisation.
	 * @return La valeur du champ tp_modelisation.
	 */
	public JTabbedPane getTp_modelisation()
	{
		return tp_modelisation;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ rb_private.
	 * @return La valeur du champ rb_private.
	 */
	public JRadioButton getRb_private()
	{
		return rb_private;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ rb_protected.
	 * @return La valeur du champ rb_protected.
	 */
	public JRadioButton getRb_protected()
	{
		return rb_protected;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ rb_public.
	 * @return La valeur du champ rb_public.
	 */
	public JRadioButton getRb_public()
	{
		return rb_public;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ rb_package.
	 * @return La valeur du champ rb_package.
	 */
	public JRadioButton getRb_package()
	{
		return rb_package;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ mn_ajouter.
	 * @return La valeur du champ mn_ajouter.
	 */
	public JMenuItem getMn_ajouter()
	{
		return mn_ajouter;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ propertyContextMenu.
	 * @return La valeur du champ propertyContextMenu.
	 */
	public PropertyContextMenu getPropertyContextMenu()
	{
		return propertyContextMenu;
	}

	/*_______________________________________________________*/
	/**Permet d'initialiser le premier onglet, et le premier JPanel*/
	public void createGraphicPanel()
	{
		sp_modelisation.add(new JScrollPane());
		sp_modelisation.get(sp_modelisation.size() - 1).setFocusable(true);
		sp_modelisation.get(sp_modelisation.size() - 1).addKeyListener(listener);
		sp_modelisation.get(sp_modelisation.size() - 1).addMouseListener(listener);
		sp_modelisation.get(sp_modelisation.size() - 1).addMouseMotionListener(listener);
		sp_modelisation.get(sp_modelisation.size() - 1).getVerticalScrollBar().setUnitIncrement(20);
		sp_modelisation.get(sp_modelisation.size() - 1).getHorizontalScrollBar().setUnitIncrement(20);
		InputMap inputMap = sp_modelisation.get(sp_modelisation.size() - 1).getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	    inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "do-nothing");
	    inputMap.put(KeyStroke.getKeyStroke("LEFT"), "do-nothing");
	    inputMap.put(KeyStroke.getKeyStroke("UP"), "do-nothing");
	    inputMap.put(KeyStroke.getKeyStroke("DOWN"), "do-nothing");
		
		JInternalFrame internalFrame = new JInternalFrame();
		internalFrame.setBackground(new Color(255, 255, 255));
		internalFrame.setPreferredSize(new Dimension(1000, 1000));
		internalFrame.setVisible(true);
		internalFrame.getContentPane().setLayout(null);
		internalFrame.setBorder(null);
		internalFrame.addKeyListener(listener);
		internalFrame.addMouseListener(listener);
		internalFrame.addMouseMotionListener(listener);
		internalFrame.setFocusable(true);
		((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
		sp_modelisation.get(sp_modelisation.size() - 1).getViewport().add(internalFrame);
		sp_modelisation.get(sp_modelisation.size() - 1).getViewport().getComponent(0).setDropTarget(new UMLDropTarget(this));
		
		gp_modelisation.add(new MyGlassPane(((JInternalFrame)sp_modelisation.get(sp_modelisation.size() - 1).getViewport().getComponent(0)).getContentPane()));
		((JInternalFrame)sp_modelisation.get(sp_modelisation.size() - 1).getViewport().getComponent(0)).setGlassPane(gp_modelisation.get(gp_modelisation.size() - 1));
		gp_modelisation.get(gp_modelisation.size() - 1).setVisible(true);
	}

	/*_______________________________________________________*/
	/**Permet de configurer les Onglet du JTabbedPane*/
	public void configureGraphicPanel()
	{
		JButton b = new JButton(new ImageIcon(getClass().getResource("/closeTab.png")));
		b.setFocusable(false);
		bt_modelisation.add(b);
		bt_modelisation.get(sp_modelisation.size() - 1).setPreferredSize(new Dimension(20,20));
		bt_modelisation.get(sp_modelisation.size() - 1).addActionListener(listener);
		JPanel pl_onglet = new JPanel();
		pl_onglet.setBackground(new Color(238,238,238));
		pl_onglet.add(new JLabel("Diagramme " + currentTabIndex));
		++currentTabIndex;
		pl_onglet.add(bt_modelisation.get(sp_modelisation.size() - 1));
		tp_modelisation.setTabComponentAt(sp_modelisation.size() - 1,pl_onglet);
		configureTabsColor();
	}
	
	/*_______________________________________________________*/
	/** Redefinit les couleurs des onglets lors de la creation, selection ou fermeture de l'un d'eux
	 */
	public void configureTabsColor()
	{
		for(int i = 0; i < tp_modelisation.getTabCount(); ++i)
		{
			if(i != tp_modelisation.getSelectedIndex())
			{
				tp_modelisation.getTabComponentAt(i).setBackground(new Color(238,238,238));
			}
			else
			{
				tp_modelisation.getTabComponentAt(i).setBackground(new Color(200,221,242));
			}
		}
	}
	

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ sp_modelisation.
	 * @return La valeur du champ sp_modelisation.
	 */
	public ArrayList<JScrollPane> getSp_modelisation()
	{
		return sp_modelisation;
	}

	/*_______________________________________________________*/
	/** Retourne la JFrame associee a l'index actif
	 * @return La JFrame associee a l'index actif
	 */
	public JInternalFrame getLastIf_modelisation()
	{
		return (JInternalFrame)sp_modelisation.get(tp_modelisation.getSelectedIndex()).getViewport().getComponent(0);
	}

	/*_______________________________________________________*/
	/** Retourne le ContentPane de la JFrame associee a l'index actif
	 * @return Le ContentPane de la JFrame associee a l'index actif
	 */
	public Container getLastIfContentPane_modelisation()
	{
		return ((JInternalFrame)sp_modelisation.get(tp_modelisation.getSelectedIndex()).getViewport().getComponent(0)).getContentPane();
	}
	
	/*_______________________________________________________*/
	/** Retourne le GlassPane de l'onglet selectionne
	 * @return Le GlassPane de l'onglet selectionne
	 */
	public MyGlassPane getMyGlassPane()
	{
		return (MyGlassPane)((JInternalFrame)sp_modelisation.get(tp_modelisation.getSelectedIndex()).getViewport().getComponent(0)).getGlassPane();
	}
	
	/*_______________________________________________________*/
	/** Enum permettant d'identifier la source du deplacement souhaite (souris, fleche du haut, bas, droite, gauche)
	 */
	public enum MoveSource
	{
		mouse ,
		up,
		down,
		right,
		left				
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ selectedClassLayers
	 * @return La valeur du champ selectedClassLayers.
	 */
	public List<ClassLayer> getSelectedClassLayers()
	{
		return selectedClassLayers;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ sp_xmiClasses.
	 * @return La valeur du champ sp_xmiClasses.
	 */
	public JList getls_xmiClasses()
	{
		return ls_xmiClasses;
	}

	/*_______________________________________________________*/
	/** Retourne l'instance de l'objet courant
	 * @return  L'instance de l'objet courant
	 */
	public Interface getInterface() {
		return this;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ cb_attributs.
	 * @return La valeur du champ cb_attributs.
	 */
	public JComboBox getCb_attributs()
	{
		return cb_attributes;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ cb_methodes.
	 * @return La valeur du champ cb_methodes.
	 */
	public JComboBox getCb_methodes()
	{
		return cb_methodes;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ xmigraph.
	 * @return La valeur du champ xmigraph.
	 */
	public XMIGraph getXmigraph()
	{
		return xmigraph;
	}
	

	/*_______________________________________________________*/
	/** Contructeur
	 */
	public Interface()
	{
		//*********** Configuration des elements ***********//
		//Configuration de la fenetre
		super("XMIGraph");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pl_mainPanel.setLayout(mainLayout);
		
		//Configuration du Menu
		mn_file.add(mn_import);
		mn_file.add(mn_export);
		mn_file.add(mn_exit);
		mn_export.add(mn_PDF);
		mn_export.add(mn_image);
		mn_onglets.add(mn_ajouter);
		mn_onglets.add(mn_supprimer);
		mn_onglets.add(mn_supprimerTous);
		mn_aide.add(mn_accesAide);
		menuBar.add(mn_file);
		menuBar.add(mn_onglets);
		menuBar.add(mn_aide);
		this.setJMenuBar(menuBar);
		
		//Abonnements des Sous-Menus
		mn_import.addActionListener(listener);
		mn_exit.addActionListener(listener);
		mn_ajouter.addActionListener(listener);
		mn_supprimer.addActionListener(listener);
		mn_supprimerTous.addActionListener(listener);
		mn_PDF.addActionListener(listener);
		mn_image.addActionListener(listener);
		mn_accesAide.addActionListener(listener);
		
		//Ajout de mnemoniques
		mn_file.setMnemonic('f');
		mn_import.setMnemonic('i');
		mn_export.setMnemonic('e');
		mn_exit.setMnemonic('q');
		mn_image.setMnemonic('j');
		mn_onglets.setMnemonic('o');
		mn_ajouter.setMnemonic('a');
		mn_supprimer.setMnemonic('f');
		mn_aide.setMnemonic('a');
		mn_accesAide.setMnemonic('a');
		
		//*********** Placement des elements ***********//
		//La liste :
		sp_xmiClasses = new JScrollPane(ls_xmiClasses);
		sp_xmiClasses.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		//Le Panel de dessin :
		createGraphicPanel();
		tp_modelisation.addTab("Diagramme " + (sp_modelisation.size() - 1), sp_modelisation.get(sp_modelisation.size() - 1));
		tp_modelisation.setFocusable(false);
		configureGraphicPanel();
		
		//Consoles :
		sp_outputConsole = new JScrollPane(ta_outputConsole);
		sp_outputConsole.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		sp_outputConsole.setFocusable(false);
		ta_outputConsole.setEditable(false);
		ta_outputConsole.setBackground(Color.white);
		ta_outputConsole.setFocusable(false);
		ta_outputConsole.getDocument().addDocumentListener(listener);
		
		sp_errorConsole = new JScrollPane(ta_errorConsole);
		sp_errorConsole.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		sp_errorConsole.setFocusable(false);
		ta_errorConsole.setEditable(false);
		ta_errorConsole.setBackground(Color.white);
		ta_errorConsole.setFocusable(false);
		ta_errorConsole.setForeground(new Color(255, 0, 0));
		ta_errorConsole.getDocument().addDocumentListener(listener);
		
		tp_onglets.add("Console",sp_outputConsole);
		tp_onglets.add("Erreurs",sp_errorConsole);
		tp_onglets.setFocusable(false);
		tp_onglets.addChangeListener(listener);
		redir();
		
		//Le Panel Principal :
		tp_modelisation.addChangeListener(listener);
		verticalLeftSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, tp_modelisation, tp_onglets);
		pl_mainPanel.add(verticalLeftSplit, BorderLayout.CENTER);
		
		ls_xmiClasses.setDragEnabled(true);

		//Configuration du panel jp_tools
		pl_properties.setVisible(true);		

		verticalRightSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, sp_xmiClasses, pl_properties);
		horizontalSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pl_mainPanel, verticalRightSplit);

		MouseAdapter mouseAdapter = new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				JComponent c = (JComponent)e.getSource();
				UMLTransferHandler handler = (UMLTransferHandler)c.getTransferHandler();
				handler.exportAsDrag(c,e,TransferHandler.COPY);
			}
		};
		ls_xmiClasses.addMouseListener(mouseAdapter);
		ls_xmiClasses.setTransferHandler(new UMLTransferHandler("test"));
		ls_xmiClasses.setFocusable(false);
		sp_xmiClasses.setFocusable(false);

		//La fenetre Proprietes
		//Ajout des composants
		pl_properties.add(tf_nom, BorderLayout.NORTH);
		pl_properties.add(cb_abstract);
		pl_properties.add(rb_private);
		pl_properties.add(rb_protected);
		pl_properties.add(rb_public);
		pl_properties.add(rb_package);
		
		//Pour rrcuperer les modification des elements aï¿½partir des proprietes
		tf_nom.addActionListener(listener);
		tf_nom.addKeyListener(listener);
		cb_abstract.addActionListener(listener);
		
		rb_private.addActionListener(listener);
		rb_protected.addActionListener(listener);
		rb_public.addActionListener(listener);
		rb_package.addActionListener(listener);
		
		//RadiosButton
		bg_visibility.add(rb_package);
		bg_visibility.add(rb_private);
		bg_visibility.add(rb_protected);
		bg_visibility.add(rb_public);
		
		//Mise en forme de la fenetre de proprietes
		tf_nom.setFont(new Font("Verdana", Font.BOLD, 14));
		tf_nom.setHorizontalAlignment(JTextField.CENTER);
		tf_nom.setForeground(Color.black);
		
		jp_attributs.setVisible(true);
		jp_methodes.setVisible(true);
		
		jp_attributs.add(cb_attributes);
		jp_methodes.add(cb_methodes);
		
		pl_properties.add(jp_attributs);
		pl_properties.add(jp_methodes);
		pl_properties.setFocusable(false);
		cb_attributes.addMouseListener(listener);
		cb_methodes.addMouseListener(listener);
		pl_properties.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		pl_properties.addKeyListener(listener);
		pl_properties.addMouseListener(listener);
		pl_properties.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		disablePropertiesPanel();
		
		bt_addAttribute.addActionListener(listener);
		bt_addMethod.addActionListener(listener);
		bt_modifyAttribute.addActionListener(listener);
		bt_modifyMethod.addActionListener(listener);		
		bt_deleteAttribute.addActionListener(listener);
		bt_deleteMethod.addActionListener(listener);

		//Mise en place du JPanel propertie
		pl_properties.setLayout(new BorderLayout());
		
		pl_properties.add(tf_nom, BorderLayout.NORTH);
		
		jl_attributs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jl_methodes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		
		//FlowLayout qui contiennent les boutons
		JPanel bt_attributs = new JPanel(new FlowLayout());
		bt_attributs.add(bt_addAttribute);
		bt_attributs.add(bt_modifyAttribute);
		bt_attributs.add(bt_deleteAttribute);
		
		//FlowLayout qui contiennent les boutons
		JPanel bt_methodes = new JPanel(new FlowLayout());
		bt_methodes.add(bt_addMethod);
		bt_methodes.add(bt_modifyMethod);
		bt_methodes.add(bt_deleteMethod);
				
		jp_inPropertie.setLayout(gridBagLayout);
		pl_properties.add(jp_inPropertie, BorderLayout.CENTER);
	
		
		gridBagConstraints.weightx = 1;
		gridBagConstraints.weighty =1;
		
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(cb_abstract, gridBagConstraints);
		jp_inPropertie.add(cb_abstract);
		gridBagConstraints.gridwidth = 1;
		
		gridBagConstraints.gridy = 2;
		gridBagLayout.setConstraints(rb_public, gridBagConstraints);
		jp_inPropertie.add(rb_public);
		gridBagLayout.setConstraints(rb_protected, gridBagConstraints);
		jp_inPropertie.add(rb_protected);
		
		
		gridBagConstraints.gridy = 3;
		gridBagLayout.setConstraints(rb_package, gridBagConstraints);
		jp_inPropertie.add(rb_package);
		gridBagLayout.setConstraints(rb_private, gridBagConstraints);
		jp_inPropertie.add(rb_private);	
		
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		
		
		gridBagConstraints.gridy = 5;
		gridBagLayout.setConstraints(jl_attributs, gridBagConstraints);
		jp_inPropertie.add(jl_attributs);
		
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(cb_attributes, gridBagConstraints);
		jp_inPropertie.add(cb_attributes);	
	
		gridBagConstraints.gridy = 7;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(bt_attributs, gridBagConstraints);
		jp_inPropertie.add(bt_attributs);
		bt_attributs.setVisible(true);
		
		gridBagConstraints.gridy = 9;
		gridBagLayout.setConstraints(jl_methodes, gridBagConstraints);
		jp_inPropertie.add(jl_methodes);
		
		gridBagConstraints.gridy = 10;
		gridBagLayout.setConstraints(cb_methodes, gridBagConstraints);
		jp_inPropertie.add(cb_methodes);
	
		gridBagConstraints.gridy = 11;		
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(bt_methodes, gridBagConstraints);
		jp_inPropertie.add(bt_methodes);

		gridBagConstraints.insets = new Insets(2, 2, 2, 2);

		cb_attributes.setMinimumSize(new Dimension(200, 23));
		cb_attributes.setSize(new Dimension(200, 23));
		cb_attributes.setPreferredSize(new Dimension(200, 23));
		cb_methodes.setMinimumSize(new Dimension(200, 23));
		cb_methodes.setSize(new Dimension(200, 23));
		cb_methodes.setPreferredSize(new Dimension(200, 23));
		cb_abstract.setFocusable(false);
		cb_attributes.setFocusable(false);
		cb_methodes.setFocusable(false);
		bt_addAttribute.setFocusable(false);
		bt_addMethod.setFocusable(false);
		bt_deleteAttribute.setFocusable(false);
		bt_deleteMethod.setFocusable(false);
		bt_modifyAttribute.setFocusable(false);
		bt_modifyMethod.setFocusable(false);
		rb_package.setFocusable(false);
		rb_private.setFocusable(false);
		rb_protected.setFocusable(false);
		rb_public.setFocusable(false);

		//La JFrame
		this.add(horizontalSplit,BorderLayout.CENTER);
		this.requestFocus(true);
		this.setVisible(true);
		this.addKeyListener(listener);
		this.addMouseListener(listener);
		this.requestFocus();
		this.setPreferredSize(new Dimension(1024,600));
		this.setSize(new Dimension(1024,600));
		this.addComponentListener(listener);
		
		verticalRightSplit.setDividerLocation((int)(getSize().height/2.25));
		tp_onglets.setSize(new Dimension((int)(this.getSize().width/1.35),(int)(this.getSize().height/3.6)));
		tp_modelisation.setSize(new Dimension((int)(this.getSize().width/1.35),(int)(this.getSize().height/1.60)));
		this.setLocationRelativeTo(this.getParent());
		this.setMinimumSize(new Dimension(300, 300));
		this.setIconImage(new ImageIcon(getClass().getResource("/icone.png")).getImage());
	}
	
	/*_______________________________________________________*/
	/** Fonction effectuant les redirections de Sytem.out et System.err vers la console de l'interface.
	 */
	private void redir()
	{
		System.setOut(new PrintStream(new JTextAreaSystemOut())); 
		System.setErr(new PrintStream(new JTextAreaSystemErr()));
	}


	/*_______________________________________________________*/
	/** Supprme l'onglet correspondant a l'index specifie.
	 * @param index 'index de l'onglet a selectionner.
	 */
	public void deleteTab(int index)
	{
		if(index >= 0)
		{
			tp_modelisation.removeTabAt(index);
			sp_modelisation.remove(index);
			bt_modelisation.remove(index);
			configureTabsColor();
		}
	}
	
	/** Supprime tous les onglets */
	public void deleteAllTabs()
	{
		tp_modelisation.removeAll();
		sp_modelisation.clear();
		bt_modelisation.clear();
	}
	
	/** Ajoute un onglet */
	public void addTab()
	{
		createGraphicPanel();
		tp_modelisation.addTab("Diagramme " + currentTabIndex ,sp_modelisation.get(sp_modelisation.size() - 1));
		tp_modelisation.setSelectedIndex(sp_modelisation.size() - 1);
		configureGraphicPanel();
		configureTabsColor();
	}
	
	/*_______________________________________________________*/
	/** Permet l'import d'un fichier XMI par l'intermediaire d'un FileChooser
	 */
	public void importXmiFile()
	{
		try
		{
			JFileChooser f = new JFileChooser();
			f.setAcceptAllFileFilterUsed(false);
			f.addChoosableFileFilter(xmiFileFilter);
			f.showDialog(this, "Ouvrir");
			File fichier;
			//On verifie la provenance du fichier et si il n'est pas null
			if((fichier = f.getSelectedFile()) != null)
			{
				Pattern p = null;
				try
				{
					p = Pattern .compile(".*\\.xmi");
					Matcher m = p.matcher(fichier.getName());
					if(m.matches())
					{
						//Creation de la classe principale effectuant la majorite des traitements 
						//tels le parsing et la lecture de l'arbre parse
						if(xmigraph != null && xmigraph.getParcoursProfondeur() != null)
						{
							xmigraph.getParcoursProfondeur().getTreeManager().getModel().removeAllElements();
						}
						xmigraph = new XMIGraph(fichier.getPath());
						if(xmigraph.getParcoursProfondeur() != null)
						{
							//Affichage dans la JList lXmiClasses des classes parsees
							//pour les afficher dans le JPanel pDessin par Drag and Drop
							ls_xmiClasses.setModel((xmigraph.getParcoursProfondeur().getTreeManager()).getModel());
							//On applique ici le pattern Observer, la liste observe un Modele
							//remplit par l'algorithme de parcours en profondeur
							ls_xmiClasses.setCellRenderer(new RenduListe());
						}
					}
					else
					{
						System.err.println("Le format du fichier selectionne est invalide. Seul le format XMI est supporte.");
					}
				}
				catch(PatternSyntaxException e1)
				{
					System.err.println("Erreur lors de la specification des formats de fichier acceptes.");
				}
			}
		}
		catch(Exception e)
		{
			System.err.println("L'import du fichier XMI sélectionné a retourné une erreur.");
		}
	}
	
	/*_______________________________________________________*/
	/** Deplace les composants selectionnes en fonction du type de deplacement souhaite
	 * @param m Le type de deplacement souhaite
	 */
	public void moveClassLayers(MoveSource m)
	{
		try
		{
			int initX = 0;
			int initY = 0;
			if(MoveSource.mouse == m)
			{
				boolean init = true;
				int pointerRefX = 0;
				int pointerRefY = 0;
				PointerInfo pointer = MouseInfo.getPointerInfo();
				pointerRefX = pointer.getLocation().x -getLastIf_modelisation().getLocationOnScreen().x;
				pointerRefY = pointer.getLocation().y - getLastIf_modelisation().getLocationOnScreen().y;
				ClassLayer classLayer;
				for(int i = getSelectedClassLayers().size()-1; i >= 0 ; --i)
				{
					classLayer = getSelectedClassLayers().get(i);
					if(init)
					{
						initX = classLayer.getLocation().x + classLayer.getSize().width/2;
						initY = classLayer.getLocation().y + classLayer.getSize().height/2;
						classLayer.setLocation(pointerRefX-classLayer.getSize().width/2, pointerRefY-classLayer.getSize().height/2);
						init = false;
					}
					else
					{
						classLayer.setLocation(classLayer.getLocation().x + pointerRefX - initX,
																 classLayer.getLocation().y + pointerRefY - initY);
					}
				}
			}
			else
			{
				int moveX = 0, moveY = 0;
				if(m == MoveSource.up)
				{
					moveY = -1;
				}
				else if(m == MoveSource.down)
					{
						moveY = 1;
					}
				else if(m == MoveSource.left)
				{
					moveX = -1;
				}
				else if(m == MoveSource.right)
				{
					moveX = 1;
				}
				ClassLayer classLayer;
				for(int i = getSelectedClassLayers().size()-1; i >= 0 ; --i)
				{
					classLayer = getSelectedClassLayers().get(i);
					initX = classLayer.getLocationOnScreen().x - getLastIf_modelisation().getLocationOnScreen().x;
					initY = classLayer.getLocationOnScreen().y - getLastIf_modelisation().getLocationOnScreen().y;
					classLayer.setLocation(initX + moveX, initY + moveY);
				}
			}
			((JComponent)getMyGlassPane()).removeAll();
			getLastIf_modelisation().getParent().repaint();
			((UMLDropTarget)getLastIf_modelisation().getDropTarget()).findRelations();
		}
		catch(Exception e)
		{
			System.err.println("Le déplacement des classes sélectionnées a retourné une erreur.");
		}
	}

	/*_______________________________________________________*/
	/** Supprime les PackagedElementComponent correspondant aux ClassLayer selectionnees du modele de la JList.
	 */
	public void deleteFromModelAndRepresentation()
	{
		try
		{
			int i;
			if(getSelectedClassLayers().size() == 1)
			{
				i = JOptionPane.showConfirmDialog(frame, "Voulez-vous vraiment supprimer la classe selectionnee ?", "Attention", JOptionPane.YES_NO_OPTION);
			}
			else
			{
				i = JOptionPane.showConfirmDialog(frame, "Voulez-vous vraiment supprimer les classes selectionnees ?", "Attention", JOptionPane.YES_NO_OPTION);
			}
			if(i == 0)
			{
				List<ClassLayer> list = new ArrayList<ClassLayer>();
				for(ClassLayer classLayer : getSelectedClassLayers())
				{
					for(JScrollPane sp_model : sp_modelisation)
					{
						if(sp_model != null)
						{
							for(Component c : ((JInternalFrame)sp_model.getViewport().getComponent(0)).getContentPane().getComponents())
							{
								if(c instanceof ClassLayer && ((ClassLayer)c).getClassComponent().getPackageData().equals(classLayer.getClassComponent().getPackageData()))
								{
									list.add((ClassLayer)c);
								}
							}
							for(ClassLayer c : list)
							{
								((JInternalFrame)sp_model.getViewport().getComponent(0)).getContentPane().remove(c);
								((JComponent)getMyGlassPane()).removeAll();
								getMyGlassPane().repaint();
								((UMLDropTarget)getLastIf_modelisation().getDropTarget()).findRelations();
							}
							sp_model.repaint();
						}
					}
					PackagedElement pe = classLayer.getClassComponent().getPackageData();
					for(Object o : ((DefaultListModel)ls_xmiClasses.getModel()).toArray())
					{
						if(o instanceof PackagedElementComponent && ((PackagedElementComponent)o).getPackagedElement().equals(pe))
						{
							((DefaultListModel)ls_xmiClasses.getModel()).removeElement(o);
						}
					}
				}
				selectedClassLayers.removeAll(selectedClassLayers);
				((JComponent)getMyGlassPane()).removeAll();
				getMyGlassPane().repaint();
				((UMLDropTarget)getLastIf_modelisation().getDropTarget()).findRelations();
				disablePropertiesPanel();
				isCtrlPressed = false;
			}
		}
		catch(Exception e)
		{
			System.err.println("La suppression définitive de la classe a retournée une erreur.");
		}
	}
	
	/*_______________________________________________________*/
	/** Classe interne privee utilisee uniquement par cette classe pour
	 * rediriger les sorties standards de la console d'origine vers notre console
	 */
	private class JTextAreaSystemOut extends OutputStream 
	{
		 /** Methode permettant l'ecriture dans la console standard.
		 * @param b Le flux de texte source.
		 */
		  public void write(int b) 
		  {
				  ta_outputConsole.append(new String(new byte[]{(byte)b}));
		  }
	}
	
	/*_______________________________________________________*/
	/** Classe interne privee utilisee uniquement par cette classe pour
	 * rediriger les sorties standards de la console d'origine vers notre console
	 */
	private class JTextAreaSystemErr extends OutputStream 
	{
		 /** Methode permettant l'ecriture dans la console d'erreurs.
		 * @param b Le flux de texte source.
		 */
		  public void write(int b) 
		  {
				  ta_errorConsole.append(new String(new byte[]{(byte)b}));
		  }
	}

	
	
	/*_______________________________________________________*/
	/** Permet de selectionner un ClassLayer. Celui-ci est ajoute a la liste des ClassLayer selectionnes,
	 * et un artefact graphique permettant d'identifier sa selection lui est attribue
	 * @param c Le ClassLayer a selectionner
	 */
	public void setClassLayerSelected(ClassLayer c)
	{
		c.setBackground(new Color(191, 205, 219));
		selectedClassLayers.add(c);
	}
	
	/*_______________________________________________________*/
	/** Desactive la fenetre de proprietes lorsque aucune classe n'est selectionnee.
	 */
	public void disablePropertiesPanel()
	{
		tf_nom.setEnabled(false);
		bg_visibility.clearSelection();
		cb_abstract.setEnabled(false);
		cb_abstract.setSelected(false);
		rb_private.setEnabled(false);
		rb_protected.setEnabled(false);
		rb_public.setEnabled(false);
		rb_package.setEnabled(false);
		cb_attributes.setEnabled(false);
		cb_methodes.setEnabled(false);
		bt_addAttribute.setEnabled(false);
		bt_addMethod.setEnabled(false);
		bt_deleteAttribute.setEnabled(false);
		bt_deleteMethod.setEnabled(false);
		bt_modifyAttribute.setEnabled(false);
		bt_modifyMethod.setEnabled(false);
		jl_attributs.setEnabled(false);
		jl_methodes.setEnabled(false);
		tf_nom.setText("");
		cb_attributes.removeAllItems();
		cb_methodes.removeAllItems();
	}
	
	
	/*_______________________________________________________*/
	/** Remplis la fenetre de proprietes avec les informations de la representation graphique selectionnee
	 */
	public void propertiesImpl()
	{
		try
		{
			tf_nom.setEnabled(true);
			cb_abstract.setEnabled(true);
			rb_private.setEnabled(true);
			rb_protected.setEnabled(true);
			rb_public.setEnabled(true);
			rb_package.setEnabled(true);
			cb_attributes.setEnabled(true);
			cb_methodes.setEnabled(true);
			bt_addAttribute.setEnabled(true);
			bt_addMethod.setEnabled(true);
			bt_deleteAttribute.setEnabled(true);
			bt_deleteMethod.setEnabled(true);
			bt_modifyAttribute.setEnabled(true);
			bt_modifyMethod.setEnabled(true);
			jl_attributs.setEnabled(true);
			jl_methodes.setEnabled(true);
			
			//On recupere le nom de la classe
			String name = selectedClassLayers.get(0).getClassComponent().getPackageData().getName().trim();
			tf_nom.setText(name);
			
			String visibility = selectedClassLayers.get(0).getClassComponent().getPackageData().getVisibility().toString();
	
			//On recupere la propriete abstract
			if (selectedClassLayers.get(0).getClassComponent().getPackageData().isIsAbstract())
			{
				cb_abstract.setSelected(true);
			}
			else
			{
				cb_abstract.setSelected(false);
			}
			
			//On recupere sa visibilite
			if (visibility.equals("package"))
			{
				rb_package.setSelected(true);
			}
			if (visibility.equals("private"))
			{
				rb_private.setSelected(true);
			}
			if (visibility.equals("public"))
			{
				rb_public.setSelected(true);
			}
			if (visibility.equals("protected"))
			{
				rb_protected.setSelected(true);
			}
	
			//On recupere les attributs de la classe
			cb_attributes.removeAllItems();
			for(AttributeComponent ac : selectedClassLayers.get(0).getClassComponent().getListAttribute())
			{
				cb_attributes.addItem(ac);
			}
			
			//On recupere les methodes de la classe
			cb_methodes.removeAllItems();
			for(MethodComponent mc : selectedClassLayers.get(0).getClassComponent().getListMethod())
			{
				cb_methodes.addItem(mc.toString());
			}
		}
		catch(Exception e)
		{
			System.err.println("La récupération des propriétés de la classe sélectionnée a retournée une erreur.");
		}
	}
	
	/*_______________________________________________________*/
	/** Met a jour toutes les representations graphiques de l'element courant.
	 * @param objComponent L'objet source
	 */
	public void updateAllRepresentations(Object objComponent)
	{
		try
		{
			List<ClassLayer> list = new ArrayList<ClassLayer>();
			for(JScrollPane sp_model : getSp_modelisation())
			{
				if(sp_model != null)
				{
					for(Component c : ((JInternalFrame)sp_model.getViewport().getComponent(0)).getContentPane().getComponents())
					{
						if(c instanceof ClassLayer && ((ClassLayer)c).getClassComponent().getPackageData().equals(getSelectedClassLayers().get(0).getClassComponent().getPackageData()))
						{
							list.add((ClassLayer)c);
						}
					}
					for(ClassLayer c : list)
					{
						if(objComponent instanceof PackagedElement)
						{
							c.getClassComponent().setAbstract(((PackagedElement)objComponent).isIsAbstract());
							c.getClassComponent().setClassName(((PackagedElement)objComponent).getName());
						}
						else if(objComponent instanceof AttributeComponent)
						{
							c.getClassComponent().getListAttribute().remove(c.getClassComponent().getListAttribute().indexOf(objComponent));
						}
						else if(objComponent instanceof MethodComponent)
						{
							String id = ((MethodComponent)objComponent).getId();
							int index = -1;
							for(int i = 0; i < c.getClassComponent().getListMethod().size(); ++i)
							{
								if(c.getClassComponent().getListMethod().get(i).getId().equals(id))
								{
									index = i;
								}
							}
							if(index != -1)
							{
								c.getClassComponent().getListMethod().remove(index);
							}
						}
						c.getClassComponent().repaint();
						c.setSize(c.getClassComponent().getWidth(), c.getClassComponent().getHeight());
					}
					if(objComponent instanceof AttributeComponent)
					{
						this.getCb_attributs().removeItem(this.getCb_attributs().getSelectedItem());
					}
					else if(objComponent instanceof MethodComponent)
					{
						this.getCb_methodes().removeItem(this.getCb_methodes().getSelectedItem());
					}
					sp_model.repaint();
					ls_xmiClasses.repaint();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.err.println("La mise à jour de la classe sélectionnée a retournée une erreur.");
		}
	}
}

