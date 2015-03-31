public class Labyrinthe {
	private static int maxEtapes;
	private static Arbre	arbre;
	//Fabriquer labyrinthe
	private static void fabrique(){
		System.out.println("Bonjour au programme du Labyrinthe");
		System.out.println("Nombre d'étapes : ");
		Labyrinthe.maxEtapes = Clavier.lireInt();
		Labyrinthe.arbre = new Arbre(Labyrinthe.maxEtapes);
		Etape racine = Labyrinthe.arbre.creationRacine();
		Labyrinthe.arbre.construireBranches(Labyrinthe.arbre.etaperacine);
		Labyrinthe.arbre.sortieArbre();
		Etape etapesortie = Labyrinthe.arbre.rechercheSortieArbre(racine);	
		System.out.println("Recherche de la sortie du labyrinthe");
		if( etapesortie != null ) { System.out.println("Etape de sortie numéro : " + etapesortie.getnumeroEtape() );}	
	}
	public Labyrinthe(){
	
	}

	public static void main(String[] args) {
		Labyrinthe.fabrique();
	}

}
