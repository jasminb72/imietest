package philosophe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Fourchette f1 = new Fourchette(false);
		Fourchette f2 = new Fourchette(false);
		Philosophe p1 = new Philosophe(f1,f2,EtatPhilisophe.RIEN);
		Thread t1=new Thread(p1);
		t1.start();
			
		Integer i = 0;
		while (t1.isAlive()){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Voulez vous que le philosophe se rende compte qu'il a faim? o/n");
			String choix = sc.nextLine().toLowerCase();
			if (choix.equals("o")){
				p1.avoirFaim();
			}
		}
		
		System.out.println("Fin de repas");
	}

}
