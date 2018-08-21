import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertDBDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection= 
		DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/javabatch", "root", "nikhil");
		PreparedStatement preparedStatement=
		connection.prepareStatement("insert into t7 values(?,?)");
		preparedStatement.setInt(1, 7);
		preparedStatement.setString(2, "ducats");
		preparedStatement.executeUpdate();
		System.out.println("Sucessfully inserted");
	
	}

}
