
class Diamond 
{
    
    String color = "White";
    int carat = 10;
    String shape = "Round";
    boolean clarity = true;
    double price = 5000.99;
    String origin = "Africa";
    String cut = "Ideal";
    boolean isCertified = true;
    int hardness = 10;
    double weight = 0.5;
    String polish = "Excellent";
    String symmetry = "Very Good";
    String fluorescence = "None";
    String certificationLab = "GIA";
    String reportNumber = "1234567890";

    
    String seller;
    String buyer;
    String location;
    String auctionDate;
    boolean isInsured;
    String insuranceCompany;
    double insuranceAmount;
    String serialNumber;
    String laserInscription;
    String measurement;
    String crownAngle;
    String pavilionAngle;
    boolean isEngraved;
    String engravingText;
    int age;

    
    String displayLocation;
    String showcase;
    String vault;
    boolean isOnDisplay;
    double marketValue;
    String dealer;
    String purchaseDate;
    boolean isSold;
    double resaleValue;
    String store;

    
    public Diamond(String seller, String buyer, String location, String auctionDate, boolean isInsured,String insuranceCompany, double insuranceAmount, String serialNumber, String laserInscription,String measurement, String crownAngle, String pavilionAngle, boolean isEngraved, String engravingText,int age)
	{
        this.seller = seller;
        this.buyer = buyer;
        this.location = location;
        this.auctionDate = auctionDate;
        this.isInsured = isInsured;
        this.insuranceCompany = insuranceCompany;
        this.insuranceAmount = insuranceAmount;
        this.serialNumber = serialNumber;
        this.laserInscription = laserInscription;
        this.measurement = measurement;
        this.crownAngle = crownAngle;
        this.pavilionAngle = pavilionAngle;
        this.isEngraved = isEngraved;
        this.engravingText = engravingText;
        this.age = age;
    }

    
    public void initializeReferences(String displayLocation, String showcase, String vault, boolean isOnDisplay,double marketValue, String dealer, String purchaseDate, boolean isSold, double resaleValue, String store) 
	{
        this.displayLocation = displayLocation;
        this.showcase = showcase;
        this.vault = vault;
        this.isOnDisplay = isOnDisplay;
        this.marketValue = marketValue;
        this.dealer = dealer;
        this.purchaseDate = purchaseDate;
        this.isSold = isSold;
        this.resaleValue = resaleValue;
        this.store = store;
    }

    
    public void printDiamondDetails() 
	{
        System.out.println("Diamond Details:");
        System.out.println("Color: " + color);
        System.out.println("Carat: " + carat);
        System.out.println("Shape: " + shape);
        System.out.println("Clarity: " + clarity);
        System.out.println("Price: " + price);
        System.out.println("Origin: " + origin);
        System.out.println("Cut: " + cut);
        System.out.println("Certified: " + isCertified);
        System.out.println("Hardness: " + hardness);
        System.out.println("Weight: " + weight);
        System.out.println("Polish: " + polish);
        System.out.println("Symmetry: " + symmetry);
        System.out.println("Fluorescence: " + fluorescence);
        System.out.println("Certification Lab: " + certificationLab);
        System.out.println("Report Number: " + reportNumber);
        System.out.println("Seller: " + seller);
        System.out.println("Buyer: " + buyer);
        System.out.println("Location: " + location);
        System.out.println("Auction Date: " + auctionDate);
        System.out.println("Insured: " + isInsured);
        System.out.println("Insurance Company: " + insuranceCompany);
        System.out.println("Insurance Amount: " + insuranceAmount);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Laser Inscription: " + laserInscription);
        System.out.println("Measurement: " + measurement);
        System.out.println("Crown Angle: " + crownAngle);
        System.out.println("Pavilion Angle: " + pavilionAngle);
        System.out.println("Engraved: " + isEngraved);
        System.out.println("Engraving Text: " + engravingText);
        System.out.println("Age: " + age);
        System.out.println("Display Location: " + displayLocation);
        System.out.println("Showcase: " + showcase);
        System.out.println("Vault: " + vault);
        System.out.println("On Display: " + isOnDisplay);
        System.out.println("Market Value: " + marketValue);
        System.out.println("Dealer: " + dealer);
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Sold: " + isSold);
        System.out.println("Resale Value: " + resaleValue);
        System.out.println("Store: " + store);
    }
}


public class DiamondProgram
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
        diamond2.printDiamondDetails();
        diamond3.printDiamondDetails();
	}
 }