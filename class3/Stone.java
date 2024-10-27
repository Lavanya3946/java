class Stone
{
	String color;
	double weight;
	String type;
	
	
	Stone(String color,double weight,String type)
	{
		this.color=color;
		this.weight=weight;
		this.type=type;
	}
	Stone()
	{
	}
	
	
	public void print()
	{
		System.out.println("color:"+this.color);
		System.out.println("weight:"+this.weight);
		System.out.println("type:"+this.type);
	}
}
		