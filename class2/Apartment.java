class Yashaswini
{
	public static void enterApartment()
	{
		System.out.println("yashaswini is goin to enter the apartment..");
	}
	public static void exitApartment()
	{
		System.out.println("yashaswini is goin to exit the apartment..");
    }
}
	public class Apartment
	{
		 public static void main(String[] args)
		 {
			 Yashaswini.enterApartment();
			 Security.openGate();
			 Yashaswini.exitApartment();
			 Security.closeGate();
		 }
	}	 