import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class MySQLConnectivity {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection= 
		DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/javabatch", "root", "nikhil");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter name");
		String ss= scanner.nextLine();
		Statement statement= connection.createStatement();
		ResultSet resultSet= statement.executeQuery(
			"select * from t7 where user='"+ss+"'");
		
		
		ResultSetMetaData data= resultSet.getMetaData();
		System.out.println("Table Name: "+data.getTableName(2));
		
		resultSet.last();
		int idd1= resultSet.getInt(1);
		String name1= resultSet.getString(2);
		System.out.println("Id: "+idd1+"         Name: "+name1);
		
		while(resultSet.previous()){
			int idd= resultSet.getInt(1);
			String name= resultSet.getString(2);
			System.out.println("Id: "+idd+"         Name: "+name);
		}
	}

}
