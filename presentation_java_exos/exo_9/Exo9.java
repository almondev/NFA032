/** 
	* @author MH almondev
	*
	* @version 2.0
	*/
	
	
public class Exo9 {

	public static boolean Test(String ch1, String ch2) {

		int nb_fois_mot_touve=0; // Nombre de fois que le mot ch1 est trouvé dans la chaine ch2.
		
		if ( ch1.length() > ch2.length() ) { // ***Test1 :si la mot ch1 à trouver est plus grand que la chaîne ch2 cela ne fonctionne pas. 
			//System.out.println("1");
			return false;
		}
		else {
			//System.out.println("2");
			/* Parcours de la chaîne ch2 caractère par caractère */		
			for (int i=0; i<ch2.length();i++){
				//System.out.println("3");
				/* Vérifie que la longueur de la chaîne ch2 est toujours supérieure au mot ch1. (On peut supprimer le test ***Test1 plus haut qui devient doublons, mais je l'ai gardé). */
				if(( (ch2.length()-i)<ch1.length() )) { 
					break; 
				}
				/* Test si le caractère d'indice i de la chaine correspond au premier caractère du mot à trouver, si ce n'est pas le cas la boucle for continu avec le caractère suivant */
				if( (ch2.charAt(i)==ch1.charAt(0) )  ){
					//System.out.println(ch1.charAt(0));
					/* lance la vérification du mot à partir de l'indice de chaîne i quand il y a équivalence entre le caractère d'indice i de la chaîne et le premier caractère du mot */
					if( VerifieMot (ch1, ch2, i) ){// VerifieMot renvoi une valeur booléenne : vrai si le mot a été trouvé */
						/* si le mot est trouvé */
						nb_fois_mot_touve++; 					
					}
					else { i = i + ch1.length()-1; } // décalage de la longueur du mot moins 1 car le for incrémenter
				
				}
			}
			
		}
		
		/* Affichage du nombre de fois où le mot est trouvé. */
		if(	nb_fois_mot_touve > 0) {
			System.out.println( "la chaine str2 : " +ch2 + " contient la str1 :" + ch1 + "  " + nb_fois_mot_touve + " fois" );
			System.out.println("5");
			return true;		
		}
		else { 
			//System.out.println("6"); 
			return false; 
		}	
		
	}
	public static boolean VerifieMot (String ch1, String ch2, int position){ 
		//System.out.println("4");
		int position_courante=position; // position de départ d'indice i de la chaîne ch2
		for ( int i=0; i<ch1.length(); i++){
			position_courante = position+i;
			/* vérification depuis la position */ 
			if ( ch1.charAt(i) != (ch2.charAt(position_courante)) ) { return false;} 
		}
		return true;
	}
	
	
	
	/* Autre méthode ( remplir un tableau avec mots de taille l1 dans l2 */
	public static boolean TestAutre(String ch1, String ch2) {
		/* 	ch1 de taille l1 ch2 de taille l2 Combinaison de */ 
		int maximot = 0;// combien la chaine de taille l1 peut contenir la chaine l2.
		for (int i=0; i<ch2.length();i++){
			if ( (ch1.length()+i)<=ch2.length() ){
				maximot++;
			}
			else { break; }
		}
		//System.out.println("MAXIMOT :" + maximot);
		String tmp[] = new String[maximot]; //tmp : tableau des mots possibles, tableau de mots possibles à vérifier (de taille du mot ch1 dans l'ordre de saisie de la chaine ch2).
		for (int i=0; i<ch2.length();i++){
			if ( (ch1.length()+i) <= (ch2.length()) ){
				tmp[i] = ch2.substring( i, ch1.length()+i );
				//System.out.println("mot" + tmp[i]);
			}
			else { 
				//System.out.println(" break"); 
				break; 
			}
		}	
		
		//Verification
		int nb_fois_mot_touve=0; // Nombre de fois que le mot ch1 est trouvé dans la chaine ch2; initialisation à zéro.	
		for (int i=0; i<maximot;i++){	
			if ( tmp[i].equals(ch1) ){
				//System.out.println(" trouvé");
				nb_fois_mot_touve++;
			}
			
		}
		if(	nb_fois_mot_touve > 0) {
			System.out.println( "la chaine str2 : " +ch2 + " contient la str1 :" + ch1 + "  " + nb_fois_mot_touve + " fois" );
			return true;		
		}
		else { return false; }	
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 9" );
		System.out.println( "Vérifier qu'une chaine str1 se trouve dans str2" );		

		char variable = 'O';
		do{
			System.out.println( "Nouveau test." );
			System.out.println( "Choissisez une des options suivantes." );
			System.out.println( "***********************" );
			System.out.println( "* -> O pour oui.      *" );
			System.out.println( "* -> N pour quitter.  *" );
			System.out.println( "* -> A pour Aide.     *" );
			System.out.println( "***********************" );
			String saisie = Clavier.lireString();
			saisie = saisie.toUpperCase();
			
			variable = saisie.charAt(0);
			switch (variable){
				case 'O':
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
					
					// Deuxième méthode avec la fonction  TestAutre					
					System.out.println( "Autre méthode de test :");
					if( Exo9.TestAutre(chaine1, chaine2) ){
						System.out.println( "la chaine str2 : " +chaine2 + " contient la str1 :" + chaine1);
					}
					else {
						System.out.println( "la chaine str2 : " +chaine2 + " ne contient pas la str1 :" + chaine1 );
					}
				
				break;
				
				case 'N':
				break;
				case 'H':
					System.out.println( "Voulez vous testez si une chaine 1 est incluse dans une chaine 2 et combien de fois?" );
					System.out.println( "Saisir le mot à trouver ensuite deuxième saisie la chaine à tester" );
					System.out.println( "Pour quitter le programme taper N ou n" );
				break;
				default :
					System.out.println( "Mauvaise saisie, taper le caractère H ou h pour une aide" );
				
			}
			
			//System.out.println("variable " + variable); 			
		}while (variable != 'N');	// MH : Tant que c'est vrai rester dans la boucle while (variable == 'N');	pas bon
		


		
	}

}

