class River
 {
    
    String name;
     double length; 
     double width; 
     double depth; 
     String source;
     String mouth;
     String country;
     String tributaries;
     String basin;
     String ecosystem;
     double flowRate; 
     boolean navigable;
     String waterType; 
     String flora; 
     String fauna; 
     double pollutionLevel; 
     boolean protectedArea;
     double averageTemperature; 
     double salinity; 
     boolean recreationalUse;
     double sedimentLoad; 
     String historicalSignificance;
     double waterQualityIndex; 
     double drainageArea; 
     String localCulturalImportance;
     double averageDischarge;
     boolean damPresence;
     String majorCitiesAlong;
     double averageDepth; 
     boolean endangeredSpeciesPresence;
     double seasonalVariability; 

   
    River(String name, double length, double width, double depth, String source, String mouth,String country, String tributaries, String basin, String ecosystem,double flowRate, boolean navigable, String waterType, String flora,String fauna, double pollutionLevel, boolean protectedArea,double averageTemperature, double salinity, String climateZone,boolean recreationalUse, double sedimentLoad, String historicalSignificance,double waterQualityIndex, double drainageArea, String localCulturalImportance,double averageDischarge, boolean damPresence, String majorCitiesAlong,double averageDepth, boolean endangeredSpeciesPresence,double seasonalVariability)
	{
        this.name = name;
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.source = source;
        this.mouth = mouth;
        this.country = country;
        this.tributaries = tributaries;
        this.basin = basin;
        this.ecosystem = ecosystem;
        this.flowRate = flowRate;
        this.navigable = navigable;
        this.waterType = waterType;
        this.flora = flora;
        this.fauna = fauna;
        this.pollutionLevel = pollutionLevel;
        this.protectedArea = protectedArea;
        this.averageTemperature = averageTemperature;
        this.salinity = salinity;
        this.climateZone = climateZone;
        this.recreationalUse = recreationalUse;
        this.sedimentLoad = sedimentLoad;
        this.historicalSignificance = historicalSignificance;
        this.waterQualityIndex = waterQualityIndex;
        this.drainageArea = drainageArea;
        this.localCulturalImportance = localCulturalImportance;
        this.averageDischarge = averageDischarge;
        this.damPresence = damPresence;
        this.majorCitiesAlong = majorCitiesAlong;
        this.averageDepth = averageDepth;
        this.endangeredSpeciesPresence = endangeredSpeciesPresence;
        this.seasonalVariability = seasonalVariability;
    }

    
    public void printDetails()
	{
        System.out.println("River Name: " + name);
        System.out.println("Length: " + length + " km");
        System.out.println("Width: " + width + " m");
        System.out.println("Depth: " + depth + " m");
        System.out.println("Source: " + source);
        System.out.println("Mouth: " + mouth);
        System.out.println("Country: " + country);
        System.out.println("Tributaries: " + tributaries);
        System.out.println("Basin: " + basin);
        System.out.println("Ecosystem: " + ecosystem);
        System.out.println("Flow Rate: " + flowRate + " m³/s");
        System.out.println("Navigable: " + navigable);
        System.out.println("Water Type: " + waterType);
        System.out.println("Flora: " + flora);
        System.out.println("Fauna: " + fauna);
        System.out.println("Pollution Level: " + pollutionLevel);
        System.out.println("Protected Area: " + protectedArea);
        System.out.println("Average Temperature: " + averageTemperature + " °C");
        System.out.println("Salinity: " + salinity + " ppt");
        System.out.println("Climate Zone: " +climateZone);
        System.out.println("Recreational Use: " + recreationalUse);
        System.out.println("Sediment Load: " + sedimentLoad + " tons/year");
        System.out.println("Historical Significance: " + historicalSignificance);
        System.out.println("Water Quality Index: " + waterQualityIndex);
        System.out.println("Drainage Area: " + drainageArea + " km²");
        System.out.println("Local Cultural Importance: " + localCulturalImportance);
        System.out.println("Average Discharge: " + averageDischarge + " m³/s");
        System.out.println("Dam Presence: " + damPresence);
        System.out.println("Major Cities Along: " + majorCitiesAlong);
        System.out.println("Average Depth: " + averageDepth + " m");
        System.out.println("Endangered Species Presence: " + endangeredSpeciesPresence);
        System.out.println("Seasonal Variability: " + seasonalVariability + "%");
    }
}

 