/**
 * 
 */
package fr.imie.runner;

import fr.imie.business.FactoryShape;
import fr.imie.business.IFactoryShape;
import fr.imie.presentation.ShapePresentation;

/**
 * @author imiedev
 *
 */
public class ShapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Cr�ation de l'usine, car l'IHM d�pend de l'interface de l'usine
		IFactoryShape iFactoryShape=new FactoryShape();
		ShapePresentation presentation = new ShapePresentation(iFactoryShape);
		presentation.start();
	}



}
