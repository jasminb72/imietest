/**
 * 
 */
package fr.imie.business;

import fr.imie.business.IShape;

/**
 * @author imiedev
 *
 */
public class Circle implements IShape {

	private Float radius;
	
	
	@Override
	public void initialise(Float[] args) {

		this.radius = args[0];
	}

	public static String[] getConstructorParameter(){
		String[] out = {"rayon"};
		return out;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.imie.Shape#area()
	 */
	@Override
	public Float area() {
		return new Float((Math.pow(this.radius, 2)*Math.PI));
	}

	/* (non-Javadoc)
	 * @see fr.imie.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		return new Float(Math.PI*2*this.radius);
	}

}
