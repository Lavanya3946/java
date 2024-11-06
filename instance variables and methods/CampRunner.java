class CampRunner
{
	public static void main(String[] args)
	{
		Camp camp=new Camp();
		camp.name="mountain base";
		camp.location="rocky mountains";
		camp.capacity=150;
		camp.area=25.0;
		camp.hasElectricity=true;
		camp.terrainType="mountaious";
		
		Camp camp1=new Camp("Desert oasis","sahara desert",80,10.6,true,"desert");
		
		Camp refCamp=new Camp("kumaraparvatha","karnataka",89,78.9,true,"hill");
		Camp camp2=refCamp;
		
		System.out.println("properties of camp:");
		camp.print();
		System.out.println("--------------------");
		System.out.println("properties of camp1:");
		camp1.print();
		System.out.println("--------------------");
		System.out.println("properties of camp2:");
		camp2.print();
	}
}
		

		
	