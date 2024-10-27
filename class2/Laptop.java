class Laptop
{
	public static void main(String[] args)
	{
		 info();
		 info(21);
		 cost(21,40000);
		 cost("hp",21,40000,2);
	}
	static void info()
	{
		String name="hp";
		int modelNo=21;
		System.out.println("name of  a laptop.."+name);
		System.out.println("modelNo of laptop.."+modelNo);
	}
	static void  info( int modelNo)
	{
		System.out.println("model of a laptop"+modelNo);
	}
	static void cost(int modelNo,double  price)
	{
		System.out.println("model no of a laptop"+modelNo);
		System.out.println("Price of a laptop"+price);
	}
	static void cost( String name,int modelNo,double price,int quantity)
	{
		System.out.println("name:"+name);
		System.out.println("model no of a laptop"+modelNo);
		System.out.println("Price of a laptop"+price);
		System.out.println("qunatity of a laptop"+quantity);
		
	}
}
		
		