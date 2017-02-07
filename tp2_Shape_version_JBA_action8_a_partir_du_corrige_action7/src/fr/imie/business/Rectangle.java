/**
 * 
 */
package fr.imie.business;

/**
 * @author imiedev
 *
 */
public class Rectangle implements IShape {

	private Float width;
	private Float height;
	

	@Override
	public void initialise(Float[] args) {
		this.width = args[0];
		this.height = args[1];
	}
	
	public static String[] getConstructorParameter(){
		String[] out = {"hauteur","largeur"};
		return out;
	}

	/* (non-Javadoc)
	 * @see fr.imie.Shape#area()
	 */
	@Override
	public Float area() {
		return width*height;
	}

	/* (non-Javadoc)
	 * @see fr.imie.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		return (width+height)*2;
	}

}
