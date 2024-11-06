public class Country
 {
    public static String findCountryCode(String countryName) 
	{   
        String[] countries = {"United States", "Canada", "United Kingdom", "Australia", "Germany","France", "India", "Japan", "China", "Brazil","Russia", "Mexico", "South Africa", "Italy", "Spain"};
        String[] codes = {"US", "CA", "UK", "AU", "DE", "FR", "IN", "JP", "CN", "BR","RU", "MX", "ZA", "IT", "ES"};
		for(int i=0;i<countries.length;i++)
		{
            if (countries[i].equals(countryName))
			{
                return codes[i];
            }   
		}
                return "Unknown";
	}			
		
	
    public static void main(String[] args)
	{
        System.out.println(findCountryCode("United States"));  
        System.out.println(findCountryCode("India"));          
        System.out.println(findCountryCode("Spain"));          
        System.out.println(findCountryCode("Brazil"));         
        System.out.println(findCountryCode("Unknown Country"));
	}
 }