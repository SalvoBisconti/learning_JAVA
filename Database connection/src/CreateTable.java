import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class CreateTable {

	public static void main (String[] args) {
		String sql ="create table student(" +
				"id int auto_increment primary key,"+ 
				"nome varchar(50)," +
				"congnome varchar(50),"+
				"eta int)";
	
		try (Connection connection = DBconnect.connect();
			Statement stmt = connection.createStatement()){ 
				stmt.execute(sql);
				System.out.println("Tabella creata");
			} catch (Exception e) {
				e.printStackTrace();
		}
}
}
