package officemanage10;

import java.sql.Connection;
import java.sql.DriverManager;

public class Datebase {
	 Datebase()
	{
		connect();
	}
	 public Connection con;
public void connect()
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gopal","root","1234");
		
	}
	catch(Exception e)
	{
		
	}
}
}
