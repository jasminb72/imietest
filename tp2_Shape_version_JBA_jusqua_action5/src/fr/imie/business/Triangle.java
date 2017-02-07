/**
 * 
 */
package fr.imie.business;

/**
 * @author imiedev
 *
 */
public class Triangle implements IShape {

	private Float[] sides= new Float[3];
	
	public Triangle (Float side1, Float side2,Float side3){
		
		if(side1>side2+side3 || side2>side1+side3 || side3>side1+side2){
			throw new IllegalArgumentException("un côté ne peut pas être plus grand que la some de ces deux autres");
		}
		
		
		this.sides[0]=side1;
		this.sides[1]=side2;
		this.sides[2]=side3;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.imie.Shape#area()
	 */
	@Override
	public Float area() {
		Float p = perimeter()/2;
		double sqrt = Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
		return new Float(sqrt);
	}

	/* (non-Javadoc)
	 * @see fr.imie.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		return sides[0]+sides[1]+sides[2];
	}

}
