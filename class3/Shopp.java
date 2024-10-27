class Shopp
{
    String name;
	String ownerName;
	String landLineNo;
	String estDate;
	
	  Shopp()
	  {
		System.out.println("default values:");
		this.name="null";
		this.ownerName="null";
		this.landLineNo="null";
		this.estDate="null";
	  }
	  
	  
	  Shopp(String name)
	  {
		  this.name=name;
		  
	  }
	  
	  Shopp(String name,String ownerName)
	  {
		  this(name);
		  this.ownerName=ownerName;
	  }
	  
	  Shopp(String name,String ownerName,String landLineNo)
	  {
		  this(name,ownerName);
		  this.landLineNo=landLineNo;
		  
	  }
	  
	  Shopp(String name,String ownerName,String landLineNo,String estDate)
	  {
	     this(name,ownerName,landLineNo);
		 this.estDate=estDate;
	  }
}
