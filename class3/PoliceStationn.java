class PoliceStationn
{
	String name;
	String location;
	String SubInspectorName;
	String ConstableName;
	String InspectorName;
	String headConstableName;
	
	
	PoliceStationn()
	{
		System.out.println("default values");
		this.name="null";
		this.location="null";
		this.SubInspectorName="null";
		this.ConstableName="null";
		this.InspectorName="null";
		this.headConstableName="null";
	}
	
	PoliceStationn(String name)
	{
		this.name=name;
	}
	
	PoliceStationn(String name,String location)
	{
		 this(name);
		 this.location=location;
	}
	
	PoliceStationn(String name,String location,String SubInspectorName)
	{
		this(name,location);
		this.SubInspectorName=SubInspectorName;
	}
	
	PoliceStationn(String name,String location,String SubInspectorName,String ConstableName)
	{
		this(name,location,SubInspectorName);
		this.ConstableName=ConstableName;
	}
	
	PoliceStationn(String name,String location,String SubInspectorName,String ConstableName,String InspectorName)
	{
		this(name,location,SubInspectorName,ConstableName);
		this.InspectorName=InspectorName;
	}
	
	PoliceStationn(String name,String location,String SubInspectorName,String ConstableName, String InspectorName,String headConstableName)
	{
		this(name,location,SubInspectorName,ConstableName,InspectorName);
		this.headConstableName=headConstableName;
	}
    
}
