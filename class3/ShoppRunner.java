class ShoppRunner
{
	public static void main(String[] args)
	{
		Shopp shopp=new Shopp();
		Shopp shopp1=new Shopp("local market");
		Shopp shopp2=new Shopp("global market","yashu");
		Shopp shopp3=new Shopp("dmart","lavu","9087654389");
		Shopp shopp4=new Shopp("market","moni","8765435778","9-9-22");
		Shopp shopp5=new Shopp("dmart ready","monio","876537890","8-9-20");
		
		
		
		
		
		System.out.println("shopp:"+shopp.name+","+shopp.ownerName+","+shopp.landLineNo+","+shopp.estDate);
		System.out.println("shopp1:"+shopp1.name+","+shopp1.ownerName+","+shopp1.landLineNo+","+shopp1.estDate);
		System.out.println("shopp2:"+shopp2.name+","+shopp2.ownerName+","+shopp2.landLineNo+","+shopp2.estDate);
		System.out.println("shopp3:"+shopp3.name+","+shopp3.ownerName+","+shopp3.landLineNo+","+shopp3.estDate);
	    System.out.println("shopp4:"+shopp4.name+","+shopp4.ownerName+","+shopp4.landLineNo+","+shopp4.estDate);
		System.out.println("shopp5:"+shopp5.name+","+shopp5.ownerName+","+shopp5.landLineNo+","+shopp5.estDate);
	}
}

