class Bridge
{
	String name;
	double length;
	int numberOfLanes;
	String location;
	
	Bridge(String name,double length,int numberOfLanes,String location)
	{
		this.name=name;
		this.length=length;
		this.numberOfLanes=numberOfLanes;
		this.location=location;
	}
	  
	  
	  public void print()
	  {
		  System.out.println("name:"+this.name);
		  System.out.println("length:"+this.length);
		  System.out.println("numberOfLanes:"+this.numberOfLanes);
		  System.out.println("location:"+this.location);
	  }
}
		  