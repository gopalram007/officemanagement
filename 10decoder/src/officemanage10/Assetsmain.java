package officemanage10;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Assetsmain implements Asset {
	
	Scanner scan=new Scanner(System.in);
	//ArrayList<Assets> ali=new ArrayList<Assets>();
	Datebase da=new Datebase();
	public void display()
	{
		System.out.println("----Asset Details----");
		System.out.println("1.Asset_id:");
		System.out.println("2.Asset_name:");
		System.out.println("3.Asset_model:");
		System.out.println("4.Asset_serialnumbe:r");
		System.out.println("5.Asset_price:");
		System.out.println("6.expire_date:");
		System.out.println("7.waranty_details:");
		
		Assetsmain Ama=new Assetsmain();
		System.out.println("1.Insert");
		System.out.println("2.select ");
		System.out.println("3.delete");
		System.out.println("4.update");
		System.out.println("Enter the option");
		for(int i=0;i<1000;i++)
		{
			int option=scan.nextInt();
			switch(option)
			{
			case 1:
				Ama.insert();;
				break;
			case 2:
				Ama.select();
				break;
			case 3:
				Ama.delete();
				break;
			case 4:
				Ama.update();
				break;
			}
		}
		
	}
	public void insert()
	{
		try{
			
		
		PreparedStatement  pre=da.con.prepareStatement("insert into Asset(Asset_id,Asset_name,Asset_model,Asset_serialnumber,Asset_price,expiry_date,waranty_details) values (?,?,?,?,?,?,?)");
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
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void select()
	{
		try
		{
			Statement sta=da.con.createStatement();
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
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void delete()
	{
	try
	{
		 PreparedStatement pars=da.con.prepareStatement("delete from Asset  where Asset_name=?"); 
			
//			System.out.println("Enter the Asset_id:");
//			String Asset_id1=scan.next();
//			par.setString(2,Asset_id1);
			
			System.out.println("Enter the Asset_name:");
			String Asset_name11=scan.next();
			pars.setString(1,Asset_name11);
		
			int mun=pars.executeUpdate();
			if( mun>0)
			{
				System.out.println("Sucessfully deleted");
			}
	}
	catch(Exception e)
	{
	System.out.println(e);	
	}
	}
	public void update()
	{
		try
		{
			PreparedStatement par=da.con.prepareStatement("update Asset set Asset_id=?where Asset_name=?");
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
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assetsmain Ama1=new Assetsmain();
		Ama1.display();
	}

}
