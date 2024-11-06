class NeedleRunner
{
	public static void main(String[] values)
	{
	Needle needle=new Needle();
	System.out.println("material of a needle is:"+needle.material);
	System.out.println("length of a needle is:"+needle.length);
	needle.material="steel";
	System.out.println("material of a needle after updated is :"+needle.material);
	needle.length=8;
	System.out.println("length of a needle is after updated is:"+needle.length);
	
	}
}

	
	