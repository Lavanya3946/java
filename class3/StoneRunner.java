class StoneRunner
{
	public static void main(String[] args)
	
	{ 
		Stone stone=new Stone();
		stone.color="red";
		stone.weight=5.9;
		stone.type="granite";
		
		
		Stone stone1=new Stone("green",3.7,"marble");
		
		Stone refstone=new Stone("blue",8.9,"granite");
		Stone stone2=refstone;
		
		System.out.println("properties of stone:");
		stone.print();
		System.out.println("___________________");
		System.out.println("properties of stone1:");
		stone1.print();
		System.out.println("___________________");
		System.out.println("properties of stone2:");
		stone2.print();
	}
}