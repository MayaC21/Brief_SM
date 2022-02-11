import java.util.Scanner;

public class mainprog {

	public static void main(String[] args) {
		
		// Entrer le nombre de plats 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de plats :");
		int NombrePlat= sc.nextInt();
		
		// créer un tableau d'objets commande
		
		commande[] listeCommande=new commande[NombrePlat];
		
		// Remplir le tableau 
		
		for (int i=0; i<NombrePlat; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Plat numéro " + (i+1));
			String Plat = sc1.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Prix unitaire:") ;
			double prix = sc2.nextDouble(); 
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Quantité :");
			int qt = sc.nextInt();	
			listeCommande[i]=new commande(Plat, prix, qt);			
		}	
		
		// Afficher le ticket de caisse 
		
		System.out.println("################################");
		System.out.println(" ");
		System.out.println("         Snack Mounir");
		System.out.println(" ");
		System.out.println("      Restauration rapide");
		System.out.println(" ");
		System.out.println("151 Rue des Postes, 59000 Lille");
		System.out.println(" ");
		System.out.println("     Tél : 09 80 91 36 05");
		System.out.println(" ");
		System.out.println("         11/02/2022");
		System.out.println(" ");
		System.out.println("           18h30");
		System.out.println(" ");
		System.out.println("################################");
		System.out.println(" ");
		System.out.println("       Ticket de Caisse");
		System.out.println(" ");
		
		double prixTotal=0;
		double prixpar=0;
		
		// Une boucle qui affiche les plats achetés, calcule le prix partiel et le prix total
		
		for (int i=0; i<NombrePlat; i++) {	
			System.out.println("Plat numéro " + (i+1) +" : "+ listeCommande[i].getplat());
			System.out.println("--------------------------------");	
			System.out.println("Quantité : "+ listeCommande[i].getquantité());
			System.out.println("--------------------------------");	
			System.out.println("Prix Unitaire : " + listeCommande[i].getprix() + " EUR");	
			System.out.println("--------------------------------");	
			prixTotal += (listeCommande[i].getquantité())*(listeCommande[i].getprix());
			prixpar=(listeCommande[i].getquantité())*(listeCommande[i].getprix());
			System.out.println("Total : " + prixpar+ " EUR" );
			System.out.println("--------------------------------");	
			System.out.println(" ");			
		}	
		System.out.println(" ");
		System.out.println("Prix Total HT : " + (prixTotal-( prixTotal*0.1)) + " EUR" );
		System.out.println("TVA (10%) : " + prixTotal*0.1+ " EUR" );	
		System.out.println("Total à payer TTC : " + prixTotal+ " EUR" );
		System.out.println(" ");
		System.out.println("################################");	
	}
}
