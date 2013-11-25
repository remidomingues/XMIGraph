/*_______________________________________________________*/
/**
 * Fichier : InheritanceComponents.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package exportation;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/** Exporte vers une image .PNG */
public class ExportPNG extends Export 
{
	/** Cree une image a partir de components de SWING
	 * 
	 * @param container La frame a partir de laquelle on dessine
	 */
	public void export(JInternalFrame container)
	{
		String type = ".png";
		BufferedImage bi = new BufferedImage(container.getWidth(), container.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.createGraphics();
		container.paint(g);
		g.dispose();
		File f = null;
		try
		{
			f = selectDirectory(container, "Image PNG", ".*\\.png");
			type = checkExtension(f,type);
			f = new File(f + type);
			
		}
		catch (Exception e1)
		{
			System.err.println("Erreur lors de la selection du fichier.");
			return;
		}
		try
		{
			if (isFileExisting(f,"") || isFileExisting(f,".png"))
			{
				if (JOptionPane.showOptionDialog(container.getParent(), "Voulez-vous vraiment écraser le fichier " + f.getName() + ".png ?", "Attention", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null,null,null) == 0)
        		{
					ImageIO.write(bi,"png",f);
        		}
			}
			else
			{
				ImageIO.write(bi,"png",f);
			}
			
		}
		catch (Exception e) 
		{
			System.err.println("Erreur lors de l'exportation vers le format PNG.");
			return;
		}
	}
}
