public class Exo1 {
	public void Test(double _temp){ // JBU : Respecte les convention de nommage de Google : 
					// https://google-styleguide.googlecode.com/svn/trunk/javaguide.html
		double temp = _temp; 	// JBU : Pourquoi ? C'est inutile si tu utilises _temp. 
					// Et pourquoi un double ? Il faut éviter d'utiliser les double et les float quand 
					// ce n'est pas nécessaire.
		System.out.println( "La température de " + temp + " °C  -> ");
		if (temp <= 0.0){
			System.out.println( "C’est de la glace" );
		}
		else if (temp < 100.0) {
			System.out.println( "C’est du liquide" );
		}
		else {
			System.out.println( "C’est de la vapeur" );
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 1" );
		double temp;		
		Exo1 exo1 = new Exo1(); // JBU : Il faut créer une méthode statique, c'est plus simple. 
					// Mais nous allons voir ça en cours.
		System.out.println( "Température du zéro absolu -273,15 °C");
		exo1.Test(-273.15);
		exo1.Test(99.99);
		exo1.Test(100);// conversion implicite int vers double sans perte d'information

		exo1.Test(100.3);
		exo1.Test(1064.18);	
		
				
		//********* Saisie au clavier *********//
		System.out.println( "Entrez la température de l'eau : " );
		temp = Clavier.lireDouble() ;
		while (true){
			exo1.Test(temp);
			System.out.println( "Entrez la température de l'eau avec un nombre / pas de nombre pour terminer le programme" );
			temp = Clavier.lireDouble() ;
		}
		
	}

}
