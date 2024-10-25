class Laptop
{
	static  String name="hp";
	public static void info()
	{
		System.out.println("laptop name is HP."+name);
		
	}
	
}
class Cost
{
	static double price=450000;
	static byte weight=21;
	public static void price()
	{
		System.out.println("price:"+price);
	    
	}
	   
	   public static void quantity()
	   {
		   System.out.println("quantity:"+weight);
	        
	   }
	 static byte modelNob=21;
	public static void info(int modelNob)
	{ 
	 System.out.println("modelno is:"+modelNob);
	}
}

	public class System
	{
	   public static void main(String[] args)
	   {
		   Laptop.info();
		   Cost.info(89);
		   Cost.price();
		   Cost.quantity();
	   }
	}
	   
	   
	   
	
	
	
	
		
	
	