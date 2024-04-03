package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	
	
	public Sanglier(int poids, Gaulois chasseur, int unite) {
		super("sanglier", unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public void decrireProduit() {
		System.out.println("sanglier de  " + poids + "chassé par " + chasseur.getNom());
	}
}
