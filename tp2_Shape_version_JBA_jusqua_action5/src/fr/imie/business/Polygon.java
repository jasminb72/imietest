/**
 * 
 */
package fr.imie.business;

/**
 * @author imiedev
 *
 */
public class Polygon implements IShape {
	
	private final Integer sideCount;
	//private final Float radius;
	private final Float side;
	private final Triangle triangle;
	
	public Polygon(Integer sideCount, Float radius) {
		super();
		this.sideCount = sideCount;
		//this.radius = radius;
		this.side = new Float(2*radius*Math.sin(Math.PI/sideCount));
		this.triangle = new Triangle(side, radius, radius);
	}

	@Override
	public Float area() {
		return this.sideCount*this.triangle.area();
	}

	@Override
	public Float perimeter() {
		return this.side*this.sideCount;
	}
	
	
	
	

}
