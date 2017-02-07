/**
 * 
 */
package fr.imie.IHM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.imie.business.Circle;
import fr.imie.business.IShape;
import fr.imie.business.Polygon;
import fr.imie.business.Rectangle;
import fr.imie.business.Square;
import fr.imie.business.Triangle;

/**
 * @author Jas
 *
 */
public class ShapeGestionAffichage {

	public void start() {
		Rectangle rectangle = new Rectangle(10f, 10f, 100000f); // ps: le
																// 1000000f
																// ne sert à
																// rien
		this.printAreaOf(rectangle);
		this.printPerimeterOf(rectangle);

		Circle circle = new Circle(10f);
		this.printAreaOf(circle);
		this.printPerimeterOf(circle);

		Square square = new Square(5f);
		this.printAreaOf(square);
		this.printPerimeterOf(square);
		Triangle triangle = null;
		try {
			triangle = new Triangle(5f, 10f, 12f);
		} catch (IllegalArgumentException e) {
			System.out.format("le triangle n'a pas pu etre crÃ©Ã© : %S\n", e.getMessage());
		}
		if (triangle != null) {
			this.printAreaOf(triangle);
			this.printPerimeterOf(triangle);
		}

		Polygon polygon = new Polygon(10000, 10f);
		this.printAreaOf(polygon);
		this.printPerimeterOf(polygon);

		List<IShape> shapes = new ArrayList<>();
		shapes.add(rectangle);
		shapes.add(circle);
		shapes.add(polygon);
		shapes.add(square);
		shapes.add(triangle);
		this.sumAreaList(shapes);

		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle forme voulez vous créer");
		String forme = sc.nextLine();
		switch (forme) {
		case "Rectangle":
			
			Float[] params = new Float[2];
			for (int i = 0; i < Rectangle.docRectangle().size(); i++){
					System.out.println(Rectangle.docRectangle().get(i));
					try{
						params[i] = sc.nextFloat();
					}
					catch (Exception E){
						System.out.println("Valeur saisie non numérique. Arrêt de l'application");
						System.exit(0);
					}
				}
			IShape shape1 = new Rectangle(params);
			this.printAreaOf(shape1);
			this.printPerimeterOf(shape1);
			break;
		default:
			System.out.println("Forme inconnue. Arrêt de l'application");
			System.exit(0);

		}

	}

	public void printAreaOf(IShape InterfaceShape) {
		System.out.format("L'aire de mon %S est de %S\n", InterfaceShape.getClass().getSimpleName(),
				InterfaceShape.area());

	}

	public void printPerimeterOf(IShape InterfaceShape) {
		System.out.format("Le pÃ©rimÃ¨tre de mon %S est de %S\n", InterfaceShape.getClass().getSimpleName(),
				InterfaceShape.perimeter());

	}

	public void sumAreaList(List<IShape> shapes) {
		Float sum = 0.0f;
		for (IShape shape : shapes) {
			sum += shape.area();
		}

		System.out.format("L'aire totale des formes de la liste est de %S\n", sum);

	}

}
