class FestivalRunner
{
	public static void main(String[] args)
	{
		
		Festival festival=new Festival();
		festival.festname="sankrathi";
		festival.festMonth="jan";
		
		Festival festival1=new Festival("dasara","oct");
		
		Festival refFest=new Festival("deepavali","nov");
		Festival festival2=refFest;
		
		System.out.println("properties of Festival:");
		festival.print();
		System.out.println("______________");
		System.out.println("properties of Festival1:");
		festival1.print();
		System.out.println("______________");
		System.out.println("properties of Festival2:");
		festival2.print();
		System.out.println("______________");
		
	}
}
		