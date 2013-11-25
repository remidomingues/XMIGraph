/*_______________________________________________________*/
/**
 * Fichier : LineComponents.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;
import java.awt.Graphics;
import javax.swing.JComponent;

/**represent an line that can links two class*/
public class LineComponents  extends JComponent
{
	/** Generated serial version ID */
	private static final long serialVersionUID = 4579388323251733302L;
	
	/**the margin for the text to be positioned above the line*/ 
	private final int TEXT_MARGIN = 5;
	
	/**this coefficient is used so as to get the most suitable proportions of the text for its position*/
	private final int VERT_COEF = 6;
	
	/**the size of the current font*/
	private final int FONT_SIZE = 14;
	
	/**X-coordinate of the beginning of the line*/
	private int Xbegin;
	
	/**X-coordinate of the end of the line*/
	private int Xend;
	
	/**Y-coordinate of the beginning of the line*/
	private int Ybegin;
	
	/**Y-coordinate of the end of the line*/
	private int Yend;
	
	/**a text to describe the association*/
	private String text = null;
	
	/**The right cardinalities*/
	private String rightCardinalities;
	
	/**The left cardinalities*/
	private String leftCardinalities;
	
	/**the name of the role on the left-side of the association*/
	private String leftRole;
	
	/**the name of the role on the right-side of the association*/
	private String rightRole;

	/**Describe the orientation of the head of the arrow*/
	protected int headType;
	
	
	
	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ leftRole.
	 * @return La valeur du champ leftRole.
	 */
	public String getLeftRole()
	{
		return leftRole;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ rightRole.
	 * @return La valeur du champ rightRole.
	 */
	public String getRightRole()
	{
		return rightRole;
	}

	/**
	 * Return the headType
	 * @return the headType
	 */
	public int getHeadType() {
		return headType;
	}
	
	/** return the X-coordinate of the beginning of the line
	 * 
	 * @return the X-coordinate of the beginning of the line
	 */
	public int getXbegin() 
	{
		return Xbegin;
	}

	/** return the X-coordinate of the end of the line
	 * 
	 * @return the X-coordinate of the end of the line
	 */
	public int getXend() 
	{
		return Xend;
	}

	/** return the Y-coordinate of the beginning of the line
	 * 
	 * @return the Y-coordinate of the beginning of the line
	 */
	public int getYbegin() 
	{
		return Ybegin;
	}

	/** return the Y-coordinate of the end of the line
	 * 
	 * @return the Y-coordinate of the end of the line
	 */
	public int getYend() 
	{
		return Yend;
	}
	
	/**
	 * fulfilled constructor
	 * @param xbegin X-coordinates of the beginning of the line
	 * @param xend Y-coordinates of the beginning of the line
	 * @param ybegin X-coordinates of the end of the line
	 * @param yend Y-coordinates of the end of the line
	 * @param nText text to describe the association (a verb i.e.). This field can be null
	 * @param rightc the right cardinalities
	 * @param leftc the left cardinalities
	 * @param leftR the left role of the association
	 * @param rightR the right role of the association
	 * @param nHead the orientation of the association
	 */
	public LineComponents(int xbegin, int xend, int ybegin, int yend, String nText, String rightc, String leftc, String leftR, String rightR, int nHead)
	{
		Xbegin = xbegin;
		Ybegin = ybegin;
		Xend = xend;
		Yend = yend;
		text = nText;
		rightCardinalities = rightc;
		leftCardinalities = leftc;
		leftRole = leftR;
		rightRole = rightR;
		headType = nHead;
	}
	
	/**
	 * Constructor without the description of the association and without the roles
	 * @param xbegin X-coordinates of the beginning of the line
	 * @param xend Y-coordinates of the beginning of the line
	 * @param ybegin X-coordinates of the end of the line
	 * @param yend Y-coordinates of the end of the line
	 * @param rightc the right cardinalities
	 * @param leftc the left cardinalities
	 * @param nText the name of the association
	 * @param nHead the orientation of the association
	 */
	public LineComponents (int xbegin, int xend, int ybegin, int yend, String nText, String rightc, String leftc, int nHead)
	{
		this(xbegin, xend, ybegin, yend,nText, rightc, leftc, null, null,nHead);
	}
	
	/**
	 * Draws the component
	 * @param g the current graphics
	 */
	public void paint(Graphics g)
	{
		g.drawLine(Xbegin, Ybegin, Xend, Yend);
		setFeatures(g,getHeadType());
	}
	
	/**This methods is used to set features like name or cardinalities for classes inherited from this one, without 
	 * using the "drawLine" of this class that can be a problem
	 * @param g the Graphic environment
	 * @param head the orientation of the association
	 */
	protected void setFeatures (Graphics g, int head)
	{
		if(text != null)
		{
			g.drawString(text, (Xbegin+Xend)/2, (Ybegin+Yend)/2-TEXT_MARGIN);
		}
		if (rightCardinalities != null && leftCardinalities !=null)
		{
			switch (head)
			{
				//Premiere disposition des classes l'une au dessus de l'autre
				case 1 :
				{
					g.drawString(leftCardinalities, Xbegin+TEXT_MARGIN, Ybegin-TEXT_MARGIN);
					g.drawString(rightCardinalities, Xend+TEXT_MARGIN, Yend+2*TEXT_MARGIN);
					if (rightRole!=null && leftRole!=null)
					{
						g.drawString(leftRole,Xbegin-5*leftRole.length()-5*TEXT_MARGIN, Ybegin-TEXT_MARGIN);
						g.drawString(rightRole,Xend-5*leftRole.length()-5*TEXT_MARGIN, Yend+2*TEXT_MARGIN);
					}
				}
				break;
				
				//Premiere disposition des classes l'une à côté de l'autre
				case 2 :
				{
					g.drawString(leftCardinalities, Xbegin+TEXT_MARGIN, Ybegin+3*TEXT_MARGIN);
					g.drawString(rightCardinalities, Xend-(rightCardinalities.length()+2)*TEXT_MARGIN, Yend+3*TEXT_MARGIN);
					if (rightRole!=null && leftRole!=null)
					{
						g.drawString(leftRole,Xbegin+30, Ybegin-TEXT_MARGIN);
						g.drawString(rightRole,Xend-60, Yend-TEXT_MARGIN);
					}
				}
				break;

				//Seconde disposition des classes l'une à côté de l'autre
				case 3 :
				{
					g.drawString(leftCardinalities, Xbegin-5*TEXT_MARGIN, Ybegin+4*TEXT_MARGIN);
					g.drawString(rightCardinalities, Xend+(rightCardinalities.length()+1)*TEXT_MARGIN, Yend+3*TEXT_MARGIN);
					if (rightRole!=null && leftRole!=null)
					{
						g.drawString(leftRole,Xbegin-60, Ybegin-TEXT_MARGIN);
						g.drawString(rightRole,Xend+30, Yend-TEXT_MARGIN);
					}
				}
				break;

				//Seconde disposition des classes l'une au dessus de l'autre
				case 4 :
				{
					g.drawString(leftCardinalities, Xbegin+(leftCardinalities.length()+1)*TEXT_MARGIN, Ybegin+2*TEXT_MARGIN);
					g.drawString(rightCardinalities, Xend+(rightCardinalities.length()+1)*TEXT_MARGIN, Yend-2*TEXT_MARGIN);
					if (rightRole!=null && leftRole!=null)
					{
						g.drawString(leftRole,Xbegin-5*leftRole.length()-5*TEXT_MARGIN, Ybegin+2*TEXT_MARGIN);
						g.drawString(rightRole,Xend-5*leftRole.length()-5*TEXT_MARGIN, Yend-2*TEXT_MARGIN);
					}
				}
				break;
			}
		}
	}
}
