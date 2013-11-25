/*_______________________________________________________*/
/**
 * Fichier : AttributeComponent.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.TextAttribute;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.JComponent;

/**Class representing a graphical illustration of an attribute, with his type and his visibility*/
public class AttributeComponent extends JComponent 
{
	/** Generated serial version ID */
	private static final long serialVersionUID = 3810303733257014753L;

	/**The X-position of the graphic location of the attribute*/
	private int xpos;
	
	/**The Y-position of the graphic location of the attribute*/
	private int ypos;
	
	/**if the attribute is static or not*/
	private boolean isStatic;
	
	/**id of the method*/
	private String id;
	
	/**
	 * Return the id
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Set a new value for id
	 * @param  id id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the isStatic
	 */
	public boolean isStatic() {
		return isStatic;
	}

	/**
	 * @param isStatic the isStatic to set
	 */
	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}

	/**
	 * @return the nameAttribute
	 */
	public String getNameAttribute() {
		return nameAttribute;
	}

	/**
	 * @param nameAttribute the nameAttribute to set
	 */
	public void setNameAttribute(String nameAttribute) {
		this.nameAttribute = nameAttribute;
	}

	/**
	 * @return the visibilityAttribute
	 */
	public String getVisibilityAttribute() {
		return visibilityAttribute;
	}

	/**
	 * @param visibilityAttribute the visibilityAttribute to set
	 */
	public void setVisibilityAttribute(String visibilityAttribute) {
		this.visibilityAttribute = getMatchingVisibility(visibilityAttribute);
	}

	/**
	 * @return the typeAttribute
	 */
	public String getTypeAttribute() {
		return typeAttribute;
	}

	/**
	 * @param typeAttribute the typeAttribute to set
	 */
	public void setTypeAttribute(String typeAttribute) {
		this.typeAttribute = typeAttribute;
	}

	/*_______________________________________________________*/
	/** Return the x position of the AttributeComponent
	 * @return the x position
	 */
	public int getXpos() 
	{
		return xpos;
	}

	/**
	 * set the X-position of the graphic location of the attribute
	 * @param xpos the new X-position
	 */
	public void setXpos(int xpos) 
	{
		this.xpos = xpos;
	}

	/**
	 * return the Y-position of the graphic location of the attribute
	 * @return the Y-position of the graphic location of the attribute
	 */
	public int getYpos() 
	{
		return ypos;
	}

	/**
	 * Set the Y-position of the graphic location of the attribute
	 * @param ypos the new Y-position
	 */
	public void setYpos(int ypos) 
	{
		this.ypos = ypos;
	}

	/**The name of the attribute*/
	private String nameAttribute;
	
	/**The visibility of the attribute*/
	private String visibilityAttribute;
	
	/**The type of the attribute*/
	private String typeAttribute;
	
	
	/**Find the visibility graphic representation according to the visibility of the attribute
	 * @param visibility - the visibility of the attribute
	 * @return A String representing the visibility of the attribute
	 */
	private String getMatchingVisibility (String visibility)
	{
		if (visibility.equals("private"))
			return "-";
		else if (visibility.equals("package"))
			return " ";
		else if (visibility.equals("protected"))
			return "#";
		else if (visibility.equals("public"))
			return "+";
		else
			return "";
	}
	
	/**
	 * Create a new AttributeComponent with fulfilled attributes
	 * @param nName the name of the attribute
	 * @param nVisibility the visibility of the attribute
	 * @param nType the type of the attribute
	 * @param nIsStatic if the attribute is static or not
	 * @param nId the id of the attribute
	 */
	public AttributeComponent (String nName, String nVisibility, String nType, boolean nIsStatic, String nId)
	{
		super();
		nameAttribute = nName;
		visibilityAttribute = getMatchingVisibility(nVisibility);
		typeAttribute = nType;
		isStatic = nIsStatic;
		id = nId;
	}
	
	/**
	 * Create a new AttributeComponent with fulfilled attributes
	 * @param nName the name of the attribute
	 * @param nVisibility the visibility of the attribute
	 * @param nType the type of the attribute
	 * @param nId the id of the component
	 */
	public AttributeComponent (String nName, String nVisibility, String nType, String nId)
	{
		this(nName,nVisibility,nType,false, nId);
	}
	
	/**
	 * Draws the component
	 * @param g the current graphics
	 */
	public void paint(Graphics g)
	{	
		Map<TextAttribute, Object> map = new Hashtable<TextAttribute, Object>();
		map.put(TextAttribute.FAMILY, "TimesRoman");
		map.put(TextAttribute.SIZE,	14);
		map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
	 
		Font f =  new Font(map);
		Font other = g.getFont();
		
		StringBuffer str = new StringBuffer().append(visibilityAttribute).append(" ").append(nameAttribute).append(" : ").append(typeAttribute);
		
		if (isStatic)
			g.setFont(f);
		g.drawString(str.toString(), xpos, ypos);
		g.setFont(other);
	}

	/**overridden toString() method using to draw the attribute*/
	@Override
	public String toString() 
	{
		return new StringBuffer().append(visibilityAttribute).append(" ").append(nameAttribute).append(" : ").append(typeAttribute).toString();
	}
	
	
	
}
