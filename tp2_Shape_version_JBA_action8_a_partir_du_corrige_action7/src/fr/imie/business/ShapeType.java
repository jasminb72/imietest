/**
 * 
 */
package fr.imie.business;

/**
 * @author imiedev
 *
 */
public enum ShapeType {
	Square("carré",new String[]{"coté"}),
	Rectangle("rectangle",new String[]{"hauteur","largeur"}),
	Circle("cercle",new String[]{"rayon"}),
	Polygon("polygone ",new String[]{"nb de côté","rayon"}),
	Triangle("triangle ",new String[]{"côté 1","côté 2","côté 3"}),;
	String label;
	String[] initParams;
	ShapeType(String label, String[] initParams){
		this.label = label;
		this.initParams = initParams;
	}
	public String getLabel() {
		return label;
	}
	public String[] getInitParams() {
		return initParams;
	}
	
	
}
