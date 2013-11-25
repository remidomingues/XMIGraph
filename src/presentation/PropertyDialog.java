/*_______________________________________________________*/
/**
 * Fichier : PropertyDialog.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package presentation;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*_______________________________________________________*/
/**
 * JFrame affichant les proprietes des methodes et attributs des classes
 */
public abstract class PropertyDialog extends JDialog 
{
	/** Layout utilise (Grid) */
	protected GridLayout Layout;
	
	/** Panel Principal */
	protected JPanel pl_mainPanel;
	
	/**  Serialization  */
	protected static final long serialVersionUID = 1L;

	/** Affichage du Nom */
	protected JTextField tf_name;

	/** Affichage du isStatic */
	protected JCheckBox cb_isStatic;
	
	/** Constructeur de PropertyFrame qui agence les composants */
	public PropertyDialog(Interface i,String title, boolean modal)
	{
		// ********* Configuration des elements ********** //
		//Configuration de la fenetre
		super(i,title,true);
		this.setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(i);
	}	
}
