import java.io.*;
public class Arbre {
	//graphiz-devappspot.com
	private int nbrsMaxEtapes;
	private int etapeCourante = 0;
	private static boolean trouvesortie;
	private Etape etapesortie = null; 
	public Etape[] etapes;
	public static Etape etaperacine = null;
	public Arbre(int nbrsMaxEtapes){
		this.nbrsMaxEtapes = nbrsMaxEtapes;
		etapes = new Etape[nbrsMaxEtapes];	
		Arbre.trouvesortie = false;			
	}
	
	
	//Création racine de l'arbre
	public Etape creationRacine(){		
		Arbre.etaperacine = new Etape() ;
		etapes[0] = Arbre.etaperacine;	
		return Arbre.etaperacine;		
	}
	// Construire branches de l'arbre
	public void		construireBranches( Etape etape){
		int lower = 1;
		int higher = 6;
		int random = (int)(Math.random() * (higher-lower)) + lower;
		System.out.println("      donne : " + random);
		switch (random) {
			case 1:
				
				if ( this.nbrsMaxEtapes > Etape.getnombreEtapes()+1){ 
					EtapeG etapeGauche = new EtapeG();
					etape.setetapeGauche ( (Etape) etapeGauche );										
					etapes[etapeGauche.getnumeroEtape()] = (Etape) etapeGauche;
					construireBranches( (Etape) etapeGauche ); 
				}				
				break;
		
			case 2:
				if (nbrsMaxEtapes>Etape.getnombreEtapes()+1 ){ 
					EtapeD etapeDroit = new EtapeD();
					etape.setetapeDroite( (Etape) etapeDroit );
					etapes[etapeDroit.getnumeroEtape()] = (Etape) etapeDroit;  
					construireBranches( (Etape) etapeDroit);
				}								
				break;
			case 3:
				if (nbrsMaxEtapes>Etape.getnombreEtapes()+1 ){ 
					EtapeG etapeGauche = new EtapeG();
					etape.setetapeGauche ( (Etape) etapeGauche );										
					etapes[etapeGauche.getnumeroEtape()] = (Etape) etapeGauche; 
					construireBranches( (Etape) etapeGauche );						
				}
				if (nbrsMaxEtapes>Etape.getnombreEtapes()+1 ){ 
					System.out.println("      et ");
					EtapeD etapeDroit = new EtapeD();
					etape.setetapeDroite( (Etape) etapeDroit );
					etapes[etapeDroit.getnumeroEtape()] = (Etape) etapeDroit; 
					construireBranches( (Etape) etapeDroit );				
				}
				break;
			case 4 :
				if (nbrsMaxEtapes>Etape.getnombreEtapes()+1 ){ 
					EtapeD etapeDroit = new EtapeD();
					etape.setetapeDroite( (Etape) etapeDroit );
					etapes[etapeDroit.getnumeroEtape()] = (Etape) etapeDroit;  					
					construireBranches(  (Etape) etapeDroit );
				}
				if (nbrsMaxEtapes>Etape.getnombreEtapes()+1 ){ 
					System.out.println("      et ");
					EtapeG etapeGauche = new EtapeG();
					etape.setetapeGauche ( (Etape) etapeGauche );										
					etapes[etapeGauche.getnumeroEtape()] = (Etape) etapeGauche;
					construireBranches( (Etape) etapeGauche );					 
				}								
				break;			
			default :
				System.out.println("      n'a pas de descendants");
		
		}
	}	

 	//Placer la sortie dans l'arbre.
	public void sortieArbre(){
		System.out.println("      sortie arbre");
		System.out.println("      nb étapes : " + Etape.getnombreEtapes());
		int idsortie = (int)(Math.random() * Etape.getnombreEtapes());

		System.out.println(" sortie etape :  " + idsortie ); 
		etapes[ idsortie ].setSortie(true);
		System.out.println(" numéro : " +etapes[ idsortie ].getnumeroEtape() );
		
	}
 	//Recherche de la sortie depuis la racine.
	public Etape rechercheSortieArbre(Etape etape){
		System.out.println("      recherche arbre");
		if ( Arbre.etaperacine.getSortie() ) { return Arbre.etaperacine; }
		
		while (!trouvesortie) {
			try {
			Thread.sleep(6000); // suspendu pendant 6 seconde (chiffre en millisecondes)
			}
			catch(InterruptedException e)
			{
     		// this is executed when an exception (in this example InterruptedException) occurs
			}
			System.out.println(" 0 ");
			if ( etape.getetapeGauche() != null ) {
				System.out.println(" 1 "); 
				if ( etape.getetapeGauche().getSortie() ) { System.out.println(" 2 "); etapesortie = etape.getetapeGauche(); trouvesortie= true;    }
				else { System.out.println(" 3 "); rechercheSortieArbre( etape.getetapeGauche() ); }
			}
			if ( etape.getetapeDroite() != null ) { 
				System.out.println(" 4 "); 
				if ( etape.getetapeDroite().getSortie() ) { System.out.println(" 5 ");  etapesortie = etape.getetapeDroite(); trouvesortie= true;   }
				else { System.out.println(" 6 "); rechercheSortieArbre(  etape.getetapeDroite() ); }
			}			
		}
		System.out.println(" 7 "); 
		return etapesortie;
		
	}
	//Affiche Arbre
	public static void parcoursArbre(Arbre arbre){
		boolean trouve=false;
		int compteur = 0;
		

		
	}
	

}
