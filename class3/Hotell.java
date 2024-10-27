public class Hotell
{
      public static String Order(double price)
	 {
		 String items;
		if(price>=1000)
		{
			items="luxury suite,Gournet Dinner";
		}
		else if (price>=500)
		{
			items="Delux Room,Buffer Dinner";
		}
		else if(price>=200)
		{
			items="standard Room,Breakfast";
		}
		else
		{
			items="economy Room";
		}
       return items;
	}

public static void main(String[] args)
{
	int  price =760;
	String items=Hotell.Order(price);
	System.out.println("ordered items:"+items);
}
}