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
	
	@Override
	public void initialise(Float[] args) {	
		if(args[0]>args[1]+args[2] || args[1]>args[0]+args[2] || args[2]>args[0]+args[1]){
			throw new IllegalArgumentException("un côté ne peut pas être plus grand que la somme de ces deux autres");
		}
		
		this.sides=args;
//		this.sides[0]=side1;
//		this.sides[1]=side2;
//		this.sides[2]=side3;
	}
	
	public static String[] getConstructorParameter(){
		String[] out = {"côté 1","côté 2","côté 3"};
		return out;
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
