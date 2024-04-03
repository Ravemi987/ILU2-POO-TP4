package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal<T extends IProduit> {
	private Gaulois vendeur;
	private T[] produits;
	private int nbProduit;
	private int prix;
	
	public void installerVendeur(Gaulois vendeur, T[] produit, int prix) {
		this.vendeur = vendeur;
		this.prix = prix;
		this.nbProduit = produit.length;
	}
	
}
