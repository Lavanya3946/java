class Soaps
{
	public static void main(String[] args)
	{
		int[] soaps={20,45,50,56,34};
		System.out.println("prices before update:");
		for(int i=0;i<soaps.length;i++)
		{
			System.out.println(soaps[i]);
		}
        for(int i=0;i<soaps.length;i++)
		{
          if(soaps[i]<50)
		  {
             soaps[i]+=5;
		  }
		}	  
		System.out.println("prices after update:");
		for(int i=0;i<soaps.length;i++)
		{
			System.out.println(soaps[i]);
		}
	}
}
		