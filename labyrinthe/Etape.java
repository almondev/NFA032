public class Etape {

	private Etape etapeDroite;
	private Etape etapeGauche;
	private boolean sortie;	
	private int numeroEtape;

	private static int nombreEtapes = 0;
		
	public Etape (){	
		Etape.nombreEtapes++;
		//this.numeroEtape = nombreEtapes;
		setnumeroEtape( nombreEtapes );
		etapeDroite=null;
		etapeGauche=null;
		setSortie(false);
		System.out.println(toString());
	}

	// getter
	public int 		getnumeroEtape(){ return this.numeroEtape; }
	public Etape 	getetapeGauche(){ return this.etapeGauche; }
	public Etape 	getetapeDroite(){ return this.etapeDroite; }
	public boolean 	getSortie(){return this.sortie; }

	// setter
	public void 	setnumeroEtape(int numeroEtape ){ this.numeroEtape = numeroEtape; }
	public void 	setetapeGauche( Etape etapeGauche ){ this.etapeGauche = etapeGauche; }
	public void 	setetapeDroite( Etape etapeDroite ){ this.etapeDroite = etapeDroite; }
	public void		setSortie( boolean sortie ){this.sortie = sortie; }	


	public static int		getnombreEtapes(){ return Etape.nombreEtapes; }
	
	public String toString(){
		String chaine;
		chaine = "--> Etape [ " + this.numeroEtape + "] ";
		if ( numeroEtape == 1 ) { chaine += "      Etape racine de l'arbre. "; }
		return chaine;	
	}

}

