package fr.imie.business;

public class FactoryShape implements IFactoryShape{

	public FactoryShape() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IShape creerShape(ShapeType sharetype, Float[] params) {
		
		IShape myShape = null;
		
		switch (sharetype) {
		case Square:
			myShape = new Square();
			break;
		case Rectangle:
			myShape = new Rectangle();
			break;
		case Circle:
			myShape = new Circle();
			break;
		case Polygon:
			myShape = new Polygon();
			break;
		case Triangle:
			myShape = new Triangle();
			break;
		default:
			System.out.println("Enumération ShapeType inconnue");
			System.exit(0);
			break;
		}
		
		myShape.initialise(params);
		return myShape;
	}

}
