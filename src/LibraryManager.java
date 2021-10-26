import java.io.Console; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


		public class LibraryManager { //Il en va de soit que plus tard cette méthode sera améliorée.


			Connection  con = ConnectionManager.getConnection();
		    ResultSet résultats = null;
		    String requete = "";
		    ResultSetMetaData rsmd;
			
		    private static void arret(String message) {
		        System.err.println(message);
		        System.exit(99);
		     }
		    
		    private static void affiche(String message) {
		        System.out.println(message);
		     }
		    
			public void afficherLivres() {				

				requete = "SELECT * FROM library.book ; ";
				
				try {
			         Statement stmt = con.createStatement();
			         résultats = stmt.executeQuery(requete);
					 boolean encore = résultats.next();
					   while (encore) {
						   System.out.println("*********** new book ********");
						   System.out.println(résultats.getString("title")+ " \n"+ résultats.getString("author") + " \n" +  résultats.getString("editor") +  "\n" +  résultats.getString("summary")
						  +  "\n" +  résultats.getInt("page_nb")); 
						   
						   encore = résultats.next();
					   }
					   résultats.close();
					} catch (SQLException e) {
						arret("Anomalie lors de l'execution de la requête") ;
					}
			}
			

			
			public void afficherLibraries() {				

				requete = "SELECT * FROM library.library ; ";
				
				try {
			         Statement stmt = con.createStatement();
			         résultats = stmt.executeQuery(requete);
					 boolean encore = résultats.next();
					   while (encore) {
						   System.out.println("*********** new library ********");
						   System.out.println(résultats.getInt("id")+"\n" + résultats.getString("lib_name")+"\n"+ résultats.getString("addresse")
						  +  "\n" +  résultats.getInt("numTel")); 
						   
						   encore = résultats.next();
					   }
					   résultats.close();
					} catch (SQLException e) {
						arret("Anomalie lors de l'execution de la requête") ;
					}
			}
		
			public void ajoutLivre (){

				Book book = choosebook() ;
				
				String title = "'"+book.getTitle()+"'" ;
				String autheur = "'"+book.getAuthor()+"'" ;
				String editeur = "'"+book.getEditor()+"'" ;
				String sommaire = "'"+book.getSummary()+"'" ;
			
				requete = "INSERT INTO library.book values ("+book.getId()+","+title+','+autheur+","+editeur+","+sommaire+","+book.getPageNb()+","+book.getLibrary_id()+");"   ;
				try {
			         Statement stmt = con.createStatement();
			         stmt.executeUpdate(requete) ;
			        
			         System.out.println("Booook ajouté avec succés");
			         résultats.close();
					} catch (SQLException e) {
						arret("Anomalie lors de l'execution de la requête") ;
					}
				affiche("fin du programme");
			      System.exit(0);
				
			}
			
			
			public Book choosebook () {
				
				Book book = new Book() ;
				
				Scanner sc6 = new Scanner(System.in);
				System.out.println("Veuillez saisir l'id du book :");
				int idBook = sc6.nextInt();
				book.setId(idBook);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Veuillez saisir un titre :");
				String titre = sc.nextLine();
				book.setTitle(titre);
				
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Veuillez saisir un autheur :");
				String autheur = sc1.nextLine();
				book.setAuthor(autheur);
				
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Veuillez saisir un editeur :");
				String editeur = sc3.nextLine();
				book.setEditor(editeur);
				
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Veuillez saisir un summary :");
				String summary = sc4.nextLine();
				book.setSummary(summary);
				
				Scanner sc5 = new Scanner(System.in);
				System.out.println("Veuillez saisir un nbr de pages :");
				int pageNb = sc5.nextInt();
				book.setPageNb(pageNb);
				
				int id_library =chooseLibrary() ;
				//Library library  =getBook(id_library);
				book.setLibrary_id(id_library);
				

				
				return book;
			}
				public int  chooseLibrary () {
					
					afficherLibraries() ;				
					Scanner sc = new Scanner(System.in);
					System.out.println("For which library ?:");
					int i = sc.nextInt();
				
					return i ;				
					
				}
				
				
				
				
				
				
			
			
			public LibraryManager() {
			}
			
		}
		

	


