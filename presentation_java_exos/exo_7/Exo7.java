public class Exo7 {

	public static void Test(String tab[]) {
		String rubriquesMenu[]={"","","",""};
		rubriquesMenu[0]="accueil";
		rubriquesMenu[1]="produits";
		rubriquesMenu[2]="qui sommes nous ? ";
		rubriquesMenu[3]="contact";	
		System.out.println( "Affiche le tableau");
		for(int i=0; i<4;i++){
			System.out.println(rubriquesMenu[i]);
		}
		Exo7.Menu(rubriquesMenu);
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
		Exo7.Menu(rubriquesMenu2);
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
		Exo7.Menu(rubriquesMenu3);
						
				
			
	}
	
	public static void Menu (String tab[]){
		String pageHtml ="<!DOCTYPE html><html><head><meta charset=\"utf-8\" /><title>Titre de la page</title> </head><body>";
    	String codeHtml="";
    
    	for (int i=0; i<tab.length;i++){
    		codeHtml += "<li>"+tab[i]+"</li>";
    	}
    codeHtml= "<ul>" + codeHtml + "</ul>";
    pageHtml  +=codeHtml+ "</body></html>";
		System.out.println( pageHtml );

	
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 7" );
		String rubriquesMenu[]={"accueil","rubrique1","rubrique2","rubrique3","rubrique4"};
		Exo7.Test(rubriquesMenu);


		
	}

}