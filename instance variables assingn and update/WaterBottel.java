class WaterBottel
{
	int size;
	String shape;
	
	public static void main(String[] values)
	{
		WaterBottel waterbottel=new WaterBottel();
		System.out.println("size of a woterbottel is:"+ waterbottel.size);
		System.out.println("shape of a woterbottel is:"+ waterbottel.shape);
		waterbottel.size=6;
		System.out.println("shape of a woterbottel after updated is :" +waterbottel.size);
		waterbottel.shape="cyclinder";
		System.out.println("shape of a woterbottel after updated is:" +waterbottel.shape);
	}
}
	
		