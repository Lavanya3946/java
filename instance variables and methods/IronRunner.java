class IronRunner
{
	public static void main(String[] args)
	{
		Iron iron=new Iron("silver-gray","solid",1345.0,true,"construction");
		Iron iron1=new Iron("Dark-gray","solid",78.67,true,"manufacturing");
		
		
		Iron refIron=new Iron("Rusty red","solid",7865.9,true,"Rusting");
		Iron iron2=refIron;
		
		
		System.out.println("properties of Iron");
		iron.print();
		System.out.println("----------------------");
		System.out.println("properties of Iron1");
		iron1.print();
		System.out.println("----------------------");
		System.out.println("properties of Iron2");
		iron2.print();
	}
}

		