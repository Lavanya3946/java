class Camp
{
	
	String name;
    String location;
    int capacity;  
    double area;   
    boolean hasElectricity;
    String terrainType;
	
	Camp(String name,String location,int capacity,double area,boolean hasElectricity,String terrainType)
	{
		this.name=name;
		this.location=location;
		this.capacity=capacity;
		this.area=area;
		this.hasElectricity=hasElectricity;
		this.terrainType=terrainType;
	}
	
	Camp()
	{
	}
	
	public void print()
	{
		System.out.println("name:"+this.name);
		System.out.println("location:"+this.location);
		System.out.println("capacity:"+this.capacity);
		System.out.println("area:"+this.area);
		System.out.println("hasElectricity:"+this.hasElectricity);
		System.out.println("terrainType:"+this.terrainType);
	}
}


		
