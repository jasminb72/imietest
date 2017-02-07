/**
 * 
 */
package fr.imie.business;

/**
 * @author imiedev
 *
 */
public class Polygon implements IShape {
	
	private Integer sideCount;
	//private final Float radius;
	private Float side;
	private Triangle triangle;
	
	@Override
	public void initialise(Float[] args) {
		this.sideCount = args[0].intValue();
		Float radius = args[1];
		this.side = new Float(2*radius*Math.sin(Math.PI/sideCount));
		this.triangle = new Triangle();
		Float[] triangleParams = {side, radius, radius};
		this.triangle.initialise(triangleParams);
	}
	
	public static String[] getConstructorParameter(){
		String[] out = {"nb de côté","rayon"};
		return out;
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
