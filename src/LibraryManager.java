import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


	

		public class LibraryManager { //Il en va de soit que plus tard cette m�thode sera am�lior�e.


			Connection  con = ConnectionManager.getConnection();
		    ResultSet r�sultats = null;
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
			         r�sultats = stmt.executeQuery(requete);
					 boolean encore = r�sultats.next();
					   while (encore) {
						   System.out.println("*********** new book ********");
						   System.out.println(r�sultats.getString("title")+ " \n"+ r�sultats.getString("author") + " \n" +  r�sultats.getString("editor") +  "\n" +  r�sultats.getString("summary")
						  +  "\n" +  r�sultats.getInt("page_nb")); 
						   
						   encore = r�sultats.next();
					   }
					   r�sultats.close();
					} catch (SQLException e) {
						arret("Anomalie lors de l'execution de la requ�te") ;
					}
			}
			public LibraryManager() {
			}
			
						
		}
		

	


