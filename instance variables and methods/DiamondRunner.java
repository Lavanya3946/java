public class DiamondRunner 
 {
    public static void main(String[] args) 
	{
        
        Diamond diamond1 = new Diamond("Seller1", "Buyer1", "Location1", "2024-01-01", true, "Insurance1", 10000.00,"SN001", "Laser001", "10x5x3", "35.0", "40.0", true, "Engrave1", 5);
        Diamond diamond2 = new Diamond("Seller2", "Buyer2", "Location2", "2024-02-01", false, "Insurance2", 15000.00,"SN002", "Laser002", "11x6x4", "36.0", "41.0", false, "Engrave2", 10);
        Diamond diamond3 = new Diamond("Seller3", "Buyer3", "Location3", "2024-03-01", true, "Insurance3", 20000.00,"SN003", "Laser003", "12x7x5", "37.0", "42.0", true, "Engrave3", 15);

        
        diamond1.initializeReferences("Display1", "Showcase1", "Vault1", true, 25000.00, "Dealer1", "2023-12-01", false,18000.00, "Store1");
        diamond2.initializeReferences("Display2", "Showcase2", "Vault2", false, 30000.00, "Dealer2", "2023-11-01", true,22000.00, "Store2");
        diamond3.initializeReferences("Display3", "Showcase3", "Vault3", true, 35000.00, "Dealer3", "2023-10-01", false,27000.00, "Store3");

        
        diamond1.printDiamondDetails();
		System.out.println("______________");
        diamond2.printDiamondDetails();
		System.out.println("______________");
        diamond3.printDiamondDetails();
	}
 }