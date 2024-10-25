 public class Work
{
	public static void main(String[] args)
	{
		int[] price={205,337,179,217,83,435,313,420,108,120,101,143,90,35};
		System.out.println("prices below 250");
        for(int i=0;i<price.length;i++)
		{
			System.out.println(price[i]);
		}
		for(int i=0;i<price.length;i++)
		{
          if(price[i]>400)
		  {
			  price[i]=+20;
		  }
			  System.out.println("prices below 400"+price[i]);
		}
		  System.out.println("prices after update:");
		for(int i=0;i<price.length;i++)
		{
			System.out.println(price[i]);
		}
	}
}	
	
	
		  
			  
		
	

		