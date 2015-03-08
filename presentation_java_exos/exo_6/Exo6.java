import java.util.*;
public class Exo6 {
	public static void Test(int nbr) {
		int nbrpre[] = new int[nbr];
		nbrpre[0]=1;
		nbrpre[1]=1;
		for (int i=2; i<nbr;i++){
			nbrpre[i]= nbrpre[i-1] + nbrpre[i-2] ;
		}				
		for (int i=0; i<nbr;i++){
			System.out.println(nbrpre[i]);
		}				
			
	}	

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 6" );
		System.out.println( "Suite des nombres premiers" );
				System.out.println( "Affiche les 7 nombres de nombres premiers: ");
		Exo6.Test(7);
		System.out.println( "Donner les nombres de nombres premiers à afficher : ");
		int nbr = Clavier.lireInt() ;
System.out.println( "Affiche les " + nbr + "nombres de nombres premiers : ");		
		Exo6.Test(nbr);
		
	}

}