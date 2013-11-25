/*_______________________________________________________*/
/**
 * Fichier : MethodComponent.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JComponent;


/**Class representing a graphical illustration of a method, with its type of return, its parameter(s) and its visibility*/
public class MethodComponent extends JComponent 
{
	/** Generated serial version ID */
	private static final long serialVersionUID = -6769965724723658983L;

	/**a margin used for a better visibility of texts*/
	private final int MARGIN = 5;
	
	/**The X-position of the graphic location of the method*/
	private int xpos;
	
	/**The Y-position of the graphic location of the method*/
	private int ypos;
	
	/**The name of the method*/
	private String nameMethod;
	
	/**The visibility of the method*/
	private String visibilityMethod;
	
	/**The type of return of the method*/
	private String typeReturnMethod;
	
	/**A list that represents the parameters type*/
	private List<String> paramMethod;
	
	/**id of the method*/
	private String id;
	
	/**allows to know if the method is static or not*/
	private boolean isStatic;
		
	/**
	 * Return the isStatic
	 * @return the isStatic
	 */
	public boolean isStatic() {
		return isStatic;
	}

	/**
	 * Set a new value for isStatic
	 * @param isStatic the isStatic to set
	 */
	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}

	/**
	 * Return the id
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set a new value for id
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set a new value for nameMethod
	 * @param  nameMethod the nameMethod to set
	 */
	public void setNameMethod(String nameMethod) {
		this.nameMethod = nameMethod;
	}

	/**
	 * Return the visibilityMethod
	 * @return the visibilityMethod
	 */
	public String getVisibilityMethod() {
		return visibilityMethod;
	}

	/**
	 * Set a new value for visibilityMethod
	 * @param visibilityMethod the visibilityMethod to set
	 */
	public void setVisibilityMethod(String visibilityMethod) {
		this.visibilityMethod = getMatchingVisibility(visibilityMethod);
	}

	/**
	 * Return the typeReturnMethod
	 * @return the typeReturnMethod
	 */
	public String getTypeReturnMethod() {
		return typeReturnMethod;
	}

	/**
	 * Set a new value for typeReturnMethod
	 * @param typeReturnMethod the typeReturnMethod to set
	 */
	public void setReturnType(String typeReturnMethod) {
		this.typeReturnMethod = typeReturnMethod;
	}

	/**
	 * Return the paramMethod
	 * @return the paramMethod
	 */
	public List<String> getParamMethod() {
		return paramMethod;
	}

	/**
	 * Set a new value for paramMethod
	 * @param paramMethod the paramMethod to set
	 */
	public void setParamMethod(List<String> paramMethod) {
		this.paramMethod = paramMethod;
	}

	/**
	 * Return the isAbstract
	 * @return the isAbstract
	 */
	public boolean isAbstract() {
		return isAbstract;
	}

	/**
	 * Set a new value for isAbstract
	 * @param isAbstract the isAbstract to set
	 */
	public void setAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	}

	/**
	 * Return the X-position of the graphic location of the method
	 * @return the X-position of the graphic location of the method
	 */
	public int getXpos() 
	{
		return xpos;
	}

	/**
	 * Set the X-position of the graphic location of the method
	 * @param xpos the new X-position
	 */
	public void setXpos(int xpos) 
	{
		this.xpos = xpos;
	}

	/**
	 * Return the Y-position of the graphic location of the method
	 * @return the Y-position of the graphic location of the method
	 */
	public int getYpos() 
	{
		return ypos;
	}

	/**
	 * Set the Y-position of the graphic location of the method
	 * @param ypos the new Y-position
	 */
	public void setYpos(int ypos) 
	{
		this.ypos = ypos;
	}

	/**Allows to know whether the method is abstract or not*/
	private boolean isAbstract;
	
	/**Find the visibility graphic representation according to the visibility of the Method
	 * @param visibility - the visibility of the method
	 * @return A String representing the visibility of the method
	 * 
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
	 * Create a new MethodComponent with fulfilled methods
	 * @param nName the name of the method
	 * @param nVisibility the visibility of the method
	 * @param nTypeReturn the return type of the method
	 * @param nListParam the parameters of the method
	 * @param nIsAbstract 
	 * @param id the id of the component
	 * @param nIsStatic if the method is static or not
	 */
	public MethodComponent (String nName, String nVisibility, String nTypeReturn, List<String>nListParam, boolean nIsAbstract, Boolean nIsStatic, String id)
	{
		super();
		this.id = id;
		nameMethod = nName;
		visibilityMethod = getMatchingVisibility(nVisibility);
		typeReturnMethod= nTypeReturn;
		paramMethod = new ArrayList<String>(nListParam);
		setStatic(nIsStatic);
		isAbstract = nIsAbstract;
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
		if (isStatic)
			map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		if (isAbstract)
			map.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
		Font f =  new Font(map);
		
		Font other = g.getFont();
		
		StringBuffer str = new StringBuffer().append(visibilityMethod).append(" ").append(nameMethod).append(" ").append("(");
		if (paramMethod.size() > 0)
		{
			Iterator<String> iter = paramMethod.iterator();
			while(iter.hasNext())
			{
				str.append(iter.next());
				if (iter.hasNext())
					str.append(",");
			}
		}
		str.append(") : ").append(typeReturnMethod);
		if (isAbstract || isStatic)
			g.setFont(f);
		g.drawString(str.toString(), xpos, ypos-MARGIN);
		g.setFont(other);
	}

	/**
	 * Return the nameMethod
	 * @return the nameMethod
	 */
	public String getNameMethod() {
		return nameMethod;
	}

	/**overridden toString() method using to draw the method*/
	@Override
	public String toString() 
	{
		StringBuffer str = new StringBuffer().append(visibilityMethod).append(" ").append(nameMethod).append(" ").append("(");
		if (paramMethod.size() > 0)
		{
			Iterator<String> iter = paramMethod.iterator();
			while(iter.hasNext())
			{
				str.append(iter.next());
				if (iter.hasNext())
					str.append(",");
			}
		}
		str.append(") : ").append(typeReturnMethod);
		return str.toString();
	}
	
	
}
	