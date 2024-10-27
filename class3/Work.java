 public class Work 2
{
	public static void main(String[] args)
	{
		int[] price={205,337,179,217,83,435,313,420,108,120,101,143,90,35};
		
		for(int i=0;i<price.length;i++)
		{
          if(price[i]>400)
		  {
			  price[i]+=20;
		  }
			  System.out.println(price[i]);
		}
		System.out.println("prices below 250");
		 for(int i=0;i<price.length;i++)
		 { 
	       if(price[i]<250)
		   {
			   System.out.println("prices below 250"  +(i+1)+":"+price[i]);
		   }
		 }
		 System.out.println("price sbelow 100");
		 for(int i=0;i<price.length;i++)
		 {
			 if(price[i]>100)
			 {
				 price[i]*=50;
			 }
			  System.out.println(price[i]);
		 }
		 System.out.println("substraction");
		 for(int i=0;i<price.length;i++)
		 {
			 if (price[i]==420);
			 {
				 price[i]-=277;
			 }
			  System.out.println("substraction of 420 by 277 is"+(i+1)+":" +price[i]);
		 }
	}
}	
	
	
		  
			  
		
	

		