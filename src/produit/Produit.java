package produit;

public abstract class Produit implements IProduit {
	private String nom;
	private int unite;
	
	public Produit(String nom, int unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public abstract void decrireProduit();
}
