/*_______________________________________________________*/
/**
 * Fichier : UniAggregation.java
 *
 * Créé le 14 mars 2012 à 13:21:25
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;

import java.awt.Graphics;

/*_______________________________________________________*/
/**
 */
public class UniAggregation  extends LineComponents
{

	/** Generated serial version ID */
	private static final long serialVersionUID = -462456568218775928L;
	
	/**the margin*/
	private final int MARGIN = 5;
	
	/**the number of points of the arrow head*/
	private final int ARROW_NUMBER_OF_POINT = 4;
	
	/**the relative positions of the points as the head looks like a square*/
	private final int ARROW_HEAD_SQUARE_POSITION = 10;

	/**
	 * fulfilled constructor for an AggregationComponents
	 * @param xbegin X-coordinates of the beginning of the line
	 * @param xend Y-coordinates of the beginning of the line
	 * @param ybegin X-coordinates of the end of the line
	 * @param yend Y-coordinates of the end of the line
	 * @param nText text to describe the association (a verb i.e.). this field can be null
	 * @param rightc the right cardinalities.
	 * @param leftc the left cardinalities.
	 * @param leftR the left role of the association
	 * @param rightR the right role of the association
	 * @param nHead the orientation of the association
	 */
	public UniAggregation(int xbegin, int xend, int ybegin, int yend,String nText, String rightc, String leftc, String leftR, String rightR, int nHead) 
	{
		super(xbegin, xend-10, ybegin, yend,nText,rightc,leftc, leftR, rightR,nHead);		
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
	public UniAggregation(int xbegin, int xend, int ybegin, int yend,String nText, String rightc, String leftc, int nHead) 
	{
		this(xbegin, xend, ybegin, yend,nText,rightc,leftc, null, null, nHead);
		
	}

	/**
	 * Draws the component
	 * @param g the current graphics
	 */
	@Override
	public void paint(Graphics g)
	{
		int nb = ARROW_NUMBER_OF_POINT;
		setFeatures(g,getHeadType());
		if (getHeadType() == 1)
		{
			g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend(), super.getYend()+2*ARROW_HEAD_SQUARE_POSITION);
			int[]x = {super.getXend()-ARROW_HEAD_SQUARE_POSITION,super.getXend(),super.getXend()+ARROW_HEAD_SQUARE_POSITION,super.getXend()};
			int[]y = {super.getYend()+ARROW_HEAD_SQUARE_POSITION,super.getYend()+2*ARROW_HEAD_SQUARE_POSITION,super.getYend()+ARROW_HEAD_SQUARE_POSITION,super.getYend()};
			g.drawPolygon(x, y, nb);
	    	
			g.drawLine(super.getXbegin(),super.getYbegin(), super.getXbegin()-MARGIN, super.getYbegin()-MARGIN);
		    g.drawLine(super.getXbegin(),super.getYbegin(), super.getXbegin()+MARGIN, super.getYbegin()-MARGIN);
		}
		else if (getHeadType() == 2)
		{
			g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend()-ARROW_HEAD_SQUARE_POSITION, super.getYend());
			int[]x = {super.getXend()-ARROW_HEAD_SQUARE_POSITION,super.getXend(),super.getXend()+ARROW_HEAD_SQUARE_POSITION,super.getXend()};
			int[]y = {super.getYend(),super.getYend()+ARROW_HEAD_SQUARE_POSITION,super.getYend(),super.getYend()-ARROW_HEAD_SQUARE_POSITION};
			g.drawPolygon(x, y, nb);
			g.drawLine(super.getXbegin(),super.getYbegin(),super.getXbegin()+MARGIN,super.getYbegin()+MARGIN);
	    	g.drawLine(super.getXbegin(),super.getYbegin(),super.getXbegin()+MARGIN,super.getYbegin()-MARGIN);
		}
		else if (getHeadType() == 3)
		{
			g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend()+3*ARROW_HEAD_SQUARE_POSITION, super.getYend());
			int[]x = {super.getXend()+ARROW_HEAD_SQUARE_POSITION,super.getXend()+2*ARROW_HEAD_SQUARE_POSITION,super.getXend()+3*ARROW_HEAD_SQUARE_POSITION,super.getXend()+2*ARROW_HEAD_SQUARE_POSITION};
			int[]y = {super.getYend(),super.getYend()+ARROW_HEAD_SQUARE_POSITION,super.getYend(),super.getYend()-ARROW_HEAD_SQUARE_POSITION};
			g.drawPolygon(x, y, nb);
	    	g.drawLine(super.getXbegin(),super.getYbegin(),super.getXbegin()-MARGIN,super.getYbegin()+MARGIN);
	    	g.drawLine(super.getXbegin(),super.getYbegin(),super.getXbegin()-MARGIN,super.getYbegin()-MARGIN);
		}
		else if (getHeadType() == 4)
		{
			g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend(), super.getYend()-2*ARROW_HEAD_SQUARE_POSITION);
			int[]x = {super.getXend()-ARROW_HEAD_SQUARE_POSITION,super.getXend(),super.getXend()+ARROW_HEAD_SQUARE_POSITION,super.getXend()};
			int[]y = {super.getYend()-ARROW_HEAD_SQUARE_POSITION,super.getYend(),super.getYend()-ARROW_HEAD_SQUARE_POSITION,super.getYend()-2*ARROW_HEAD_SQUARE_POSITION};
			g.drawPolygon(x, y, nb);
	    	g.drawLine(super.getXbegin(),super.getYbegin(),super.getXbegin()-MARGIN,super.getYbegin()+MARGIN);
	    	g.drawLine(super.getXbegin(),super.getYbegin(),super.getXbegin()+MARGIN,super.getYbegin()+MARGIN);
		}
	}

}

/*_______________________________________________________*/
/* Fin du ficher UniAggregation.java
/*_______________________________________________________*/