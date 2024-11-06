class RiverRunner
 {
    public static void main(String[] args) 
	{
        River river1 = new River("Amazon", 6992, 1.0, 5.0, "Nevado Mismi", "Atlantic Ocean","Brazil", "Rio Negro", "Madeira", "Amazon Basin", "Tropical Rainforest",209000, true, "Freshwater", "Victoria Regia", "Giant Water Lily","Amazon River Dolphin", "Piranha", 7.5, true, 25.0, 0.1, "Tropical",true, 120000, "Cultural Significance for Indigenous Peoples", 85.0, 7050000, "Manaus","Iquitos", 10.0, true, "Manaus", "Belem", 15.0, 5.0);

        
        River river2 = new River("Nile", 6650, 0.3, 8.0, "Lake Victoria", "Mediterranean Sea","Egypt", "Blue Nile","White Nile", "Nile Basin", "Savanna",2800, true, "Freshwater", "Papyrus", "Water Hyacinth","Nile Crocodile", "Hippopotamus", 4.0, false, 22.0, 0.0, "Hot Desert",true, 20000, "Ancient Civilizations", 90.0, 3000000,"Cairo", "Khartoum", 11.0, true, "Cairo", "Luxor", 20.0, 10.0);

        
        River river3 = new River(river1.name, river1.length, river1.width, river1.depth, river1.source,river1.mouth, river1.country, river1.tributaries, river1.basin, river1.ecosystem,river1.flowRate, river1.navigable, river1.waterType, river1.flora,river1.fauna, river1.pollutionLevel, river1.protectedArea, river1.averageTemperature,river1.salinity, river1.climateZone, river1.recreationalUse, river1.sedimentLoad,river1.historicalSignificance, river1.waterQualityIndex, river1.drainageArea,river1.localCulturalImportance, river1.averageDischarge, river1.damPresence,river1.majorCitiesAlong, river1.averageDepth, river1.endangeredSpeciesPresence,river1.seasonalVariability);

        
        System.out.println("River 1 Details:");
        river1.printDetails();
        System.out.println("\nRiver 2 Details:");
        river2.printDetails();
        System.out.println("\nRiver 3 Details:");
        river3.printDetails();
	}
 }