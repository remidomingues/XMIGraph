/*_______________________________________________________*/
/**
 * Fichier : ArrowComponents.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;


import java.awt.Graphics;

/**represents an arrow : qualified link between two classes*/
public class ArrowComponents extends LineComponents
{
	/** Generated serial version ID */
	private static final long serialVersionUID = -2876873493394867683L;
	
	/**the margin*/
	private final int MARGIN = 5;

	/**
	 * fulfilled constructor for an ArrowComponents
	 * @param xbegin X-coordinates of the beginning of the line
	 * @param xend Y-coordinates of the beginning of the line
	 * @param ybegin X-coordinates of the end of the line
	 * @param yend Y-coordinates of the end of the line
	 * @param nText text to describe the association (a verb i.e.). this field can be null
	 * @param rightc the right cardinalities
	 * @param leftc the left cardinalities
	 * @param leftR the left role
	 * @param rightR the right role
	 * @param nHead the orientation of the association
	 */
	public ArrowComponents(int xbegin, int xend, int ybegin, int yend,String nText, String rightc, String leftc, String leftR, String rightR,int nHead) 
	{
		super(xbegin, xend, ybegin, yend,nText,rightc,leftc, leftR, leftR,nHead);
		
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
	public ArrowComponents(int xbegin, int xend, int ybegin, int yend,String nText, String rightc, String leftc,int nHead) 
	{
		this(xbegin, xend, ybegin, yend,nText,rightc,leftc,null , null,nHead);
		
	}
	
	/**
	 * Constructor without the description of the association and without the roles
	 * @param xbegin X-coordinates of the beginning of the line
	 * @param xend Y-coordinates of the beginning of the line
	 * @param ybegin X-coordinates of the end of the line
	 * @param yend Y-coordinates of the end of the line
	 * @param nHead the orientation of the association
	 */
	public ArrowComponents (int xbegin, int xend, int ybegin, int yend, int nHead)
	{
		super(xbegin, xend, ybegin, yend,null,null,null,null,null,nHead);
		
	}

	/**
	 * Draws the component
	 * @param g the current graphics
	 */
	@Override
	public void paint(Graphics g)
	{
		g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend(), super.getYend());
		 if (getHeadType() == 1)
		    {
		    	 g.drawLine(super.getXend()-MARGIN,super.getYend()+MARGIN,super.getXend(),super.getYend());
		    	 g.drawLine(super.getXend()+MARGIN,super.getYend()+MARGIN,super.getXend(),super.getYend());
		    }
		    else if (getHeadType() == 2)
		    {
		    	g.drawLine(super.getXend()-MARGIN, super.getYend()+MARGIN, super.getXend(), super.getYend());
			    g.drawLine(super.getXend()-MARGIN, super.getYend()-MARGIN, super.getXend(), super.getYend());
		    }
		    else if (getHeadType() == 3)
		    {
		    	g.drawLine(super.getXend()+MARGIN,super.getYend()-MARGIN,super.getXend(),super.getYend());
		    	g.drawLine(super.getXend()+MARGIN,super.getYend()+MARGIN,super.getXend(),super.getYend());
		    }
		    else if (getHeadType() == 4)
		    {
		    	g.drawLine(super.getXend()-MARGIN,super.getYend()-MARGIN,super.getXend(),super.getYend());
		    	g.drawLine(super.getXend()+MARGIN,super.getYend()-MARGIN,super.getXend(),super.getYend());
		    }
	}
}
