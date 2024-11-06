class Chicken
{
	double weight;
	int price;
	String breed;
	static String vendor="vencobb";
	
	
	Chicken(double weight,int price,String breed)
	{
		this.weight=weight;
		this.price=price;
		this.breed=breed;
		
		
		
	}
	public void print()
	{
		System.out.println("chicken name:"+this.weight);
		System.out.println("chicken price:"+this.price);
		System.out.println("chicken name:"+this.breed);
		System.out.println("chicken vendor:"+this.vendor);
	}
}