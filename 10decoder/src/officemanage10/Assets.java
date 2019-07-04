package officemanage10;

public class Assets {
	int Asset_id;
	public String Asset_name;
	public String Asset_model;
	 public String Asset_serialnumber;
	 float Asset_price;
	 String expire_date;
	 String waranty_details;
	 
	 int getAsset_id()
	 {
		 return Asset_id;
		 
	 }
	  void setAsset_id(int Asset_id)
	 {
		 this.Asset_id=Asset_id;
	 }
	 
	   String getAsset_name()
	 {
		 return Asset_name;
	 }
	  void setAsset_name( String Asset_name)
	 {
		 this.Asset_name=Asset_name;
		 
	 }
	 String getAsset_model(){
		 return Asset_model;
	 }
	 void setAsset_model(String Asset_model)
	 {
		this.Asset_model=Asset_model; 
	 }
	 
	 public  String getAsset_serialnumber()
	 {
		 return Asset_serialnumber;
	 }
	 public void setAsset_serialnumber(String Asset_serialnumber )
	 {
		 this.Asset_serialnumber=Asset_serialnumber;
	 }
	 public float getAsset_price()
	 {
		 return Asset_price;
	 }
	 public void setAsset_price(float Asset_price)
	 {
		 this.Asset_price=Asset_price;
	 }
	 String getexpire_date(){
		 return expire_date;
	 }
	 void setexpire_date(String expire_date)
	 {
		 this.expire_date=expire_date;
	}
	String getwaranty_details()
	{
		return waranty_details;
	}
	void setwaranty_details(String waranty_details)
	{
		this.waranty_details=waranty_details;
	}
	}



