/**
 * 
 */
package fr.imie.business;

import java.util.List;

/**
 * @author imiedev
 *
 */
public abstract interface IShape {
	
	public abstract Float area();
	public abstract Float perimeter();
	public abstract void initialise(Float[] params);

}
