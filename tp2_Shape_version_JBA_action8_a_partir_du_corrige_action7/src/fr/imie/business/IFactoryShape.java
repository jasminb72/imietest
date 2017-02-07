/**
 * 
 */
package fr.imie.business;

/**
 * @author Jas - Interface de l'usine de fabrication des formes
 */
public interface IFactoryShape {
	public abstract IShape creerShape(ShapeType sharetype, Float[] params);
}
