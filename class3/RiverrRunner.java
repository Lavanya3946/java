public class RiverrRunner
{
    public static void main(String[] args)
	{
        
        Riverr river1 = new Riverr("Tropical", "Rainforest", true, 15, "Iguazu Falls", true, 5, true, "Piranha", false);
        Riverr river2 = new Riverr("Temperate", "Grassland", false, 0, "None", false, 0, false, "Salmon", true);
        Riverr river3 = new Riverr("Arid", "Desert", true, 3, "Angel Falls", true, 2, true, "Catfish", false);

        
        river1.initializeReferences("Town1", "Ancient Trade Route", "Freshwater", true, 1000000, "Birds and Fish", true, 20, "Boating", true);
        river2.initializeReferences("Town2", "Colonial Settlement", "Brackish", true, 500000, "Mammals and Reptiles", false, 10, "Fishing", true);
        river3.initializeReferences("Town3", "Spiritual Significance", "Saltwater", false, 250000, "Amphibians", false, 5, "Irrigation", true);

        
        river1.printRiverDetails();
        System.out.println("______________");
        river2.printRiverDetails();
        System.out.println("________________");
        river3.printRiverDetails();
	}
}
