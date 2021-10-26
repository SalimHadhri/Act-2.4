import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


	

		public class LibraryManager { //Il en va de soit que plus tard cette méthode sera améliorée.


			Connection  con = ConnectionManager.getConnection();
		    ResultSet résultats = null;
		    String requete = "";
		    ResultSetMetaData rsmd;
			 
		    private static void arret(String message) {
		        System.err.println(message);
		        System.exit(99);
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
			public LibraryManager() {
			}
			
						
		}
		

	


