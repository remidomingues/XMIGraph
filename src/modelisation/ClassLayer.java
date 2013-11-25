/*_______________________________________________________*/
/**
 * Fichier : ClassLayer.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;


import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**This class extends J-Panel class and contains a ClassComponent. This system allows the component to be moved by the mouse*/
public class ClassLayer extends JPanel
{
	/** Generated serial version ID */
	private static final long serialVersionUID = -67680402975494303L;
	
	/**The class contained in the panel*/
	private ClassComponent classComponnent;


	/**
	 * Return the classComponnent
	 * @return the classComponnent
	 */
	public ClassComponent getClassComponent() 
	{
		return classComponnent;
	}

	/**Constructor
	 * @param nclass the ClassComponent to be added into the panel
	 */
	public ClassLayer(ClassComponent nclass)
	{
		super();
		setLayout(null);
		
		classComponnent = nclass;
		
		this.add(classComponnent);
		setSize(classComponnent.getWidth(), classComponnent.getHeight());
		setLocation(classComponnent.getXpos(), classComponnent.getYpos());
		classComponnent.setXpos(0);
		classComponnent.setYpos(0);
		setBackground(new Color(255, 255, 185));
		this.setBorder(new LineBorder(Color.black));
	}
}
