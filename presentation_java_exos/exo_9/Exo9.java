public class Exo9 {

	public static boolean Test(String ch1, String ch2) {
		System.out.println(ch1);
		System.out.println(ch2);
		if (ch1.equals( ch2 )){
			return true;
		
		}
		else {
			return false;
		}				
				
			
	}
	

	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 9" );
		System.out.println( "Saisir une première chaîne de caractères" );		
		String chaine1 = Clavier.lireString() ;
		System.out.println( "Saisir une seconde chaîne de caractères" );	
		String chaine2 = Clavier.lireString() ;
		if( Exo9.Test(chaine1, chaine2) ){
			System.out.println( "chaînes identiques" );
		}
		else {
			System.out.println( "chaînes différentes" );
		}		
		


		
	}

}