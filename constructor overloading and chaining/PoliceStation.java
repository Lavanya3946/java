class PoliceStation 
{
     String name;
     String location;
     String subInspectorName;
     String constableName;
     String inspectorName;
     String headConstableName;

    
     PoliceStation()
	 {
        this("Unknown", "Unknown", "Unknown", "Unknown", "Unknown", "Unknown");
    }

    
     PoliceStation(String name, String location)
	{
        this.name = name;
        this.location = location;
        this.subInspectorName = "Unknown";
        this.constableName = "Unknown";
        this.inspectorName = "Unknown";
        this.headConstableName = "Unknown";
    }

   
     PoliceStation(String name, String location, String subInspectorName, String constableName, String inspectorName, String headConstableName) 
	{
        this.name = name;
        this.location = location;
        this.subInspectorName = subInspectorName;
        this.constableName = constableName;
        this.inspectorName = inspectorName;
        this.headConstableName = headConstableName;
    }

    
     PoliceStation(PoliceStation policeStation)
	{
        this.name = policeStation.name;
        this.location = policeStation.location;
        this.subInspectorName = policeStation.subInspectorName;
        this.constableName = policeStation.constableName;
        this.inspectorName = policeStation.inspectorName;
        this.headConstableName = policeStation.headConstableName;
    }

    
    public void printDetails() 
	{
        System.out.println("Police Station Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Sub Inspector Name: " + subInspectorName);
        System.out.println("Constable Name: " + constableName);
        System.out.println("Inspector Name: " + inspectorName);
        System.out.println("Head Constable Name: " + headConstableName);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) 
	{
        
        PoliceStation ps1 = new PoliceStation("Downtown Station", "Downtown", "Officer A", "Constable A", "Inspector A", "Head Constable A");
        PoliceStation ps2 = new PoliceStation("Uptown Station", "Uptown", "Officer B", "Constable B");
        PoliceStation ps3 = new PoliceStation(ps1); 

        
        ps1.printDetails();
        ps2.printDetails();
        ps3.printDetails();
	}
}