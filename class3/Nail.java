class Nail
{
	String material;
	double length;
	double diameter;
	String type;
	String finish;
	
	
	Nail(String material,double length,double diameter,String type,String finish)
	{
		this.material=material;
		this.length=length;
		this.diameter=diameter;
		this.type=type;
		this.finish=finish;
	}
	
	Nail()
	{
	}
	
	
	public void print()
	{
		System.out.println("material:"+this.material);
		System.out.println("length:"+this.length);
		System.out.println("diameter:"+this.diameter);
		System.out.println("type:"+this.type);
		System.out.println("finish:"+this.finish);
	}
}
		
		