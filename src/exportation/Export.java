/*_______________________________________________________*/
/**
 * Fichier : Export.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package exportation;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.filechooser.FileFilter;



/** Classe s'occupant des exportations vers differents formats
 * @author XMIGraph Team
 */
public abstract class Export 
{
	private class ExportFileFilter extends FileFilter
	{
		/** Description du format de fichier */
		private String type;
		
		/** Extension de fichier */
		private String extension;
		
		@Override
		public String getDescription() 
		{
			return type;
		}
		
		@Override
		public boolean accept(File e) 
		{
			Pattern p;
			p = Pattern .compile(extension);
			Matcher m = p.matcher(e.getName());
			return ((e.isDirectory()|| m.matches())?true:false);
		}
		
		public ExportFileFilter(String type, String extension)
		{
			super();
			this.type = type;
			this.extension = extension;
		}
	}
	
	/** Permet d'ouvrir un dossier pour y deposer un PDF ou un PNG
	 * 
	 * @param container La frame a partir de laquelle on dessine
	 * @return le repertoire selectionne
	 */
	protected File selectDirectory(JInternalFrame container, String type, String extension)
	{
		JFileChooser f = new JFileChooser();
		f.setAcceptAllFileFilterUsed(false);
		f.setFileFilter(new ExportFileFilter(type, extension));
		
		f.showSaveDialog(container.getParent());
		File fichier;
		//On verifie la provenance du fichier et si il n'est pas null
		if((fichier = f.getSelectedFile()) != null)
		{
			return fichier;
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Verifie si le File passe en parametre existe deja
	 * @param f le fichier teste
	 * @param type l'extension du fichier
	 * @return si le fichier existe deja ou non
	 */
	protected boolean isFileExisting(File f,String type)
	{
		String chaine = f.getName() + type;
		for (File g : f.getParentFile().listFiles())
		{
			if (chaine.compareTo(g.getName()) == 0)
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Verifie si le fichier passe en paramètre possede une extension lme cas echeant il lui en met une et la retourne 
	 * @param f le fichier teste
	 * @param type l'extension du fichier
	 * @return l'extension du fichier si il n'en possede pas sinon rien
	 */
	protected String checkExtension(File f, String type)
	{		
		Pattern p;
		p = Pattern .compile(".*\\" + type);
		Matcher m = p.matcher(f.getName());
    	if (!m.matches())
    	{
    		return type;
    	}
    	return "";
	}
	
	/** exporte un diagramme vers un format different (PDF, PNG)
	 * 
	 * @param container le JComponent d'origine contenant le diagramme a dessiner
	 */
	public abstract void export(JInternalFrame container);
}
