/*_______________________________________________________*/
/**
 * Fichier : ClassComponent.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package modelisation;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.OwnedOperation;
import org.eclipse.uml2._1._0._0.uml.OwnedParameter;
import org.eclipse.uml2._1._0._0.uml.PackagedElement;

import application.TreeManager;

/**Class representing a graphical illustration of a UML class, with attributes and methods*/
public class ClassComponent extends JComponent
{
	/**generated serial version id*/
	private static final long serialVersionUID = -7427535152319989974L;

	/**the position of the first line of text (title of the class not included)*/
	private final int FIRST_TEXT_POSITION = 35;
	
	/**the vertical space between two lines of text*/
	private final int TEXT_SPACING = 15;
	
	/**a marge using for a better visibility of texts*/
	private final int MARGIN = 10;
	
	/**the height of the first rectangle, containing the title of the class*/
	private final int FIRST_RECT_HEIGHT = 20;
	
	/**the size of the current font*/
	private final int FONT_SIZE = 14;
	
	/**this coefficient allows to get a fit width for the class*/ 
	private final int WIDTH_COEF = 7;
	
	/**make the text center (need to find a better way)*/
	private final int CENTER_TEXT = 45;

	/**the name of the class*/
	private String className;

	/**A List of attributes owned by the UML class with their visibility and their type.*/
	private List<AttributeComponent> listAttribute;
	
	/**this package contains data about methods, attributes, the name and the type (concrete or abstract) of the class*/
	private PackagedElement packageData;
	
	/**A list of methods owned by the UML class, with their visibility, their parameter(s) and their return type*/
	private List<MethodComponent> listMethod;
	
	/**The X-position of the graphic location of the class*/
	private int xpos;
	
	/**The Y-position of the graphic location of the class*/
	private int ypos;
	
	/**Allows to know whether the class is abstract or not*/
	private boolean isAbstract;
	
	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ listAttribute.
	 * @return La valeur du champ listAttribute.
	 */
	public List<AttributeComponent> getListAttribute()
	{
		return listAttribute;
	}

	/*_______________________________________________________*/
	/** Permet d'obtenir la valeur du champ listMethod.
	 * @return La valeur du champ listMethod.
	 */
	public List<MethodComponent> getListMethod()
	{
		return listMethod;
	}

	/**return the name of the class
	 * 
	 * @return the name of the class (String)
	 */
	public String getClassName() {
		return className;
	}

	/**set a new name for the class
	 * 
	 * @param className the new name
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/** return whether the class is abstract or not
	 * 
	 * @return a boolean that tells if the class is abstract or not
	 */
	public boolean isAbstract() {
		return isAbstract;
	}

	/** Set if the class is abstract or not
	 * 
	 * @param isAbstract the new value (a boolean)
	 */
	public void setAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	}

	/**return the X-position on the component
	 * 
	 * @return the X-position
	 */
	public int getXpos() 
	{
		return xpos;
	}

	/**return the Y-position on the component
	 * 
	 * @return the Y-position
	 */
	public int getYpos() 
	{
		return ypos;
	}

	/**set the X-position on the component
	 * 
	 * @param xpos the new X-position
	 */
	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	/**set the Y-position on the component
	 * 
	 * @param ypos the new Y-position
	 */
	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	
	/** return the PackagedElementImpl that contains data about methods, attributes, the name and the type (concrete or abstract) of the class
	 * 
	 * @return the PackagedElementImpl
	 */
	public PackagedElement getPackageData() {
		return packageData;
	}

	/**
	 *  * Create a ClassComponent
	 * @param nXpos the X-position of the ClassComponent in the window
	 * @param nYpos the Y-position of the ClassComponent in the window
	 * @param npack data about name, type, attributes and methods
	 * @param treeManager the TreeManager used in order to find attributes's and parameters's type
	 */
	public ClassComponent(int nXpos, int nYpos, PackagedElement npack, TreeManager treeManager) 
	{
		super();
		packageData = npack;
		this.listAttribute = new ArrayList<AttributeComponent>();
		this.listMethod = new ArrayList<MethodComponent>();
		
		for(OwnedAttribute attr : packageData.getOwnedAttribute())
		{
			if(attr.getAssociation() == null)
			{
				AttributeComponent attrComp = new AttributeComponent(attr.getName(), attr.getVisibility().toString(), treeManager.getTypeFromJtype(attr.getJType()),attr.isIsStatic(), attr.getId());
				listAttribute.add(attrComp);
			}
		}
		
		for(OwnedOperation operation : packageData.getOwnedOperation())
		{
			String returnType = "void";
			List<String> paramList = new ArrayList<String>();
			for(OwnedParameter p : operation.getOwnedParameter())
			{
				if(p.getDirection().equals("return"))
				{
					returnType = treeManager.getTypeFromJtype(p.getJType());
				}
				else
				{
					paramList.add(treeManager.getTypeFromJtype(p.getJType()));
				}
			}
			MethodComponent methodComp = new MethodComponent(operation.getName(), operation.getVisibility().toString(),returnType, paramList, operation.isIsAbstract(), operation.isIsStatic(),operation.getId());
			listMethod.add(methodComp);
		}
		this.xpos = nXpos;
		this.ypos = nYpos;
		this.isAbstract = packageData.isIsAbstract();
		this.className = packageData.getName();
	}
	
	/**Add an attribute in the attributeList
	 * 
	 * @param attr the attribute to add
	 */
	public void addAttribute (AttributeComponent attr)
	{
		listAttribute.add(attr);
	}
	
	/**Remove an attribute from the listAttribute
	 * 
	 * @param attr the attribute to remove
	 */
	public void deleteAttribute (AttributeComponent attr)
	{
		String strcomp = attr.getNameAttribute()+attr.isStatic()+attr.getVisibilityAttribute()+attr.getXpos()+attr.getYpos();
		for(AttributeComponent a : listAttribute)
		{
			String str2 = a.getNameAttribute()+a.isStatic()+a.getVisibilityAttribute()+a.getXpos()+a.getYpos();
			if (strcomp.compareTo(str2) == 0)
			{
				listAttribute.remove(listAttribute.indexOf(a));
			}
		}
		this.repaint();
	}
	
	/** Add a method in the listMethod
	 * 
	 * @param meth the method to add
	 */
	public void addMethod (MethodComponent meth)
	{
		listMethod.add(meth);
		this.repaint();
	}
	
	/** Remove a method from the listMethod
	 * 
	 * @param meth the method to remove
	 */
	public void deleteMethod (MethodComponent meth)
	{
		String strcomp = meth.getName()+meth.isAbstract()+meth.getVisibilityMethod()+meth.getXpos()+meth.getYpos();
		for(MethodComponent m : listMethod)
		{
			String str2 = m.getName()+m.isAbstract()+m.getVisibilityMethod()+m.getXpos()+m.getYpos();
			if (strcomp.compareTo(str2) == 0)
			{
				listMethod.remove(listMethod.indexOf(m));
			}
		}
		this.repaint();
	}
	
	/**Format the attributes and methods to be correctly placed graphically*/
	private void formatChildren()
	{
		int size = (listAttribute.size()>0?listAttribute.size():MARGIN);
		int y = FIRST_TEXT_POSITION;
		for (AttributeComponent attr : listAttribute)
		{
			attr.setXpos(this.xpos+MARGIN);
			attr.setYpos(this.ypos+y);
			y = y+TEXT_SPACING;
		}
		
		y= (listAttribute.size()>0?FIRST_RECT_HEIGHT +(FONT_SIZE+MARGIN)*size+FONT_SIZE+MARGIN: FIRST_RECT_HEIGHT +2*(FONT_SIZE+MARGIN));
		for (MethodComponent meth : listMethod)
		{
			meth.setXpos(this.xpos+MARGIN);
			meth.setYpos(this.ypos+y);
			y = y+TEXT_SPACING;
		}
	}
	
	/**return the longest string in order to have the best dimensions for the graphics
	 *   
	 * @return the longest string (int)
	 */
	public int getLongest()
	{
		int longest = 0;
		for (MethodComponent meth : listMethod)
		{
			if (meth.toString().length()> longest)
			{
				longest = meth.toString().length();
			}
		}
		
		for(AttributeComponent attr : listAttribute)
		{
			if (attr.toString().length() > longest)
			{
				longest = attr.toString().length();
			}
		}
		
		if (className.length() >longest)
		{
			longest = className.length();
		}

		return longest+2*MARGIN;
	}
	
	/*_______________________________________________________*/
	/** return the global height of the class
	 * @return the global height of the class
	 * @see javax.swing.JComponent#getHeight()
	 */
	public int getHeight()
	{
		return FIRST_RECT_HEIGHT+(getAttributeRectangleSize())+(getMethodRectangleSize());
	}
	
	/*_______________________________________________________*/
	/** return the global width of the class
	 * @return the global width of the class
	 * @see javax.swing.JComponent#getWidth()
	 */
	public int getWidth()
	{
		return getLongest()*WIDTH_COEF;
	}
	
	/*_______________________________________________________*/
	/** return the height of the attribute rectangle
	 * @return the height of the attribute rectangle (int)
	 */
	public int getAttributeRectangleSize()
	{
		if (listAttribute.size()>0)
		{
			return listAttribute.size()*(FONT_SIZE+MARGIN);
		}
		else
		{
			return 3*MARGIN;
		}
	}
	
	/**return the height of the methods rectangle
	 * 
	 * @return the height of the methods rectangle (int)
	 */
	public int getMethodRectangleSize()
	{		
		if (listMethod.size()>0)
		{
			return listMethod.size()*(FONT_SIZE+MARGIN);
		}
		else
		{
			return 2*MARGIN;
		}
	}
	
	/**
	 * Draws the component
	 * @param g the current graphics
	 */
	public void paint(Graphics g)
	{
		int width = getWidth();
		Font f = new Font("TimesRoman", Font.ITALIC, FONT_SIZE);
		Font other = new Font("TimesRoman",0, FONT_SIZE);
		
		formatChildren();
		
		g.drawRect(xpos, ypos, width, FIRST_RECT_HEIGHT);
		if (isAbstract)
			g.setFont(f);
		g.drawString(className, xpos+CENTER_TEXT, ypos+TEXT_SPACING);
		g.setFont(other);
		
		g.drawRect(xpos, ypos+FIRST_RECT_HEIGHT, width, getAttributeRectangleSize());
		for (AttributeComponent attr : listAttribute)
		{
			attr.paint(g);
		}
		
		g.drawRect(xpos, ypos+FIRST_RECT_HEIGHT+getAttributeRectangleSize(), width*10, getMethodRectangleSize());
		for(MethodComponent meth : listMethod)
		{
			meth.paint(g);
		}
	}
}
