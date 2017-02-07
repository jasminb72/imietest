
public class Counter extends Thread {

	private String nom;
	private Integer nbMax;

	public Counter(String nom, Integer nbMax) {
		this.nom = nom;
		this.nbMax = nbMax;
	}

	@Override
	public synchronized void run() {
		for (Integer i = 0; i < nbMax; i++) {

			System.out.printf("Nom Thread: %s, Compteur= %s\n", this.nom, i + 1);
			try {
				Long attente = (long) (0 + (int) (Math.random() * 2000));
				this.wait(attente);
				// System.out.println(attente);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
