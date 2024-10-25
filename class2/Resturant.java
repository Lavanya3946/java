public class Resturant
{
	public static String order(double prices)
	{
		String items;
		if(prices>=1000)
		{
           items="luxury suite,gourmet Dinner";
		}
		else if(prices>=500)
		{
			items="Delux room,Buffet Dinner";
		}
		else if (prices>=200)
		{
			items="standard Room,Breakfast";
		}
		else
		{
			items="economy room";
		}
	      return items;
	}

	public static void main(String[] args)
	{
	double prices=750;
	String orderedItems=Resturant.order(prices);
	System.out.println("ordered items:"+orderedItems);
	}
}