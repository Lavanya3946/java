class Nation
 {
    String name;               
    PrimeMinisterr primeministerr; 
    
    Nation()
	{
        this.name = "Unknown"; 
        this.primeministerr = new primeministerr("Unknown", "Unknown");
	}		

    Nation(String name,String pmName)
	{
        this.name = name;
        this.primeministerr = new primeministerr(pmName, "Unknown");
	}		
 }