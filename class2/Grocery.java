class Grocery
{
	public static void main(String[] args)
	{
		double rice=78;
		double oil=67;
		double maida=61;
		double onions=45;
		double gramflour=65;
		double grains=43;
		double peas=67;
		double coffe =54;
		double spices=20;
		double eggs=45;
		double[] grocerys={rice,oil,maida,gramflour,grains,onions,peas,coffe,spices,eggs};
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
		
		