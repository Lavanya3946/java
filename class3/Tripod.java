class Tripod
{
	String stable;
	int length;
	String type;
	
	public static void main(String[] run)
	{
		Tripod tripod=new Tripod();
		System.out.println("stable of a Tripod:"+tripod.stable);
		System.out.println("length of a Tripod:"+tripod.length);
		System.out.println("Type of a Tripod:"+tripod.type);
		tripod.stable="legs";
		System.out.println("stable of a Tripod after updated is:"+tripod.stable);
		tripod.length=20;
		System.out.println("Length of a Tripod after updated is:"+tripod.length);
		tripod.type="Ball heads,3-way Heads,2-way Heads";
		System.out.println("types of a Tripods after updated is:"+tripod.type);
	}
}
		
		
		
		
		
		