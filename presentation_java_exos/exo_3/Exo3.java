public class Exo3 {
	public static void Test() {
		int nbr=0;


		do{
			System.out.println( "Donnez un nombre entier inférieur à 5 et supérieur à 2 / pas de nombre pour terminer le programme" );
			nbr = Clavier.lireInt() ;
			if (nbr > 5){
				System.out.println( "le nombre est trop grand, recommencez." );
			}
			else if (nbr < 2) {
				System.out.println( "le nombre est trop petit, recommencez." );
			}
			else {
				System.out.println( "Le nombre " + nbr + " est bien inférieur ou égal à 5 et supérieur ou égal à 2 ([2,5]) , félicitation !" );
			}	
		}while ( nbr>5 || nbr<2);
			
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 3" );

		Exo3.Test();

		
	}

}