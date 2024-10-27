 class Shop
{
	String name;
	String ownerName;
	String landlineNo;
	String estDate;
	
	Shop1()
	{
		System.out.println("default values:");
		this.name="null";
		this.ownerName="null";
		this.landlineNo="null";
		this.estDate="null";
	}
	
	
	Shop(String name)
	{
		this.name=name;
	}
	 
	 Shop(String name,String ownerName)
	 {
		 this(name);
		 this.ownerName=ownerName;
	 }
	 
	 Shop4(String name,String ownerName,String landlineNo)
	 {
		 this(name,ownerName);
		 this.landlineNo=landlineNo;
	 }
	  
	  Shop5(String name,String ownerName,String landlineNo,String estDate)
	  {
		  this(name,ownerName,landlineNo);
		  this.estDate=estDate;
	  }
	  
	  
	    shopDetails()
	  {
         System.out.println("Shop name:"+name);
		 System.out.println("ownerName name:"+ownerName);
		 System.out.println("landlineNo name:"+landlineNo);
		 System.out.println("estDate name:"+estDate);
	  }
}
	  

		 
 class shopRunner
{
 public static void main(String[] args)
 {
    Shop shop1=new shop1("Local store","lavu","8902345678","13-09-2022");	
    Shop shop2=new shop2("Local store","lavu","8902345678","13-09-2022");	 
    Shop shop3=new shop3("Local store","lavu","8902345678","13-09-2022");	 
	Shop shop4=new shop4("Local store","lavu","8902345678","13-09-2022");	 
	Shop shop5=new shop5("Local store","lavu","8902345678","13-09-2022");
	Shop shop6=new shop6("Local store","lavu","8902345678","13-09-2022");	
    
    
	shop1.shopDetails();
	shop2.shopDetails();
	shop3.shopDetails();
	shop4.shopDetails();
	shop5.shopDetails();
	shop6.shopDetails();
	
 }
}
		 	
		 		 
		 