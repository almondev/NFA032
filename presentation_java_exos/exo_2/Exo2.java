public class Exo2 {
	public void Test(int nbr1, int nbr2){

		System.out.println( "Le produit de " + nbr1 + " par " + nbr2 + " -> ");
		
		if((nbr1 == 0) || (nbr2 == 0)){  // JBU : Il vaut surparenthéser pour éviter les problèmes de priorité 
						 // des opérateurs.
			System.out.println( "Le produit est nul" );
		} else if(((nbr1 < 0) && (nbr2 < 0)) || ((nbr1 > 0) && (nbr2 > 0))) {
			System.out.println("Le produit est positif");
		} else {
			System.out.println("Le produit est négatif");
		}	
	}
	public void Test_XOR(int nbr1, int nbr2){
		System.out.println( "Test version simplifiée XOR :" );
		System.out.println( "Le produit de " + nbr1 + " par " + nbr2 + " -> ");
		
		if((nbr1 == 0) || (nbr2 == 0)){
			System.out.println( "Le produit est nul" );
		} else if ((nbr1 < 0.0) ^ (nbr2 < 0)) {
			System.out.println( "Le produit est négatif" );
		} else {
			System.out.println( "Le produit est positif" );
		}	
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 2" );
		double temp;		
		Exo2 exo2 = new Exo2();
		System.out.println( "Produit de deux nombre");
		exo2.Test(0,0);
		exo2.Test(0,5);
		exo2.Test(-5,-10);
		exo2.Test(50,100);
		exo2.Test(-10,100);
		// Simplification du test logique ^ Ou exclusif XOR
		
		System.out.println( "Produit de deux nombre version XOR :");
		exo2.Test_XOR(0,0);
		exo2.Test_XOR(0,5);
		exo2.Test_XOR(-5,-10);
		exo2.Test_XOR(50,100);
		exo2.Test_XOR(-10,100);

		
				
		//********* Saisie au clavier *********//
		double nbr1, nbr2;
		System.out.println( "Entrez le premier nombre : " );
		nbr1 = Clavier.lireDouble() ;
		System.out.println( "Entrez le second nombre : " );
		nbr2 = Clavier.lireDouble() ;
		while (true){
			exo2.Test(nbr1, nbr2);
			System.out.println( "Ne taper pas de nombre pour terminer le programme" );
			System.out.println( "Entrez le premier nombre : " );
			nbr1 = Clavier.lireDouble() ;
			System.out.println( "Entrez le second nombre : " );
			nbr2 = Clavier.lireDouble() ;
		}
		
	}

}
