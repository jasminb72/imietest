package fr.imie.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.imie.business.Circle;
import fr.imie.business.IFactoryShape;
import fr.imie.business.IShape;
import fr.imie.business.Polygon;
import fr.imie.business.Rectangle;
import fr.imie.business.ShapeType;
import fr.imie.business.Square;
import fr.imie.business.Triangle;

public class ShapePresentation {

	List<IShape> shapes = new ArrayList<>();
	IFactoryShape iFactoryShape;
	
	public ShapePresentation(IFactoryShape iFactoryShape){
		this.iFactoryShape=iFactoryShape;
	}
	
	/*
	 * Algorithme de l'application
	 * 
	 * L'IHM demande à l'utilisateur une forme à créer ou d'arrêter le programme
	 * L'utilisateur fait une saisie entre (1 et 5) ou "X"
	 * Tant que l'utilisateur demande de continuer (saisie <> "X"):
	 * 		L'IHM demande les dimensions de la forme
	 * 		L'utilisateur renseigne les dimensions de la forme
	 * 		L'IHM crée la forme
	 *		L'IHM demande à l'utilisateur une forme à créer ou d'arrêter le programme
	 *		L'utilisateur fait une saisie entre (1 et 5) ou "X"
	 * Fin tant que
	 */
	public void start(){
		
		String response ="";
		
		do{
		
			System.out.println("Quel type de forme voulez vous crÃ©eer?");
			Integer choiceCounter = 1;
			for (ShapeType shapeType: ShapeType.values()) {
				System.out.format("%S - %s\n",choiceCounter,shapeType.getLabel());
				choiceCounter++;
			}
			System.out.println("X - Sortir");
			

			
			Scanner sc = new Scanner(System.in);
			response = sc.nextLine();
			if (response.equals("X")){
				break;
			}
			
			
			Integer choice = Integer.parseInt(response);
			ShapeType shapeTypeChoiced = ShapeType.values()[choice-1];
			String[] parametersLabel = shapeTypeChoiced.getInitParams();
			
			Float[] params;
			params = typeParams(sc, parametersLabel);
			
			IShape myShape = iFactoryShape.creerShape(shapeTypeChoiced,params);
			shapes.add(myShape);
			printAreaOf(myShape);
			printPerimeterOf(myShape);
		}
		while(!response.equals("X"));
	}

	private Float[] typeParams(Scanner sc, String[] parametersLabel) {
		String response;
		Float[] params = new Float[parametersLabel.length];
		Integer paramNum = 0;
		for (String parameter : parametersLabel) {
			System.out.format("saisir la valeur du paramÃ¨tre %S\n", parameter);
			response = sc.nextLine();
			params[paramNum] = Float.parseFloat(response);
			paramNum++;
		}
		return params;
	}

	public void printAreaOf(IShape shape) {
		System.out.format("L'aire de mon %S est de %S\n", shape.getClass().getSimpleName(), shape.area());

	}

	public void printPerimeterOf(IShape shape) {
		System.out.format("Le pÃ©rimÃ¨tre de mon %S est de %S\n", shape.getClass().getSimpleName(), shape.perimeter());

	}

	private void displayAreaSum() {
		Float sum = 0f;
		for (IShape shape : shapes) {
			sum += shape.area();
		}
		System.out.format("La somme des aires est de %S\n", sum);

	}

}
