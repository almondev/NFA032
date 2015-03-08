import java.util.*;
public class Exo4 {
	public static void Test() {
		int nbr=0;

			String [] tab = {"premier", "deuxième", "troisième", "quatrième", "cinquième"};
		
			System.out.println( "Donnez un nombre entier / pas de nombre pour terminer le programme" );
			nbr = Clavier.lireInt() ;
			System.out.println( "Ecriture des 5 nombres suivant du nombre " + nbr + " donne :");
			for (int i=0; i<5;i++){
				System.out.println(tab[i] + " : " + (nbr+i+1) + ";\n");
			}
			
	}
	public static void Testdowhile() {
		int nbr=0;

			String [] tab = {"premier", "deuxième", "troisième", "quatrième", "cinquième"};
		
			System.out.println( "Donnez un nombre entier / pas de nombre pour terminer le programme" );
			nbr = Clavier.lireInt() ;
			System.out.println( "Ecriture des 5 nombres suivant du nombre " + nbr + " donne :");
			int i=0;
			do{
				System.out.println(tab[i] + " : " + (nbr+i+1) + ";\n");
				i++;
			} while(i<5);
			
	}
	public static void Testwhile() {
		int nbr=0;

			String [] tab = {"premier", "deuxième", "troisième", "quatrième", "cinquième"};
		
			System.out.println( "Donnez un nombre entier / pas de nombre pour terminer le programme" );
			nbr = Clavier.lireInt() ;
			System.out.println( "Ecriture des 5 nombres suivant du nombre " + nbr + " donne :");
			int i=0;
			while(i<5){
				System.out.println(tab[i] + " : " + (nbr+i+1) + ";\n");
				i++;
			};
			
	}
		
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 4" );
		System.out.println( "Boucle for" );
		Exo4.Test();
		System.out.println( "Boucle do while" );		
		Exo4.Testdowhile();
		System.out.println( "Boucle while" );		
		Exo4.Testwhile();
				

		
	}

}