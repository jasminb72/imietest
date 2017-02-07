package philosophe;

public class Philosophe implements Runnable {
	private EtatPhilisophe etatPhilisophe;
	private Fourchette fgauche;
	private Fourchette fdroite;

	public Philosophe(Fourchette f1, Fourchette f2, EtatPhilisophe etatPhilisophe) {
		this.fgauche = f1;
		this.fdroite = f2;
		this.etatPhilisophe = etatPhilisophe;
	}

	public void penser() {

	}

	public void manger(Long temps) {
		System.out.println("Le philosophe mange.");
		this.waitThis(temps);
		System.out.println("Le philosophe a fini de manger.");
		this.setEtat(EtatPhilisophe.RIEN);
		
	}

	public void avoirFaim() {
		this.etatPhilisophe = EtatPhilisophe.A_FAIM;
		System.out.println("Le philosophe a faim.");
	}

	public Boolean attendreFourchettesLibres() {
		System.out.println("Le philosophe attend que les 2 fourchettes soient libérées.");
		if ((fgauche.getEstUtilise() == false) && (fdroite.getEstUtilise() == false)) {
			return true;
		} else {
			return false;
		}

	}

	public EtatPhilisophe getEtat() {
		return etatPhilisophe;
	}

	public void setEtat(EtatPhilisophe etatPhilisophe) {
		this.etatPhilisophe = etatPhilisophe;
	}

	@Override
	public synchronized void run() {
		System.out.println("Le philosophe s'installe à table.");
		Integer amanger = 0;
		//le philosophe doit manger 2 fois
		while (amanger<2) {
			while (etatPhilisophe == EtatPhilisophe.A_FAIM) {

				if (this.attendreFourchettesLibres()) {
					this.manger((long) 2000);
					amanger++;
				}
				this.waitThis((long) 500);
			}
			this.waitThis((long) 3000);
		}
	}

	public synchronized void waitThis(long temps) {
		try {
			this.wait(temps);
		} catch (InterruptedException e) {
			System.out.println("Il y a un problème pour l'attente");
			e.printStackTrace();
		}
	}

}
