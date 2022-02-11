// Définir la classe commande 

public class commande {
	
	private String plat;
	private int quantité;
	private double prix;
	
	// constructeur 
	
	public commande(String Plat, double Prix, int Quantité) {
		this.plat=Plat;
		this.quantité=Quantité;
		this.prix=Prix;
	}
	
	// Guetteurs

	public String getplat() {
		return this.plat;
	}
	public int getquantité() {
		return this.quantité;
	}
	public double getprix() {
		return this.prix;
	}
	
}
