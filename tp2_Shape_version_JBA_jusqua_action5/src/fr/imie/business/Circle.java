/**
 * 
 */
package fr.imie.business;

/**
 * @author imiedev
 *
 */
public class Circle implements IShape {

	private Float radius;
	
	
	public Circle(Float radius) {
		super();
		this.radius = radius;
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
