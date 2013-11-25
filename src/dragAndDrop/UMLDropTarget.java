/*_______________________________________________________*/
/**
 * Fichier : UMLDropTarget.java
 *
 * Auteur : XMIGraph Team : BEAULATON Delphine, DOMINGUES Remi, PLAN Michael, POURCHER-PORTALIER Adrien
 */

package dragAndDrop;

import java.awt.Color;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import org.eclipse.uml2._1._0._0.uml.Generalization;
import org.eclipse.uml2._1._0._0.uml.OwnedAttribute;
import org.eclipse.uml2._1._0._0.uml.PackagedElement;

import application.TreeManager;

import modelisation.AggregationComponents;
import modelisation.ArrowComponents;
import modelisation.ClassComponent;
import modelisation.ClassLayer;
import modelisation.CompositionComponents;
import modelisation.DependanceComponents;
import modelisation.InheritanceComponents;
import modelisation.LineComponents;
import modelisation.PackagedElementComponent;
import modelisation.RealizationComponents;
import modelisation.UniAggregation;
import modelisation.UniComposition;
import presentation.Interface;

/*_______________________________________________________*/
/** DropTarget utilise pour l'export du Drag and Drop
 */
public class UMLDropTarget extends DropTarget implements Runnable
{
		/** Generated serial ID */
		private static final long serialVersionUID = -879240614115422894L;
		
		/** Interface dans laquelle le drop s'effectue */
		private Interface inter;
		
		/**Thread used to handle associations display*/
		private Thread runner;
		
		/**
		 * return the list of UML assciation from the model
		 * @return a List of PackagedElement which contains data about an association
		 */
		private List<PackagedElement> getUMLRelations()
		{
			 if(inter.getXmigraph().getParcoursProfondeur().getTreeManager() instanceof TreeManager)
		     {
				TreeManager insert =  inter.getXmigraph().getParcoursProfondeur().getTreeManager();
				return insert.getUMLRelations();
		     }
			 return null;
		}
		
		/**
		 * Tell if a component is placed on the sp_modelisation of the Interface, found by its id
		 * @param id the id of the sought component
		 * @return the sought component, or null
		 */
		private List<ClassComponent> isPositionnedToArray (String id)
		{
			List<ClassComponent> liste = new ArrayList<ClassComponent>();
			for (Component c : inter.getLastIfContentPane_modelisation().getComponents())
			{
				if (c instanceof ClassLayer)
				{
					if (((ClassLayer)c).getClassComponent().getPackageData().getId().equals(id))
					{
						liste.add(((ClassLayer)c).getClassComponent());
					}
				}
			}
			return liste;
		}
		
		/**
		 * Tell if a component, with a particular OwnedAttribute (found by its id) is placed on the sp_modelisation of the Interface
		 * @param id the id of the sought OwnedAttribute of the component
		 * @return the sought component, or null
		 */
		private List<ClassComponent> isPositionnedByAttributeToArray(String id)
		{
			List<ClassComponent> liste = new ArrayList<ClassComponent>();
			for (Component c : inter.getLastIfContentPane_modelisation().getComponents())
			{
				if (c instanceof ClassLayer)
				{
					for (OwnedAttribute o : ((ClassLayer) c).getClassComponent().getPackageData().getOwnedAttribute())
					{
						if (o.getId().compareTo(id)==0)
							liste.add(((ClassLayer)c).getClassComponent());
					}	
				}
			}
			return liste;
		}
		
		
		/** Treat generalization cases in order to add InheritanceComponents arrow to the model
		 * 
		 * @param p : the PackagedElement that contains data about the generalization
		 */
		private void treatRealization(PackagedElement p)
		{
			List<ClassComponent> listeClient = isPositionnedToArray(p.getClient());
			List<ClassComponent> listeSupplier = isPositionnedToArray(p.getSupplier());
			for (ClassComponent client : listeClient)
			{
				for (ClassComponent supplier : listeSupplier)
				{
					int attacheGX = -1;
					int attacheGY = -1;
					int attacheCX = -1;
					int attacheCY = -1;
					int head = -1;
					
					if (supplier.getParent().getLocation().y < client.getParent().getLocation().y && supplier.getParent().getLocation().x < client.getParent().getLocation().x+client.getWidth())
					{
						attacheGX = supplier.getWidth()/2+supplier.getParent().getLocation().x;
						attacheGY = supplier.getParent().getLocation().y+supplier.getHeight();
						attacheCX = client.getWidth()/2+client.getParent().getLocation().x;
						attacheCY = client.getParent().getLocation().y;
						head = 1;
					}
					else if (supplier.getParent().getLocation().x > client.getWidth() + client.getParent().getLocation().x)
					{
						attacheGX = supplier.getParent().getLocation().x;
						attacheGY = supplier.getParent().getLocation().y + supplier.getHeight()/2;
						attacheCX = client.getWidth()+client.getParent().getLocation().x;
						attacheCY = client.getParent().getLocation().y+client.getHeight()/2;
						head = 2;
					}
					else if (supplier.getParent().getLocation().x+supplier.getWidth() < client.getParent().getLocation().x)
					{
						attacheGX = supplier.getWidth()+supplier.getParent().getLocation().x;
						attacheGY = supplier.getParent().getLocation().y+supplier.getHeight()/2;
						attacheCX = client.getParent().getLocation().x;
						attacheCY = client.getParent().getLocation().y + client.getHeight()/2;
						head = 3;
					}
					else if (supplier.getParent().getLocation().y > client.getParent().getLocation().y && supplier.getParent().getLocation().x < client.getParent().getLocation().x + client.getWidth())
					{
						attacheGX = supplier.getWidth()/2+supplier.getParent().getLocation().x;
						attacheGY = supplier.getParent().getLocation().y;
						attacheCX = client.getWidth()/2+client.getParent().getLocation().x;
						attacheCY = client.getParent().getLocation().y+client.getHeight();
						head = 4;
					}
					RealizationComponents i = new RealizationComponents(attacheCX, attacheGX, attacheCY, attacheGY,head);
					((JComponent)inter.getMyGlassPane()).add(i);
					i.paint(inter.getMyGlassPane().getGraphics());
				}
			}
		}
		
		/** Treat generalization cases in order to add InheritanceComponents arrow to the model
		 * 
		 * @param c : the classLayer that contains data about the generalization
		 */
		private void treatGeneralization (ClassComponent c)
		{
			for (Generalization g : c.getPackageData().getGeneralization())
			{
				List<ClassComponent> listegeneral = isPositionnedToArray(g.getGeneral1());
				for (ClassComponent general : listegeneral)
				{	
					int attacheGX = -1;
					int attacheGY = -1;
					int attacheCX = -1;
					int attacheCY = -1;
					int head = -1;
					
					if (general.getParent().getLocation().y <= c.getParent().getLocation().y && general.getParent().getLocation().x <= c.getParent().getLocation().x+c.getWidth())
					{
						attacheGX = general.getWidth()/2+general.getParent().getLocation().x;
						attacheGY = general.getParent().getLocation().y+general.getHeight();
						attacheCX = c.getWidth()/2+c.getParent().getLocation().x;
						attacheCY = c.getParent().getLocation().y;
						head = 1; //vers le haut
					}
					else if (general.getParent().getLocation().x >= c.getWidth() + c.getParent().getLocation().x)
					{
						attacheGX = general.getParent().getLocation().x;
						attacheGY = general.getParent().getLocation().y + general.getHeight()/2;
						attacheCX = c.getWidth()+c.getParent().getLocation().x;
						attacheCY = c.getParent().getLocation().y+c.getHeight()/2;
						head = 2; //vers le droite
					}
					else if (general.getParent().getLocation().x+general.getWidth() <= c.getParent().getLocation().x)
					{
						attacheGX = general.getWidth()+general.getParent().getLocation().x;
						attacheGY = general.getParent().getLocation().y+general.getHeight()/2;
						attacheCX = c.getParent().getLocation().x;
						attacheCY = c.getParent().getLocation().y + c.getHeight()/2;
						head = 3; // vers la gauche
					}
					else if (general.getParent().getLocation().y >= c.getParent().getLocation().y && general.getParent().getLocation().x <= c.getParent().getLocation().x + c.getWidth())
					{
						attacheGX = general.getWidth()/2+general.getParent().getLocation().x;
						attacheGY = general.getParent().getLocation().y;
						attacheCX = c.getWidth()/2+c.getParent().getLocation().x;
						attacheCY = c.getParent().getLocation().y+c.getHeight();
						head = 4; // vers le bas
					}
					InheritanceComponents i = new InheritanceComponents(attacheCX, attacheGX, attacheCY, attacheGY,head);
					((JComponent)inter.getMyGlassPane()).add(i);
					i.paint(inter.getMyGlassPane().getGraphics());
				}
			}
		}
		
		/** Treat cases of dependency in order to add ArrowComponent
		 * @param p the packagedElement that contains data about the dependency
		 */
		private void treatDependency (PackagedElement p)
		{
			List<ClassComponent> listeClient = isPositionnedToArray(p.getClient());
			List<ClassComponent> listeSupplier = isPositionnedToArray(p.getSupplier());
			for (ClassComponent client : listeClient)
			{
				for (ClassComponent supplier : listeSupplier)
				{
					int attacheGX = -1;
					int attacheGY = -1;
					int attacheCX = -1;
					int attacheCY = -1;
					int head = -1;
					if (supplier.getParent().getLocation().y < client.getParent().getLocation().y && supplier.getParent().getLocation().x < client.getParent().getLocation().x+client.getWidth())
					{
						attacheGX = supplier.getWidth()/2+supplier.getParent().getLocation().x;
						attacheGY = supplier.getParent().getLocation().y+supplier.getHeight();
						attacheCX = client.getWidth()/2+client.getParent().getLocation().x;
						attacheCY = client.getParent().getLocation().y;
						head = 1;
					}
					else if (supplier.getParent().getLocation().x > client.getWidth() + client.getParent().getLocation().x)
					{
						attacheGX = supplier.getParent().getLocation().x;
						attacheGY = supplier.getParent().getLocation().y + supplier.getHeight()/2;
						attacheCX = client.getWidth()+client.getParent().getLocation().x;
						attacheCY = client.getParent().getLocation().y+client.getHeight()/2;
						head = 2;
					}
					else if (supplier.getParent().getLocation().x+supplier.getWidth() < client.getParent().getLocation().x)
					{
						attacheGX = supplier.getWidth()+supplier.getParent().getLocation().x;
						attacheGY = supplier.getParent().getLocation().y+supplier.getHeight()/2;
						attacheCX = client.getParent().getLocation().x;
						attacheCY = client.getParent().getLocation().y + client.getHeight()/2;
						head = 3;
					}
					else if (supplier.getParent().getLocation().y > client.getParent().getLocation().y && supplier.getParent().getLocation().x < client.getParent().getLocation().x + client.getWidth())
					{
						attacheGX = supplier.getWidth()/2+supplier.getParent().getLocation().x;
						attacheGY = supplier.getParent().getLocation().y;
						attacheCX = client.getWidth()/2+client.getParent().getLocation().x;
						attacheCY = client.getParent().getLocation().y+client.getHeight();
						head = 4;
					}
					DependanceComponents i = new DependanceComponents(attacheCX, attacheGX, attacheCY, attacheGY, head);
					((JComponent)inter.getMyGlassPane()).add(i);
					i.paint(inter.getMyGlassPane().getGraphics());
				}
			}
		}
		
		/** Return an OwnedAttribute, according to its id, in the specified PackagedElement
		 * @param p the PackagedElement in which the OwnedAttribute is sought
		 * @param id the id of the sought OwnedAttribute
		 * @return the OwnedAttribute, or null
		 */
		private OwnedAttribute getOwnedAttributeById(PackagedElement p, String id)
		{
			for (OwnedAttribute o : p.getOwnedAttribute())
			{
				if (o.getId().compareTo(id)==0)
				{
					return o;
				}
			}
			return null;
		}
		
		
		/** Return a String with formated cardinalities of the given OwnedAttribute
		 * 
		 * @param o the given OwnedAttribute
		 * @return the formated cardinalities
		 */
		private String getCardinalities (OwnedAttribute o)
		{
			try
			{
				if (o.getLowerValue().getValue().compareTo("0") == 0 && o.getUpperValue().getValue().compareTo("1")==0)
				{
					return "0..1";
				}
				else if (o.getLowerValue().getValue().compareTo("1") == 0 && o.getUpperValue().getValue().compareTo("1")==0)
				{
					return "1";
				}
				else if (o.getLowerValue().getValue().compareTo("1") == 0 && o.getUpperValue().getValue().compareTo("*")==0)
				{
					return "1..*";
				}
				else if (o.getLowerValue().getValue().compareTo("*") == 0 && o.getUpperValue().getValue().compareTo("*")==0)
				{
					return "*";
				}
				else
				{
					return "";
				}
			}
			catch(NullPointerException e)
			{
				return "";
			}
		}
		
		/*_______________________________________________________*/
		/** Fonction traintant la modelisation des associations liees aux balises OwnedEnd du fichier XMI.
		 * @param p PackagedElement source
		 */
		private void treatOwnedEndedAssociation(PackagedElement p)
		{
			List<ClassComponent> listec1 = null;
			List<ClassComponent> listec2 = null;
			
			listec1 = isPositionnedToArray(p.getOwnedEnd().getType());
			
			for (Component c : inter.getLastIfContentPane_modelisation().getComponents())
			{
				if (c instanceof ClassLayer)
				{
					for (OwnedAttribute o : ((ClassLayer) c).getClassComponent().getPackageData().getOwnedAttribute())
					{
						if (o.getId().compareTo(p.getMemberEnd().get(0).getIdref())==0)
						{
							if (o.getJType()!=null)
							{
								listec2 = isPositionnedToArray(o.getJType().getIdref());
							}
						}
					}
				}
			}
			
			if (listec1 != null && listec2!=null)
			{
				for (ClassComponent c1 : listec1)
				{
					for (ClassComponent c2 : listec2)
					{
						
						OwnedAttribute o1 = getOwnedAttributeById(c1.getPackageData(), p.getMemberEnd().get(0).getIdref());
						String nom1 = "";
						OwnedAttribute o2 = null;
						try
						{
							o2 = getOwnedAttributeById(c1.getPackageData(), p.getMemberEnd().get(1).getIdref());
							nom1 = (!o2.getName().equals("")?o2.getName():"");
						}
						catch(Exception e) {}
						String nom2 = (!o1.getName().equals("")?o1.getName():"");
						
						/* if both "aggregation" properties are "none"*/
						if(c1 != null && c2 != null && p.getOwnedEnd().getAggregation().compareTo("none")==0)
						{
							int attacheGX = -1;
							int attacheGY = -1;
							int attacheCX = -1;
							int attacheCY = -1;
							int head = -1;
							
							if (c1.getParent().getLocation().y < c2.getParent().getLocation().y && c1.getParent().getLocation().x < c2.getParent().getLocation().x+c2.getWidth())
							{
								attacheGX = c1.getWidth()/2+c1.getParent().getLocation().x;
								attacheGY = c1.getParent().getLocation().y+c1.getHeight();
								attacheCX = c2.getWidth()/2+c2.getParent().getLocation().x;
								attacheCY = c2.getParent().getLocation().y;
								head = 4;
							}
							else if (c1.getParent().getLocation().x > c2.getWidth() + c2.getParent().getLocation().x)
							{
								attacheGX = c1.getParent().getLocation().x;
								attacheGY = c1.getParent().getLocation().y + c1.getHeight()/2;
								attacheCX = c2.getWidth()+c2.getParent().getLocation().x;
								attacheCY = c2.getParent().getLocation().y+c2.getHeight()/2;
								head = 3;
							}
							else if (c1.getParent().getLocation().x+c1.getWidth() < c2.getParent().getLocation().x)
							{
								attacheGX = c1.getWidth()+c1.getParent().getLocation().x;
								attacheGY = c1.getParent().getLocation().y+c1.getHeight()/2;
								attacheCX = c2.getParent().getLocation().x;
								attacheCY = c2.getParent().getLocation().y + c2.getHeight()/2;
								head = 2;
							}
							else if (c1.getParent().getLocation().y > c2.getParent().getLocation().y && c1.getParent().getLocation().x < c2.getParent().getLocation().x + c2.getWidth())
							{
								attacheGX = c1.getWidth()/2+c1.getParent().getLocation().x;
								attacheGY = c1.getParent().getLocation().y;
								attacheCX = c2.getWidth()/2+c2.getParent().getLocation().x;
								attacheCY = c2.getParent().getLocation().y+c2.getHeight();
								head = 1;
							}
							ArrowComponents l = new ArrowComponents(attacheGX, attacheCX, attacheGY, attacheCY,
									p.getName(),
									getCardinalities(o2), getCardinalities(o1),nom1,nom2,head);
							((JComponent)inter.getMyGlassPane()).add(l);
							l.paint(inter.getMyGlassPane().getGraphics());
						}
						
						/* if one of the "aggregation" properties is "share"*/
						else if (c1 != null && c2 != null && (p.getOwnedEnd().getAggregation().compareTo("shared")==0))
						{
							ClassComponent begin = null;
							ClassComponent end = null;
							begin = c2;
							end = c1;
							int attacheGX = -1;
							int attacheGY = -1;
							int attacheCX = -1;
							int attacheCY = -1;
							int head = -1;
							
							if (end.getParent().getLocation().y < begin.getParent().getLocation().y && end.getParent().getLocation().x < begin.getParent().getLocation().x+begin.getWidth())
							{
								attacheGX = end.getWidth()/2+end.getParent().getLocation().x;
								attacheGY = end.getParent().getLocation().y+end.getHeight();
								attacheCX = begin.getWidth()/2+begin.getParent().getLocation().x;
								attacheCY = begin.getParent().getLocation().y;
								head = 1;
							}
							else if (end.getParent().getLocation().x > begin.getWidth() + begin.getParent().getLocation().x)
							{
								attacheGX = end.getParent().getLocation().x;
								attacheGY = end.getParent().getLocation().y + end.getHeight()/2;
								attacheCX = begin.getWidth()+begin.getParent().getLocation().x;
								attacheCY = begin.getParent().getLocation().y+begin.getHeight()/2;
								head = 2;
							}
							else if (end.getParent().getLocation().x+end.getWidth() < begin.getParent().getLocation().x)
							{
								attacheGX = end.getWidth()+end.getParent().getLocation().x;
								attacheGY = end.getParent().getLocation().y+end.getHeight()/2;
								attacheCX = begin.getParent().getLocation().x;
								attacheCY = begin.getParent().getLocation().y + begin.getHeight()/2;
								head = 3;
							}
							else if (end.getParent().getLocation().y > begin.getParent().getLocation().y && end.getParent().getLocation().x < begin.getParent().getLocation().x + begin.getWidth())
							{
								attacheGX = end.getWidth()/2+end.getParent().getLocation().x;
								attacheGY = end.getParent().getLocation().y;
								attacheCX = begin.getWidth()/2+begin.getParent().getLocation().x;
								attacheCY = begin.getParent().getLocation().y+begin.getHeight();
								head = 4;
							}
							UniAggregation agg = new UniAggregation(attacheCX, attacheGX, attacheCY, attacheGY,
									p.getName(),
									getCardinalities(o2), getCardinalities(o1),nom1,nom2,head);
							((JComponent)inter.getMyGlassPane()).add(agg);
							agg.paint(inter.getMyGlassPane().getGraphics());
							
						}
						
						/*Composition*/
						else if (c1 != null && c2 != null && (p.getOwnedEnd().getAggregation().compareTo("composite")==0 ))
						{
							ClassComponent begin = null;
							ClassComponent end = null;
							begin = c2;
							end = c1;
							
							int attacheGX = -1;
							int attacheGY = -1;
							int attacheCX = -1;
							int attacheCY = -1;
							int head = -1;
							
							if (end.getParent().getLocation().y < begin.getParent().getLocation().y && end.getParent().getLocation().x < begin.getParent().getLocation().x+begin.getWidth())
							{
								attacheGX = end.getWidth()/2+end.getParent().getLocation().x;
								attacheGY = end.getParent().getLocation().y+end.getHeight();
								attacheCX = begin.getWidth()/2+begin.getParent().getLocation().x;
								attacheCY = begin.getParent().getLocation().y;
								head = 1;
							}
							else if (end.getParent().getLocation().x > begin.getWidth() + begin.getParent().getLocation().x)
							{
								attacheGX = end.getParent().getLocation().x;
								attacheGY = end.getParent().getLocation().y + end.getHeight()/2;
								attacheCX = begin.getWidth()+begin.getParent().getLocation().x;
								attacheCY = begin.getParent().getLocation().y+begin.getHeight()/2;
								head = 2;
							}
							else if (end.getParent().getLocation().x+end.getWidth() < begin.getParent().getLocation().x)
							{
								attacheGX = end.getWidth()+end.getParent().getLocation().x;
								attacheGY = end.getParent().getLocation().y+end.getHeight()/2;
								attacheCX = begin.getParent().getLocation().x;
								attacheCY = begin.getParent().getLocation().y + begin.getHeight()/2;
								head = 3;
							}
							else if (end.getParent().getLocation().y > begin.getParent().getLocation().y && end.getParent().getLocation().x < begin.getParent().getLocation().x + begin.getWidth())
							{
								attacheGX = end.getWidth()/2+end.getParent().getLocation().x;
								attacheGY = end.getParent().getLocation().y;
								attacheCX = begin.getWidth()/2+begin.getParent().getLocation().x;
								attacheCY = begin.getParent().getLocation().y+begin.getHeight();
								head = 4;
							}
							UniComposition cmpt = new UniComposition(attacheCX, attacheGX, attacheCY, attacheGY,
									p.getName(),
									getCardinalities(o2), getCardinalities(o1),nom1,nom2,head);
							((JComponent)inter.getMyGlassPane()).add(cmpt);
							cmpt.paint(inter.getMyGlassPane().getGraphics());
						}
					}
				}
			}
		}
		
		/**
		 * treat different case of association : "none" association, "share" association and "composite" association
		 * @param p package that contains data about the association
		 */
		private void treatAssociation (PackagedElement p)
		{
			List<ClassComponent> listec1 = isPositionnedByAttributeToArray(p.getMemberEnd().get(0).getIdref());
			List<ClassComponent> listec2 = isPositionnedByAttributeToArray(p.getMemberEnd().get(1).getIdref());
			
			for (ClassComponent c1 : listec1)
			{
				for (ClassComponent c2 : listec2)
				{
					
					OwnedAttribute o1 = getOwnedAttributeById(c1.getPackageData(), p.getMemberEnd().get(0).getIdref());
					OwnedAttribute o2 = getOwnedAttributeById(c2.getPackageData(), p.getMemberEnd().get(1).getIdref());
					String nom1 = (!o1.getName().equals("")?o1.getName():"");
					String nom2 = (!o2.getName().equals("")?o2.getName():"");
					
					/* if both "aggregation" properties are "none"*/
					if(c1 != null && c2 != null && o1.getAggregation().compareTo("none")==0 && o2.getAggregation().compareTo("none")==0)
					{
						int attacheGX = -1;
						int attacheGY = -1;
						int attacheCX = -1;
						int attacheCY = -1;
						int head = -1;
						
						if (c1.getParent().getLocation().y < c2.getParent().getLocation().y && c1.getParent().getLocation().x < c2.getParent().getLocation().x+c2.getWidth())
						{
							attacheGX = c1.getWidth()/2+c1.getParent().getLocation().x;
							attacheGY = c1.getParent().getLocation().y+c1.getHeight();
							attacheCX = c2.getWidth()/2+c2.getParent().getLocation().x;
							attacheCY = c2.getParent().getLocation().y;
							head = 1;
						}
						else if (c1.getParent().getLocation().x > c2.getWidth() + c2.getParent().getLocation().x)
						{
							attacheGX = c1.getParent().getLocation().x;
							attacheGY = c1.getParent().getLocation().y + c1.getHeight()/2;
							attacheCX = c2.getWidth()+c2.getParent().getLocation().x;
							attacheCY = c2.getParent().getLocation().y+c2.getHeight()/2;
							head = 2;
						}
						else if (c1.getParent().getLocation().x+c1.getWidth() < c2.getParent().getLocation().x)
						{
							attacheGX = c1.getWidth()+c1.getParent().getLocation().x;
							attacheGY = c1.getParent().getLocation().y+c1.getHeight()/2;
							attacheCX = c2.getParent().getLocation().x;
							attacheCY = c2.getParent().getLocation().y + c2.getHeight()/2;
							head = 3;
						}
						else if (c1.getParent().getLocation().y > c2.getParent().getLocation().y && c1.getParent().getLocation().x < c2.getParent().getLocation().x + c2.getWidth())
						{
							attacheGX = c1.getWidth()/2+c1.getParent().getLocation().x;
							attacheGY = c1.getParent().getLocation().y;
							attacheCX = c2.getWidth()/2+c2.getParent().getLocation().x;
							attacheCY = c2.getParent().getLocation().y+c2.getHeight();
							head = 4;
						}
						LineComponents l = new LineComponents(attacheCX, attacheGX, attacheCY, attacheGY,
								p.getName(),
								getCardinalities(o2), getCardinalities(o1),nom1,nom2,head);
						((JComponent)inter.getMyGlassPane()).add(l);
						l.paint(inter.getMyGlassPane().getGraphics());
					}
					
					/* if one of the "aggregation" properties is "share"*/
					else if (c1 != null && c2 != null && (o1.getAggregation().compareTo("shared")==0 || o2.getAggregation().compareTo("shared")==0))
					{
						ClassComponent begin = null;
						ClassComponent end = null;
						if (o1.getAggregation().compareTo("shared")==0)
						{
							begin = c1;
							end = c2;
						}
						else if (o2.getAggregation().compareTo("shared")==0)
						{	
							begin = c2;
							end = c1;
						}
						int attacheGX = -1;
						int attacheGY = -1;
						int attacheCX = -1;
						int attacheCY = -1;
						int head = -1;
						
						if (end.getParent().getLocation().y < begin.getParent().getLocation().y && end.getParent().getLocation().x < begin.getParent().getLocation().x+begin.getWidth())
						{
							attacheGX = end.getWidth()/2+end.getParent().getLocation().x;
							attacheGY = end.getParent().getLocation().y+end.getHeight();
							attacheCX = begin.getWidth()/2+begin.getParent().getLocation().x;
							attacheCY = begin.getParent().getLocation().y;
							head = 1;
						}
						else if (end.getParent().getLocation().x > begin.getWidth() + begin.getParent().getLocation().x)
						{
							attacheGX = end.getParent().getLocation().x;
							attacheGY = end.getParent().getLocation().y + end.getHeight()/2;
							attacheCX = begin.getWidth()+begin.getParent().getLocation().x;
							attacheCY = begin.getParent().getLocation().y+begin.getHeight()/2;
							head = 2;
						}
						else if (end.getParent().getLocation().x+end.getWidth() < begin.getParent().getLocation().x)
						{
							attacheGX = end.getWidth()+end.getParent().getLocation().x;
							attacheGY = end.getParent().getLocation().y+end.getHeight()/2;
							attacheCX = begin.getParent().getLocation().x;
							attacheCY = begin.getParent().getLocation().y + begin.getHeight()/2;
							head = 3;
						}
						else if (end.getParent().getLocation().y > begin.getParent().getLocation().y && end.getParent().getLocation().x < begin.getParent().getLocation().x + begin.getWidth())
						{
							attacheGX = end.getWidth()/2+end.getParent().getLocation().x;
							attacheGY = end.getParent().getLocation().y;
							attacheCX = begin.getWidth()/2+begin.getParent().getLocation().x;
							attacheCY = begin.getParent().getLocation().y+begin.getHeight();
							head = 4;
						}
						AggregationComponents agg = new AggregationComponents(attacheCX, attacheGX, attacheCY, attacheGY,
								p.getName(),
								getCardinalities(o2), getCardinalities(o1),nom1,nom2,head);
						((JComponent)inter.getMyGlassPane()).add(agg);
						agg.paint(inter.getMyGlassPane().getGraphics());
						
					}
					else if (c1 != null && c2 != null && (o1.getAggregation().compareTo("composite")==0 || o2.getAggregation().compareTo("composite")==0))
					{
						ClassComponent begin = null;
						ClassComponent end = null;
						if (o1.getAggregation().compareTo("composite")==0)
						{
							begin = c1;
							end = c2;
						}
						else if (o2.getAggregation().compareTo("composite")==0)
						{
							begin = c2;
							end = c1;
						}
						
						int attacheGX = -1;
						int attacheGY = -1;
						int attacheCX = -1;
						int attacheCY = -1;
						int head = -1;
						
						if (end.getParent().getLocation().y < begin.getParent().getLocation().y && end.getParent().getLocation().x < begin.getParent().getLocation().x+begin.getWidth())
						{
							attacheGX = end.getWidth()/2+end.getParent().getLocation().x;
							attacheGY = end.getParent().getLocation().y+end.getHeight();
							attacheCX = begin.getWidth()/2+begin.getParent().getLocation().x;
							attacheCY = begin.getParent().getLocation().y;
							head = 1;
						}
						else if (end.getParent().getLocation().x > begin.getWidth() + begin.getParent().getLocation().x)
						{
							attacheGX = end.getParent().getLocation().x;
							attacheGY = end.getParent().getLocation().y + end.getHeight()/2;
							attacheCX = begin.getWidth()+begin.getParent().getLocation().x;
							attacheCY = begin.getParent().getLocation().y+begin.getHeight()/2;
							head = 2;
						}
						else if (end.getParent().getLocation().x+end.getWidth() < begin.getParent().getLocation().x)
						{
							attacheGX = end.getWidth()+end.getParent().getLocation().x;
							attacheGY = end.getParent().getLocation().y+end.getHeight()/2;
							attacheCX = begin.getParent().getLocation().x;
							attacheCY = begin.getParent().getLocation().y + begin.getHeight()/2;
							head = 3;
						}
						else if (end.getParent().getLocation().y > begin.getParent().getLocation().y && end.getParent().getLocation().x < begin.getParent().getLocation().x + begin.getWidth())
						{
							attacheGX = end.getWidth()/2+end.getParent().getLocation().x;
							attacheGY = end.getParent().getLocation().y;
							attacheCX = begin.getWidth()/2+begin.getParent().getLocation().x;
							attacheCY = begin.getParent().getLocation().y+begin.getHeight();
							head = 4;
						}
						
						CompositionComponents cmpt = new CompositionComponents(attacheCX, attacheGX, attacheCY, attacheGY,
								p.getName(),
								getCardinalities(o2), getCardinalities(o1),nom1,nom2,head);
						((JComponent)inter.getMyGlassPane()).add(cmpt);
						cmpt.paint(inter.getMyGlassPane().getGraphics());
					}
				}
			}
		}
		
		/**
		 * Method called by the thread, used to find the association that can be displayed
		 */
		public void findRelations ()
		{
			for (PackagedElement p : getUMLRelations())
			{
				//traiter realization
				if (p.getType().compareTo("uml:Realization")==0)
				{
					treatRealization(p);
				}
				//traiter dependancies
				if (p.getType().compareTo("uml:Dependency")==0)
				{
					treatDependency(p);
				}
				//traiter generalization
				if (p.getGeneralization().size()>0)
				{
					List<ClassComponent> list = isPositionnedToArray(p.getId());
					for (ClassComponent c : list)
					{
						treatGeneralization(c);
					}
				}
				//traiter assoc
				if (p.getType().compareTo("uml:Association")==0)
				{
					if (p.getOwnedEnd()!=null)
					{
						treatOwnedEndedAssociation(p);
					}
					else
					{
						treatAssociation(p);
					}
				}
			}
		}

		
		/*_______________________________________________________*/
		/** Methode appelee pour le drop de l'element deplace a partir de la JList
		 * @param dtde
		 * @see java.awt.dnd.DropTarget#drop(java.awt.dnd.DropTargetDropEvent)
		 */
		public void drop(DropTargetDropEvent dtde) 
		{
				try
				{
					Transferable transferable = dtde.getTransferable();
					PackagedElementComponent pec =(PackagedElementComponent)(transferable).getTransferData(UMLTransferableElement.dataFlavor);
					//Recuperation des coordonnees de la souris par rapport au composant choisi pour deposer l'objet selectionne
					PointerInfo pointer = MouseInfo.getPointerInfo();
					int x = pointer.getLocation().x - inter.getLastIfContentPane_modelisation().getLocationOnScreen().x;
					int y = pointer.getLocation().y - inter.getLastIfContentPane_modelisation().getLocationOnScreen().y;
					//Creation de la classe
					ClassComponent c = new ClassComponent(x,y,pec.getPackagedElement(), inter.getXmigraph().getParcoursProfondeur().getTreeManager());
					//Ajout de la classe au WorkspaceComponent
					ClassLayer cl = new ClassLayer(c);
					cl.addMouseMotionListener(inter.getListener());
					cl.addMouseListener(inter.getListener());
					cl.setBackground(new Color(255, 255, 185));
					if(inter.getSelectedClassLayers().size() != 0)
					{
						for(ClassLayer classLayer : inter.getSelectedClassLayers())
						{
								classLayer.setBackground(new Color(255, 255, 185));
						}
					}
					inter.getSelectedClassLayers().removeAll(inter.getSelectedClassLayers());
					inter.getLastIfContentPane_modelisation().add(cl);
					inter.disablePropertiesPanel();
					inter.getLastIf_modelisation().repaint();
					runner.run();
				}
				catch (Exception e)
				{
					System.err.println("Le gestionnaire de Drag an Drop a rencontre une erreur lors de l'exportation des donnees selectionnees vers le composant de destination.\nCeci peut etre cause par un fichier XMI non valide.");
				}
		}
		
		/*_______________________________________________________*/
		/** Constructeur
		 * @param i Interface principale
		 */
		public UMLDropTarget(Interface i)
		{
			runner = new Thread(this);
			inter  = i;
		}

		/*_______________________________________________________*/
		/** Fonction appelee a l'execution du thread.
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() 
		{
			findRelations();
		}
}

/*_______________________________________________________*/
/* Fin du ficher DropTarget.java
/*_______________________________________________________*/