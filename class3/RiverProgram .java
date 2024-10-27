class Riverr
{
    
    String name = "Amazon";
    double length = 6992.0;
    String source = "Andes Mountains";
    String mouth = "Atlantic Ocean";
    String country = "Brazil";
    int tributaries = 1100;
    boolean navigable = true;
    double averageDepth = 40.0;
    String majorCity = "Manaus";
    double flowRate = 209000;

    
    String climate;
    String surroundingVegetation;
    boolean hasWaterfalls;
    int numberOfWaterfalls;
    String famousWaterfall;
    boolean hasDams;
    int numberOfDams;
    boolean supportsFishing;
    String mainFishSpecies;
    boolean isPolluted;

    
    String nearbyTown;
    String historicalImportance;
    String ecosystem;
    boolean supportsTourism;
    double tourismRevenue;
    String wildlife;
    boolean endangeredSpecies;
    int numberOfEndangeredSpecies;
    String mainActivity;
    boolean usedForIrrigation;

   
     Riverr(String climate, String surroundingVegetation, boolean hasWaterfalls, int numberOfWaterfalls,String famousWaterfall, boolean hasDams, int numberOfDams, boolean supportsFishing, String mainFishSpecies, boolean isPolluted)
	{
        this.climate = climate;
        this.surroundingVegetation = surroundingVegetation;
        this.hasWaterfalls = hasWaterfalls;
        this.numberOfWaterfalls = numberOfWaterfalls;
        this.famousWaterfall = famousWaterfall;
        this.hasDams = hasDams;
        this.numberOfDams = numberOfDams;
        this.supportsFishing = supportsFishing;
        this.mainFishSpecies = mainFishSpecies;
        this.isPolluted = isPolluted;
    }

    
    public void initializeReferences(String nearbyTown, String historicalImportance, String ecosystem, boolean supportsTourism, double tourismRevenue, String wildlife,boolean endangeredSpecies, int numberOfEndangeredSpecies, String mainActivity, boolean usedForIrrigation)
	{
        this.nearbyTown = nearbyTown;
        this.historicalImportance = historicalImportance;
        this.ecosystem = ecosystem;
        this.supportsTourism = supportsTourism;
        this.tourismRevenue = tourismRevenue;
        this.wildlife = wildlife;
        this.endangeredSpecies = endangeredSpecies;
        this.numberOfEndangeredSpecies = numberOfEndangeredSpecies;
        this.mainActivity = mainActivity;
        this.usedForIrrigation = usedForIrrigation;
    }

    
    public void printRiverDetails()
	{
        System.out.println("River Details:");
        System.out.println("Name: " + name);
        System.out.println("Length: " + length + " km");
        System.out.println("Source: " + source);
        System.out.println("Mouth: " + mouth);
        System.out.println("Country: " + country);
        System.out.println("Tributaries: " + tributaries);
        System.out.println("Navigable: " + navigable);
        System.out.println("Average Depth: " + averageDepth + " meters");
        System.out.println("Major City: " + majorCity);
        System.out.println("Flow Rate: " + flowRate + " m³/s");
        System.out.println("Climate: " + climate);
        System.out.println("Surrounding Vegetation: " + surroundingVegetation);
        System.out.println("Has Waterfalls: " + hasWaterfalls);
        System.out.println("Number of Waterfalls: " + numberOfWaterfalls);
        System.out.println("Famous Waterfall: " + famousWaterfall);
        System.out.println("Has Dams: " + hasDams);
        System.out.println("Number of Dams: " + numberOfDams);
        System.out.println("Supports Fishing: " + supportsFishing);
        System.out.println("Main Fish Species: " + mainFishSpecies);
        System.out.println("Is Polluted: " + isPolluted);
        System.out.println("Nearby Town: " + nearbyTown);
        System.out.println("Historical Importance: " + historicalImportance);
        System.out.println("Ecosystem: " + ecosystem);
        System.out.println("Supports Tourism: " + supportsTourism);
        System.out.println("Tourism Revenue: $" + tourismRevenue);
        System.out.println("Wildlife: " + wildlife);
        System.out.println("Endangered Species: " + endangeredSpecies);
        System.out.println("Number of Endangered Species: " + numberOfEndangeredSpecies);
        System.out.println("Main Activity: " + mainActivity);
        System.out.println("Used for Irrigation: " + usedForIrrigation);
    }
}


