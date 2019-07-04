package officemanagement;

import java.util.Scanner;

public class Testassets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assets As=new Assets();
Scanner sc=new Scanner(System.in);
System.out.println("enter the Asset_id");
As.Asset_id=sc.nextInt();
System.out.println("enter the Asset_price");
As.Asset_price=sc.nextFloat();
System.out.println("enter the expire_date");
As.expire_date=sc.next();
System.out.println("enter the waranty_details");
As.waranty_details=sc.next();
System.out.println("enter the Asset_ name");
As.Asset_name=sc.next();
System.out.println("enter the Asset_model");
As.Asset_model=sc.next();
System.out.println("enter the Asset_serialnumber");
As.Asset_serialnumber=sc.next();
//As.setAsset_id(12334);
//As.setAsset_name("hp");
//As.setAsset_model("desktop");
//As.setAsset_serialnumber("1234566723fsfg");
//As.setAsset_price(1123000f);
//As.setexpire_date("10-years");
//As.setwaranty_details("1-years");
System.out.println(As.getAsset_id()+ " " ) ;
System.out.println(As.getAsset_model()+ " " );
System.out.println(As.getAsset_name()+ " " );
System.out.println(As.getAsset_price()+ " " );
System.out.println(As.getAsset_serialnumber()+ " " );
System.out.println(As.getexpire_date()+ " " );
System.out.println(As.getwaranty_details()+ " " );

		//Scanner sc=new Scanner(System.in);
	}

}
