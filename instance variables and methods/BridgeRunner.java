class BridgeRunner
{
	public static void main(String[] values)
	{
		Bridge bridge=new Bridge("Golden gate",234.7,6,"san Fransico");
		Bridge bridge1=new Bridge("Brooklyn Bridge",138.9,5,"New york");
		
		Bridge refBridge=new Bridge("Tower Bridge",67.5,7,"London");
		Bridge bridge2=refBridge;
		
		System.out.println("properties of bridge:");
		bridge.print();
		System.out.println("________________________");
		System.out.println("properties of bridge1:");
		bridge1.print();
		System.out.println("________________________");
		System.out.println("properties of bridge2:");
		bridge2.print();
	}
}
		

		