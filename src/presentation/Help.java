/*_______________________________________________________*/
/**
 * Fichier : Aide.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Help extends JFrame {

	/**	Serialization */
	private static final long serialVersionUID = -7455659323515145028L;

	/** Constructeur */
	public Help()
	{
		super("Aide de XMIGraph");
		this.setIconImage(new ImageIcon(getClass().getResource("/icone.png")).getImage());
		JTabbedPane tp_aide = new JTabbedPane();
		JPanel pl_raccourcis = new JPanel();
		pl_raccourcis.setLayout(new BoxLayout(pl_raccourcis, BoxLayout.Y_AXIS));
		JScrollPane sp_raccourcis = new JScrollPane(pl_raccourcis);
		sp_raccourcis.setPreferredSize(new Dimension(400,485));
		
		JPanel pl_onglets = new JPanel(new BorderLayout(5,5));
		JPanel pl_ssonglets = new JPanel(new GridLayout(3,2,5,5));
		pl_ssonglets.add(new JLabel(" Ajouter :"));
		pl_ssonglets.add(new JLabel("Ctrl + T "));
		pl_ssonglets.add(new JLabel(" Fermer :"));
		pl_ssonglets.add(new JLabel("Ctrl + F4 "));
		pl_ssonglets.add(new JLabel(" Tout Fermer :"));
		pl_ssonglets.add(new JLabel("Ctrl + Shift + F4 "));
		pl_onglets.add(pl_ssonglets, BorderLayout.CENTER);
		pl_onglets.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200,221,242))," Onglets "));
		pl_raccourcis.add(pl_onglets);
		
		JPanel pl_dessin = new JPanel(new BorderLayout(5, 5));
		JPanel pl_ssdessin = new JPanel(new GridLayout(7,2,5,5));
		pl_ssdessin.add(new JLabel(" Tout Selectionner :"));
		pl_ssdessin.add(new JLabel("Ctrl + A "));
		pl_ssdessin.add(new JLabel(" Supprimer la classe :"));
		pl_ssdessin.add(new JLabel("Suppr "));
		pl_ssdessin.add(new JLabel(" Supprimer définitivement la classe :"));
		pl_ssdessin.add(new JLabel("Ctrl + Suppr "));
		pl_ssdessin.add(new JLabel(" Déplacer à gauche :"));
		pl_ssdessin.add(new JLabel("Flèche de gauche "));
		pl_ssdessin.add(new JLabel(" Déplacer à droite :"));
		pl_ssdessin.add(new JLabel("Flèche de droite "));
		pl_ssdessin.add(new JLabel(" Déplacer vers le haut :"));
		pl_ssdessin.add(new JLabel("Flèche du haut "));
		pl_ssdessin.add(new JLabel(" Déplacer vers le bas :"));
		pl_ssdessin.add(new JLabel("Flèche du bas "));
		pl_dessin.add(pl_ssdessin,BorderLayout.CENTER);
		pl_dessin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200,221,242))," Modélisation "));
		pl_raccourcis.add(pl_dessin);
		
		JPanel pl_console = new JPanel(new BorderLayout(5, 5));
		JPanel pl_ssconsole = new JPanel(new GridLayout(2,2,5,5));
		pl_ssconsole.add(new JLabel(" Sortie standard :"));
		pl_ssconsole.add(new JLabel("Ctrl + F "));
		pl_ssconsole.add(new JLabel(" Sortie d'erreurs :"));
		pl_ssconsole.add(new JLabel("Ctrl + E "));
		pl_console.add(pl_ssconsole,BorderLayout.CENTER);
		pl_console.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200,221,242))," Consoles "));
		pl_raccourcis.add(pl_console);
		
		JPanel pl_menu = new JPanel(new BorderLayout(5, 5));
		JPanel pl_ssmenu = new JPanel(new GridLayout(9,2,5,5));
		pl_ssmenu.add(new JLabel(" Fichier :"));
		pl_ssmenu.add(new JLabel("Alt + F "));
		pl_ssmenu.add(new JLabel(" Importer :"));
		pl_ssmenu.add(new JLabel("Ctrl + N, Alt + F + I"));
		pl_ssmenu.add(new JLabel(" Exporter :"));
		pl_ssmenu.add(new JLabel("Alt + F + E "));
		pl_ssmenu.add(new JLabel(" Quitter :"));
		pl_ssmenu.add(new JLabel("Alt + F + Q "));
		pl_ssmenu.add(new JLabel(" Onglets :"));
		pl_ssmenu.add(new JLabel("Alt + O "));
		pl_ssmenu.add(new JLabel(" Ajouter Onglet :"));
		pl_ssmenu.add(new JLabel("Alt + O + A "));
		pl_ssmenu.add(new JLabel(" Fermer Onglet :"));
		pl_ssmenu.add(new JLabel("Alt + O + F "));
		pl_ssmenu.add(new JLabel(" Aide :"));
		pl_ssmenu.add(new JLabel("Alt + A "));
		pl_ssmenu.add(new JLabel(" Ouvrir l'Aide :"));
		pl_ssmenu.add(new JLabel("Alt + A  + A "));
		pl_menu.add(pl_ssmenu,BorderLayout.CENTER);
		pl_menu.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200,221,242))," Menus "));
		pl_raccourcis.add(pl_menu);
		
		JPanel pl_apropos = new JPanel();
		pl_apropos.setLayout(new BoxLayout(pl_apropos, BoxLayout.Y_AXIS));
		JTextArea ta_description = new JTextArea();
		ta_description.setBackground(new Color(238,238,238));
		ta_description.setEditable(false);
		ta_description.setFont(new Font("Arial", 1, 14));
		ta_description.append("\nEquipe de Conception :\n");
		ta_description.append("\n Chef de Projet :\n");
		ta_description.append("  - BOUHOURS Cedric\n");
		ta_description.append("\n Programmeurs : \n");
		ta_description.append("  - BEAULATON Delphine\n");
		ta_description.append("  - DOMINGUES Rémi\n");
		ta_description.append("  - PLAN Michaël\n");
		ta_description.append("  - POURCHER-PORTALIER Adrien\n");
		ta_description.append("\nDescription :\n\n");
		ta_description.append("Le projet XMIGraph est avant tout un projet etudiant.\nCe projet avait pour but le développement d’une application qui,\npar l’intermédiaire d’une interface utilisateur, permettrait la\nmodélisation de diagrammes de classes UML à partir de fichiers XMI.\nL’application créée devait également permettre d’animer\ngraphiquement une transformation de diagramme de classes UML,\nen se basant sur la différenciation de deux fichiers XMI.\n" +
													"\nLe logiciel présent ainsi que son code source ont été développés\nsous licence GNU GPL :\nhttp://www.gnu.org/copyleft/gpl.html\n\nIls sont par conséquent libres d'accès et peuvent être\ntéléchargés à l'adresse suivante :\nhttp://forge.clermont-universite.fr/projects/xmigraph/files");
		ta_description.append("\n\nCompatibilité :\n\nLes fichiers XMI parsables par XMIGraph doivent répondre\n aux formats XMI 2.1 et UML 2.1.\n\nNous conseillons par ailleurs l'utilisation du logiciel BOUML\nafin de créer vos fichiers XMI.\nCe logiciel est disponible à l'adresse suivante :\nhttp://www.bouml.fr/download.html");
		pl_apropos.add(ta_description);
		pl_apropos.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200,221,242)), " Projet XMIGraph ",1,2, new Font("Arial", 1, 16)));
		JScrollPane sp_apropos = new JScrollPane(pl_apropos);
		
		JPanel pl_supplements = new JPanel();
		pl_supplements.setLayout(new BoxLayout(pl_supplements, BoxLayout.Y_AXIS));
		JTextArea ta_supplements = new JTextArea();
		ta_supplements.setBackground(new Color(238,238,238));
		ta_supplements.setFont(new Font("Arial", 1, 14));
		ta_supplements.setEditable(false);
		ta_supplements.append("\nFonctionalités implémentées\n\n" +
				"- Parseur XMI\n" +
				"- Modélisation des classes et liens UML\n" +
				"- Ajout, modification et suppression d'attributs et méthodes\n" +
				"- Export du diagramme aux formats PDF et PNG\n\n\n" +
				"Évolutions possibles\n\n" +
				"- Différenciation de fichiers XMI\n" +
				"- Export du diagramme modélisé au format XMI\n" +
				"- Cassure des liens UML\n" +
				"- Ajout, modification et suppression de classes et liens UML\n");
		pl_supplements.add(ta_supplements);
		pl_supplements.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200,221,242)), " Projet XMIGraph ",1,2, new Font("Arial", 1, 16)));
		JScrollPane sp_supplements = new JScrollPane(pl_supplements);
		
		tp_aide.addTab("Raccourcis", sp_raccourcis);
		tp_aide.addTab("Suppléments", sp_supplements);
		tp_aide.addTab("A propos", sp_apropos);
		tp_aide.setFocusable(false);
		this.add(tp_aide);
		this.pack();
		this.setVisible(true);
		this.setMinimumSize(new Dimension(200, 200));
		this.setLocationRelativeTo(getParent());
	}	
}
