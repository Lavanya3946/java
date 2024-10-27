class Cooker
{
	int size;
	int quantity;
    String brand;

public static void main(String[] values)
{
  Cooker cooker=new Cooker();
  System.out.println("size of a cooker is:"+cooker.size);
  System.out.println("Quantity of a cooker is:"+cooker.quantity);
  System.out.println("Brand of a cooker is:"+cooker.brand);
  cooker.size=5;
  System.out.println("size of a cooker after updated  is:"+cooker.size);
  cooker.quantity=7;
  System.out.println("Quantity of a cooker after updated  is:"+cooker.quantity);
  cooker.brand="pressure";
  System.out.println("Brand of a cooker after updated is:"+cooker.brand);
}
}
  

  