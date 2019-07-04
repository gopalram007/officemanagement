package officemanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Officeassets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
try
{
	//"jdbc:mysql://localhost:3306/gopal", "root", "1234"
	Class.forName("com.mysql.jdbc.Driver");
	Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gopal","root","1234");
	System.out.println("Enter choose the option:");
	Integer nums=scan.nextInt();
	switch(nums)
	{
	case 1:
		PreparedStatement  pre=co.prepareStatement("insert into Asset(Asset_id,Asset_name,Asset_model,Asset_serialnumber,Asset_price,expiry_date,waranty_details) values (?,?,?,?,?,?,?)");
		System.out.println("Enter the Asset_id:");
		 String Asset_id=scan.next();
		 pre.setString(1,Asset_id);
		 
		 System.out.println("Enter the Asset_name:");
		 String Asset_name=scan.next();
		 pre.setString(2,Asset_name);
		 
		 System.out.println("Enter the Asset_model:");
		 String Asset_model=scan.next();
		 pre.setString(3,Asset_model);
		 
		 System.out.println("Enter the Asset_serialnumber:");
		 String Asset_serialnumber=scan.next();
		 pre.setString(4,Asset_serialnumber);
		 
		 System.out.println("Enter the Asset_price:");
		 String Asset_price=scan.next();
		 pre.setString(5,Asset_price);
		 
		 System.out.println("Enter the expire_date:");
		 String expire_date=scan.next();
		 pre.setString(6,expire_date);
		 
		 System.out.println("Enter the waranty_details:");
		 String waranty_details=scan.next();
		 pre.setString(7,waranty_details);
		 
		 int count=pre.executeUpdate();
		 if(count>0)
		 {
			 System.out.println("Sucessfully Inserted");
		 }
		 break;
		 
		 
	case 2:
		Statement sta=co.createStatement();
		ResultSet re=sta.executeQuery("select * from Asset");
		while(re.next())
		{
			System.out.println("s_no= "  +re.getString(1)+" ");
			System.out.println(" Asset_id=  "  +re.getString(2)+" ");
			System.out.println("Asset_name=  "   +re.getString(3)+" ");
			System.out.println("Asset_model= "  +re.getString(4)+" ");
			System.out.println("Asset_serialnumber=  "  +re.getString(5)+" ");
			System.out.println(" Asset_price =  "  +re.getString(6)+" ");
			System.out.println("expire_date=  "  +re.getString(7)+" ");
			System.out.println("waranty_details= "  +re.getString(8)+" ");
			//System.out.println();
			//System.out.println();
		}
		break;
	case 3:
		PreparedStatement st=co.prepareStatement("select * from Asset where s_no=?");
		//ResultSet re1=st.executeQuery("select * from Asset where s_no=?");
		System.out.println("Enter the s_no:");
		 String s_no=scan.next();
		st.setString(1, s_no);
		 ResultSet rt=st.executeQuery();
		while(rt.next())
		{
			System.out.println("s_no= "  +rt.getString(1)+" ");
			System.out.println(" Asset_id=  "  +rt.getString(2)+" ");
			System.out.println("Asset_name=  "   +rt.getString(3)+" ");
			System.out.println("Asset_model= "  +rt.getString(4)+" ");
			System.out.println("Asset_serialnumber=  "  +rt.getString(5)+" ");
			System.out.println(" Asset_price =  "  +rt.getString(6)+" ");
			System.out.println("expire_date=  "  +rt.getString(7)+" ");
			System.out.println("waranty_details= "  +rt.getString(8)+" ");
			//System.out.println();
			//System.out.println();
		}
		break;
	case 4:
		PreparedStatement par=co.prepareStatement("update Asset set Asset_id=?where Asset_name=?");
		
		System.out.println("Enter the Asset_id:");
		String Asset_id1=scan.next();
		par.setString(2,Asset_id1);
		
		System.out.println("Enter the Asset_name:");
		String Asset_name1=scan.next();
		par.setString(1,Asset_name1);
	
		int num=par.executeUpdate();
		if(num>0)
		{
			System.out.println("Sucessfully updated");
		}
		break;
		
	case 5:
          PreparedStatement pars=co.prepareStatement("delete from Asset  where Asset_name=?");
		
//		System.out.println("Enter the Asset_id:");
//		String Asset_id1=scan.next();
//		par.setString(2,Asset_id1);
		
		System.out.println("Enter the Asset_name:");
		String Asset_name11=scan.next();
		pars.setString(1,Asset_name11);
	
		int mun=pars.executeUpdate();
		if( mun>0)
		{
			System.out.println("Sucessfully deleted");
		}
		break;
	}
	co.close();
}


catch(Exception e)
{
	System.out.println(e);
}
	}

}
