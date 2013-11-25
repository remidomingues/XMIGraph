/*_______________________________________________________*/
/**
 * Fichier : InheritanceComponents.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;

import java.awt.Graphics;

/**This class is a graphic interpretation of the inheritance link between two classes*/
public class InheritanceComponents extends LineComponents
{
	/** Generated serial version ID */
	private static final long serialVersionUID = 6075995860754033563L;
	
	/**the number of points of the arrow head*/
	private final int ARROW_NUMBER_OF_POINT = 3;
	
	/**the relative positions of the points as the head looks like a triangle*/
	private final int ARROW_HEAD_TRIANGLE_POSITION = 10;

	/**
	 * fulfilled constructor for an InheritanceComponents
	 * @param xbegin X-coordinates of the beginning of the line
	 * @param xend Y-coordinates of the beginning of the line
	 * @param ybegin X-coordinates of the end of the line
	 * @param yend Y-coordinates of the end of the line
	 * @param nHeadType the orientation of the association
	 */
	public InheritanceComponents (int xbegin, int xend, int ybegin, int yend, int nHeadType)
	{
		super(xbegin, xend, ybegin, yend,null,null,null,null,null,nHeadType);		
	}

	/**
	 * Draws the component
	 * @param g the current graphics
	 */
	public void paint(Graphics g)
	{
		int nb = ARROW_NUMBER_OF_POINT;
		if (getHeadType() == 1)
		{
			g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend(), super.getYend()+ARROW_HEAD_TRIANGLE_POSITION);
			int[]x = {super.getXend()-ARROW_HEAD_TRIANGLE_POSITION,super.getXend()+ARROW_HEAD_TRIANGLE_POSITION,super.getXend()};
			int[]y = {super.getYend()+ARROW_HEAD_TRIANGLE_POSITION,super.getYend()+ARROW_HEAD_TRIANGLE_POSITION,super.getYend()};
			g.drawPolygon(x, y, nb);
		}
		
		else if (getHeadType() == 2)
		{
			g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend()-ARROW_HEAD_TRIANGLE_POSITION, super.getYend());
			int[]x = {super.getXend()-ARROW_HEAD_TRIANGLE_POSITION,super.getXend()-ARROW_HEAD_TRIANGLE_POSITION,super.getXend()};
			int[]y = {super.getYend()+ARROW_HEAD_TRIANGLE_POSITION,super.getYend()-ARROW_HEAD_TRIANGLE_POSITION,super.getYend()};
			g.drawPolygon(x, y, nb);
		}
		
		else if (getHeadType() == 3)
		{
			g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend()+ARROW_HEAD_TRIANGLE_POSITION, super.getYend());
			int[]x = {super.getXend()+ARROW_HEAD_TRIANGLE_POSITION,super.getXend()+ARROW_HEAD_TRIANGLE_POSITION,super.getXend()};
			int[]y = {super.getYend()+ARROW_HEAD_TRIANGLE_POSITION,super.getYend()-ARROW_HEAD_TRIANGLE_POSITION,super.getYend()};
			g.drawPolygon(x, y, nb);
		}
		
		else if (getHeadType() == 4)
		{
			g.drawLine(super.getXbegin(), super.getYbegin(), super.getXend(), super.getYend()-ARROW_HEAD_TRIANGLE_POSITION);
			int[]x = {super.getXend()-ARROW_HEAD_TRIANGLE_POSITION,super.getXend()+ARROW_HEAD_TRIANGLE_POSITION,super.getXend()};
			int[]y = {super.getYend()-ARROW_HEAD_TRIANGLE_POSITION,super.getYend()-ARROW_HEAD_TRIANGLE_POSITION,super.getYend()};
			g.drawPolygon(x, y, nb);
		}
	}
}
