/**
 * 
 */
package fr.imie.business;

/**
 * @author imiedev
 *
 */
public class Square extends Rectangle {

	@Override
	public void initialise(Float[] args) {
		Float[] rectangleParams= {args[0], args[0]};
		super.initialise(rectangleParams);
	}
	
	public static String[] getConstructorParameter(){
		String[] out = {"côté"};
		return out;
	}

}
