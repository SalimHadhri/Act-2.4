
public class main {

	public static void main(String[] args) {
		
		LibraryManager librManag = new LibraryManager();
		
/*
		System.out.println("**************************AFFichage des librairies*************") ;
		
		
		librManag.afficherLibraries() ;
		
		System.out.println("**************************Ajout de livres*************") ;

		
		librManag.ajoutLivre();*/
		
		System.out.println("**************************trie par auteur*************") ;
		
		librManag.trierLivresAuteur() ;
		
		/*System.out.println("**************************search by book id *************") ;
		
		librManag.searchBookById();
		*/
		System.out.println("**************************search by book author *************") ;
		
		librManag.searchBookByAuteur();
	}

}
