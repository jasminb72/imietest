/**
 * 
 */
package fr.imie.business;

import java.util.ArrayList;
import java.util.List;

/**
 * @author imiedev
 *
 */
public class Rectangle implements IShape {

	private Float width;
	private Float height;

	/*
	 * public Rectangle(Float width, Float height) { super(); this.width =
	 * width; this.height = height; }
	 */

	// Juste un exemple pour passer en varargs
	public Rectangle(Float... arg) {
		super();
		this.width = arg[0];
		this.height = arg[1];

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imie.Shape#area()
	 */
	@Override
	public Float area() {
		return width * height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imie.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		return (width + height) * 2;
	}

	public static List<String> docRectangle(){
		List<String> listeDoc = new ArrayList<>();
		listeDoc.add("Paramètre 1: longueur du rectangle");
		listeDoc.add("Paramètre 2: largeur du rectangle");
		
		return listeDoc;
		
		
	}
}
