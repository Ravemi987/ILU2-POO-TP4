package produit;

public class Poisson extends Produit {
	private String date;
	
	public Poisson(int unite, String datePeche) {
		super("poisson", unite);
		this.date = datePeche;
	}
	
	public void decrireProduit() {
		System.out.println("poisson pêché " + date + ".");
	}
	
}
