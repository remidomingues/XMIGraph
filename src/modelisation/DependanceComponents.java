/*_______________________________________________________*/
/**
 * Fichier : DependanceComponents.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**A representation of an arrow that represents the dependency link*/
public class DependanceComponents extends LineComponents 
{
	/** Generated serial version ID */
	private static final long serialVersionUID = 8159892399439868462L;
	
	/**the size of one stroke*/
	private final float STROKE_SIZE = 10.0f;
	
	/**the width o the line*/
	private final float STROKE_WIDTH = 1.0f;
	
	/**the miterLimit*/
	private final float MITER_LIMIT = 5.0f;
	
	/**the length where the stroke begin*/
	private final float STROKE_BEGIN = 1.0f;
	
	/**the margin*/
	private final int MARGIN = 5;
	
	/**
	 * fulfilled constructor for an RealizationComponents
	 * @param xbegin X-coordinates of the beginning of the line
	 * @param xend Y-coordinates of the beginning of the line
	 * @param ybegin X-coordinates of the end of the line
	 * @param yend Y-coordinates of the end of the line
	 * @param nHeadType the orientation of the association
	 */
	public DependanceComponents (int xbegin, int xend, int ybegin, int yend, int nHeadType)
	{
		super(xbegin, xend, ybegin, yend,null,null,null,null,null,nHeadType);		
	}
	
	/**
	 * Draws the component
	 * @param g the current graphics
	 */
	public void paint(Graphics g)
	{
	    Graphics2D g2D = (Graphics2D) g;
	    float motif []={STROKE_SIZE,STROKE_SIZE};
	    Stroke s = g2D.getStroke();
	    g2D.setStroke(new BasicStroke(STROKE_WIDTH,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,MITER_LIMIT,motif,STROKE_BEGIN));
	    g2D.drawLine(super.getXbegin(), super.getYbegin(), super.getXend(), super.getYend());
	    
	    if (getHeadType() == 1)
	    {
	    	 g2D.drawLine(super.getXend()-MARGIN,super.getYend()+MARGIN,super.getXend(),super.getYend());
	    	 g2D.drawLine(super.getXend()+MARGIN,super.getYend()+MARGIN,super.getXend(),super.getYend());
	    }
	    else if (getHeadType() == 2)
	    {
		    g2D.drawLine(super.getXend()-MARGIN, super.getYend()+MARGIN, super.getXend(), super.getYend());
		    g2D.drawLine(super.getXend()-MARGIN, super.getYend()-MARGIN, super.getXend(), super.getYend());
	    }
	    else if (getHeadType() == 3)
	    {
	    	g2D.drawLine(super.getXend()+MARGIN,super.getYend()-MARGIN,super.getXend(),super.getYend());
	    	g2D.drawLine(super.getXend()+MARGIN,super.getYend()+MARGIN,super.getXend(),super.getYend());
	    }
	    else if (getHeadType() == 4)
	    {
	    	g2D.drawLine(super.getXend()-MARGIN,super.getYend()-MARGIN,super.getXend(),super.getYend());
	    	g2D.drawLine(super.getXend()+MARGIN,super.getYend()-MARGIN,super.getXend(),super.getYend());
    	}
	    g2D.setStroke(s);
	}

}
