class Grocery1
{
	public static void main(String[] args)
	{
		int rice=78;
		int oil=67;
		int maida=61;
		int onions=45;
		int gramflour=65;
		int grains=43;
		int peas=67;
		int coffe =54;
		int spices=20;
		int eggs=45;
		int[] grocerys={rice,oil,maida,gramflour,grains,onions,peas,coffe,spices,eggs};
		System.out.println("Grocery price less than 50");
		for( int i=0;i<grocerys.length;i++)
		{
			if(grocerys[i]<50)
			{
				System.out.println(grocerys[i]);
			}
		}
	}
}
		
		