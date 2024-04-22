import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
public class DBconnect {

		private static final String URL="jdbc:mysql://localhost/testUtente";
		
		private static final String USER ="app_java" ;
		private static final String PASSWORD="java_2024!" ;
		
		public static Connection connect() throws SQLException {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		}
		
}
