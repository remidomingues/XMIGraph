/*_______________________________________________________*/
/**
 * Fichier : ExportPDF.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package exportation;

import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

/** Exporte vers un .PDF
 * @author XMIGraph Team
 *
 */
public class ExportPDF extends Export 
{
	/** Cree un PDF a partir de components de SWING 
	 * on utilise l'API iText 5.1 pour modeliser en PDF les JComponents de la JInternalFrame
	 * 
	 * @param container La frame a partir de laquelle on dessine 
	 */
	@Override
	public void export(JInternalFrame container)
	{
	    try 
	    {
	    	String type = ".pdf";
	    	PdfWriter writer;
	    	//Format des images XMI Graph A42
	    	Rectangle A42 = new Rectangle(container.getWidth(), container.getHeight());
	        Document d = new Document(A42);
	        writer = null;
	        try
	        {
	        	File f = selectDirectory(container, "Document PDF", ".*\\.pdf");
	        	
	        	type = checkExtension(f,type);
				
	        	if (isFileExisting(f, "") || isFileExisting(f,".pdf"))
	        	{
	        		if (JOptionPane.showOptionDialog(container.getParent(), "Voulez-vous vraiment écraser le fichier " + f.getName() + ".pdf ?", "Attention ", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null,null,null) == 0)
	        		{
	        			writer = PdfWriter.getInstance(d, new FileOutputStream(f + type));
	        		}
	        	}
	        	else
	        	{
	        		writer = PdfWriter.getInstance(d, new FileOutputStream(f + type));
	        	}
	        	
	        	
	        	
	        }
	        catch (Exception e)
	        {
	        	System.err.println("Erreur lors de la selection du fichier.");
	        	return;
	        }
	        if (writer != null)
	        {
		        d.open();
		        PdfContentByte cb = writer.getDirectContent();
		        PdfTemplate template = cb.createTemplate(A42.getWidth(), A42.getHeight());
		        Graphics2D g2d = template.createGraphics(A42.getWidth(), A42.getHeight());
		        container.print(g2d);
		        g2d.dispose();
		        cb.addTemplate(template, 0, 0);
		        d.close();
	        }
	        
	    }
	    catch (Exception e) 
	    {
	    	System.err.println("Erreur lors de l'exportation vers le format PDF.");
        	return;
	    }
	}
}
