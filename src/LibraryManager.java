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
				
				
				
				public void trierLivresAuteur() {				

					requete = "SELECT * FROM library.book ORDER BY author ; ";
					
					try {
				         Statement stmt = con.createStatement();
				         résultats = stmt.executeQuery(requete);
						 boolean encore = résultats.next();
						   while (encore) {
							   System.out.println("*********** books ordred splitted  ********");
							   System.out.println("id : " + résultats.getInt("id") +"\n"+ "title : "+résultats.getString("title")+ " \n"+ "author : "+résultats.getString("author") + " \n" +  "editor : "+résultats.getString("editor") +  "\n" +  "summary : "+résultats.getString("summary")
							  +  "\n" + "nbr pages : "+ résultats.getInt("page_nb")); 
							   
							   encore = résultats.next();
						   }
						   résultats.close();
						} catch (SQLException e) {
							arret("Anomalie lors de l'execution de la requête") ;
						}
				}
				
				public void searchBookById () {
					boolean toSearchOrNot = true ;
					
										
					System.out.println("Do you want to search a book ?: 1/yes 2/no  ") ; 
					Scanner sc1 = new Scanner(System.in);
					int search = sc1.nextInt();
					if (search==1) {
						
					
					while (  toSearchOrNot ==true) {
						
					
					System.out.println("Veuillez saisirl'ID du livre a chercher : ") ; 
					Scanner sc = new Scanner(System.in);
					int idBook = sc.nextInt();
					

					
					requete = "SELECT * FROM library.book WHERE id = "+idBook + " ; " ;
					
					
					
					try {
				         Statement stmt = con.createStatement();
				         résultats = stmt.executeQuery(requete);
						 boolean encore = résultats.next();
						 boolean found = false ;
						   while (encore && found == false) {
							   						   
							   if (résultats.getInt("id") == idBook) {
								   System.out.println("id : " + résultats.getInt("id") +"\n"+ "title : "+résultats.getString("title")+ " \n"+ "author : "+résultats.getString("author") + " \n" +  "editor : "+résultats.getString("editor") +  "\n" +  "summary : "+résultats.getString("summary")
									  +  "\n" + "nbr pages : "+ résultats.getInt("page_nb")); 
								   found = true ;
								   
							   }
							  						   
							   encore = résultats.next();
						   }
						   résultats.close();
						   if (found == false) {
							   
							   System.out.println("no such book in our library !! ");
						   }
						   

						} catch (SQLException e) {
							arret("Anomalie lors de l'execution de la requête") ;
						}
					
					
					
					System.out.println("Maybe another ?: 1/yes 2/no  ") ; 
					Scanner sc3 = new Scanner(System.in);
					int search3= sc3.nextInt();
					if(search3==2) {
						toSearchOrNot = false ;
						System.out.println("maybe next time!! see you soon !!");
					}
					}
					}else {
						System.out.println("maybe next time!! see you soon !!");
					}
				}
					
				
				///////////////////////////////////////////////////////
				
				public void searchBookByAuteur () {
					boolean toSearchOrNot = true ;
					
										
					System.out.println("Do you want to search a book ?: 1/yes 2/no  ") ; 
					Scanner sc1 = new Scanner(System.in);
					int search = sc1.nextInt();
					if (search==1) {
						
					
					while (  toSearchOrNot ==true) {
						
					
					System.out.println("Veuillez saisirl'auteur du livre a chercher : ") ; 
					Scanner sc2 = new Scanner(System.in);
					String auteur = sc2.nextLine();
					
					String auteurClean = "'%"+auteur+"%'" ;

					requete = "SELECT * FROM library.book WHERE author ILIKE "+auteurClean+" ; " ;
					
				try {
				         Statement stmt = con.createStatement();
				         résultats = stmt.executeQuery(requete);
						 boolean encore = résultats.next();
						 boolean found = false ;
						   while (encore ) {
							   						   

								   System.out.println("id : " + résultats.getInt("id") +"\n"+ "title : "+résultats.getString("title")+ " \n"+ "author : "+résultats.getString("author") + " \n" +  "editor : "+résultats.getString("editor") +  "\n" +  "summary : "+résultats.getString("summary")
									  +  "\n" + "nbr pages : "+ résultats.getInt("page_nb")); 
								   						  						   
							   encore = résultats.next();
						   }
						   résultats.close();

							   
						   }
						   

						catch (SQLException e) {
							arret("Anomalie lors de l'execution de la requête") ;
						}
					
					
					System.out.println("Maybe another ?: 1/yes 2/no  ") ; 
					Scanner sc3 = new Scanner(System.in);
					int search3= sc3.nextInt();
					if(search3==2) {
						toSearchOrNot = false ;
						System.out.println("maybe next time!! see you soon !!");
					}
					}
					

					}
					
				}
					
				
				
			
			
			public LibraryManager() {
			}
			
		}
		

	


