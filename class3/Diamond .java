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


