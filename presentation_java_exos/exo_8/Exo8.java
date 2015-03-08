public class Exo8 {

	public static void Test() {
		System.out.println( "Donnez le nombre total de valeur d'un tableau");
		int nbr = Clavier.lireInt() ;
		int nbPosi=0,nbNega=0;

		int [] Tab=new int[nbr];
		
		for (int i=0; i< nbr; i++){
			int valeur = Clavier.lireInt();
			Tab[i]= valeur; 
			if (valeur >0) {
				nbPosi++;
			}
			else {
				nbNega++;
			}
		}
			
		System.out.println("Nombre de valeurs positives : " + nbPosi);
		System.out.println("Nombre de valeurs négatives : " + nbNega);
						
				
			
	}
	

	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Exo 8" );
		
		Exo8.Test();


		
	}

}