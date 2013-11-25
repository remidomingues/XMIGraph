/*_______________________________________________________*/
/**
 * Fichier : MyGlassPane.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

/**This class must be seen as a layer that contains the associations of the model. This layer is put at the top of the model*/
public class MyGlassPane extends JComponent
{
	/** Generated serial version ID */
	private static final long serialVersionUID = -7267638478401337915L;
	
	/**
	 * Constructor of the class
	 * @param contentPane the GlassPane itself
	 */
	public MyGlassPane(Container contentPane)
	{
		GlassListener listener = new GlassListener (contentPane, this);
		addMouseListener(listener);
		addMouseMotionListener(listener);
	}
	
	/**
	 * Draws the component
	 * @param g the current graphics
	 */
	public void paint(Graphics g)
	{
		for(Component c : getComponents())
		{
			c.paint(g);
		}
	}
}

/**Listener class of the GlassPane, that redispatches MouseEvents*/
class GlassListener extends MouseInputAdapter
{
	/**this String contains the name of the component in which the MouseEvents will be redirected*/
	private final static String TARGET = "ClassLayer";
	
	/**this String contains the name of the component in which the MouseEvents will be redirected if TARGET is not chosen*/
	private final static String TARGETJIF = "JScrollPane";
	
	/** represent the panel under the glassPane*/
	private Container contentPane;
	
	/**the current MyGlassPane*/
	private MyGlassPane glassPane;
	
	/*_______________________________________________________*/
	/** Constructor
	 * @param c the container of the GlassPane
	 * @param p the listening GlassPane
	 */
	public GlassListener (Container c, MyGlassPane p)
	{
		contentPane = c;
		glassPane = p;
	}
	
	 public void mouseMoved(MouseEvent e)
	    {
	        redispatchMouseEvent(e);
	    }

    public void mouseDragged(MouseEvent e) 
    {
        redispatchMouseEvent(e);
    }

    public void mouseClicked(MouseEvent e) 
    {
        redispatchMouseEvent(e);
    }

    public void mouseEntered(MouseEvent e)
    {
        redispatchMouseEvent(e);
    }

    public void mouseExited(MouseEvent e)
    {
        redispatchMouseEvent(e);
    }

    public void mousePressed(MouseEvent e) 
    {
        redispatchMouseEvent(e);
    }

    public void mouseReleased(MouseEvent e) 
    {
        redispatchMouseEvent(e);
    }
    
    /**redirect MouveEvent to the component under the glassPane*/
    private void redispatchMouseEvent(MouseEvent e)
    {
    	Point glassPanePoint = e.getPoint();
    	Point containerPoint = SwingUtilities.convertPoint(glassPane, glassPanePoint, contentPane);
    	
    	if (containerPoint.x>=0 && containerPoint.y>=0)
    	{
    		Component component = SwingUtilities.getDeepestComponentAt(contentPane, containerPoint.x, containerPoint.y);
    		if (component != null && component.getClass().getSimpleName().equals(TARGET))
    		{
    			component.dispatchEvent(new MouseEvent(component, e.getID(), e.getWhen(), e.getModifiers(), containerPoint.x, containerPoint.y, e.getClickCount(), e.isPopupTrigger()));
    		}
    		else if (component != null && component.getParent().getParent().getParent().getParent().getParent().getClass().getSimpleName().equals(TARGETJIF))
    		{
    			component.getParent().getParent().getParent().getParent().getParent().dispatchEvent(new MouseEvent(component.getParent().getParent().getParent().getParent(), e.getID(), e.getWhen(), e.getModifiers(), containerPoint.x, containerPoint.y, e.getClickCount(), e.isPopupTrigger()));
    		}
    	}
    }
}