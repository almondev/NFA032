public class Exo9 {

	public static boolean Test(String ch1, String ch2) {
		System.out.println(ch1);
		System.out.println(ch2);
		int nb_fois_mot_touve=0;
		System.out.println( "catractère :" +ch1.charAt(0)); 
		if ( ch1.length() > ch2.length() ) {
			System.out.println( "1");
			return false;
		}
		else {
			System.out.println( "2");
			System.out.println( "catractère :" +ch1.charAt(0));
			
			for (int i=0; i<ch2.length();i++){
				System.out.println( "catractère :" +ch2.charAt(i));
								if(( (ch2.length()-i)<ch1.length() )) { 
				break; 
				}
				if( (ch2.charAt(i)==ch1.charAt(0) )  ){
					System.out.println( "3");
					if( VerifieMot (ch1, ch2, i) ){
						System.out.println( "marche");
						nb_fois_mot_touve++;					
					}
					else { i = i + ch2.length()-1; }
				
				}

			}
		}
		System.out.println( "nbrfois " + nb_fois_mot_touve);
		if(	nb_fois_mot_touve > 0) {
			System.out.println( "la chaine str2 : " +ch2 + " contient la str1 :" + ch1 + "  " + nb_fois_mot_touve + " fois" );
			return true;		
		}
		else { return false; }	
	}
	public static boolean VerifieMot (String ch1, String ch2, int position){ 
		int position_courante=position;
		
		System.out.println( "Position courante = " + position );
		for ( int i=0; i<ch1.length(); i++){
			position_courante = position+i; 
			if ( ch1.charAt(i) != (ch2.charAt(position_courante)) ) { return false;}
		}
		return true;
	}
	

	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 9" );
		System.out.println( "Vérifier qu'une chaine str1 se trouve dans str2" );		
		System.out.println( "Saisir une première chaîne de caractères str1 :" );		
		String chaine1 = Clavier.lireString() ;
		System.out.println( "Saisir une seconde chaîne de caractères str2 :" );	
		String chaine2 = Clavier.lireString() ;
		if( Exo9.Test(chaine1, chaine2) ){
			System.out.println( "la chaine str2 : " +chaine2 + " contient la str1 :" + chaine1);
		}
		else {
			System.out.println( "la chaine str2 : " +chaine2 + " ne contient pas la str1 :" + chaine1 );
		}		
		


		
	}

}