public class Theater
{
    public static String book(int price)
	{
        switch (price)
		{
            case 100:
                return "Gandhi Class";
            case 150:
                return "Middle Class";
            case 200:
                return "Balcony";
            default:
                return "Invalid Price! No such seat type available.";
        }
    }
    public static void main(String[] args)
	{
        int price1 = 100;
        int price2 = 150;
        int price3 = 200;
        int price4 = 250; 
        System.out.println("Seat for price " + price1 + ": " + book(price1));
        System.out.println("Seat for price " + price2 + ": " + book(price2));
        System.out.println("Seat for price " + price3 + ": " + book(price3));
        System.out.println("Seat for price " + price4 + ": " + book(price4));
	}
 }