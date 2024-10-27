public class TheaterRunner
{
      public static String book(double price)
	 {
		 String seatType;
		if(price==200)
		{
			seatType="Balcony";
		}
		else if (price==150)
		{
			seatType="Middle class";
		}
		else if(price==100)
		{
			seatType="gandhi class";
		}
		else
		{
			seatType="invalid class";
		}
       return seatType;
	}

public static void main(String[] args)
{
	int  price =150;
	String seatType=TheaterRunner.book(price);
	System.out.println("Booked seat type:"+seatType);
}
}