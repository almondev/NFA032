import java.util.*;
public class Exo5 {
	public static void Test(String tab[]) {
		String rubriquesMenu[]={"","","",""};
		rubriquesMenu[0]="accueil";
		rubriquesMenu[1]="produits";
		rubriquesMenu[2]="qui sommes nous ? ";
		rubriquesMenu[3]="contact";	
		System.out.println( "Affiche le tableau");
		for(int i=0; i<rubriquesMenu.length;i++){
			System.out.println(rubriquesMenu[i]);
		}
		/* Deuxième tableau passé en paramètre dans la fonction Test depuis le main:  */
		System.out.println( "Affiche le deuxième tableau");
		int taille = tab.length;
		System.out.println( "Taille" + taille);
		String rubriquesMenu2[]=new String[taille]; 
		for (int i=0; i< taille; i++){
			rubriquesMenu2[i]=tab[i];
			System.out.println(rubriquesMenu2[i]);
		}
		for (int i=0; i< taille; i++){
			System.out.println(rubriquesMenu2[i]);
		}
		/* Tableau que l'on va créer dynamiquement */
		System.out.println( "Affiche le troisème tableau avec la saisie utilisateur");
		System.out.println( "Donnez le nombre de rubrique du menu");
		int nbr = Clavier.lireInt() ;
		String [] rubriquesMenu3=new String[nbr];
		
		for (int i=0; i< nbr; i++){
			String chaine = Clavier.lireString();
			rubriquesMenu3[i]= chaine; 
			
		}
		for (int i=0; i< nbr; i++){
			System.out.println(rubriquesMenu3[i]);
		}				
				
			
	}	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 5" );
		String rubriquesMenu[]={"accueil","rubrique1","rubrique2","rubrique3","rubrique4"};
		Exo5.Test(rubriquesMenu);


		
	}

}