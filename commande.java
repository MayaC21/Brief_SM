// D�finir la classe commande 

public class commande {
	
	private String plat;
	private int quantit�;
	private double prix;
	
	// constructeur 
	
	public commande(String Plat, double Prix, int Quantit�) {
		this.plat=Plat;
		this.quantit�=Quantit�;
		this.prix=Prix;
	}
	
	// Guetteurs

	public String getplat() {
		return this.plat;
	}
	public int getquantit�() {
		return this.quantit�;
	}
	public double getprix() {
		return this.prix;
	}
	
}
