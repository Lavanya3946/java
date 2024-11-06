class PoliceStationnRunner
{
	public static void main(String [] args)
	{
		PoliceStationn policestationn=new PoliceStationn();
		PoliceStationn policestationn1=new PoliceStationn("ram");
		PoliceStationn policestationn2=new PoliceStationn("shama","arsikere");
		PoliceStationn policestationn3=new PoliceStationn("beema","banglore","anand");
		PoliceStationn policestationn4=new PoliceStationn("soma","delhi","manju","om");
		PoliceStationn policestationn5=new PoliceStationn("renu","pune","sumanth","sanju","yashu");
		PoliceStationn policestationn6=new PoliceStationn("harsha","tumkur","rangnath","malli","vikas","varun");

		System.out.println("policestationn:"+policestationn.name+","+policestationn.location+","+policestationn.SubInspectorName+","+policestationn.ConstableName+","+policestationn.InspectorName+","+policestationn.headConstableName);
		System.out.println("policestationn1:"+policestationn1.name+","+policestationn1.location+","+policestationn1.SubInspectorName+","+policestationn1.ConstableName+","+policestationn1.InspectorName+","+policestationn1.headConstableName);
		System.out.println("policestationn2:"+policestationn2.name+","+policestationn2.location+","+policestationn2.SubInspectorName+","+policestationn2.ConstableName+","+policestationn2.InspectorName+","+policestationn2.headConstableName);
		System.out.println("policestationn3:"+policestationn3.name+","+policestationn3.location+","+policestationn3.SubInspectorName+","+policestationn3.ConstableName+","+policestationn3.InspectorName+","+policestationn3.headConstableName);
		System.out.println("policestationn4:"+policestationn4.name+","+policestationn4.location+","+policestationn4.SubInspectorName+","+policestationn4.ConstableName+","+policestationn4.InspectorName+","+policestationn4.headConstableName);
		System.out.println("policestationn5:"+policestationn5.name+","+policestationn5.location+","+policestationn5.SubInspectorName+","+policestationn5.ConstableName+","+policestationn5.InspectorName+","+policestationn5.headConstableName);
		System.out.println("policestationn6:"+policestationn6.name+","+policestationn6.location+","+policestationn6.SubInspectorName+","+policestationn6.ConstableName+","+policestationn6.InspectorName+","+policestationn6.headConstableName);
	}
}
