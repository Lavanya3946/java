class Festival
{
	String festname;
	String festMonth;
	
	
	Festival(String festname,String festMonth)
	{
		this.festname=festname;
		this.festMonth=festMonth;
	}
	
	Festival()
	{
	}
	
	public void print()
	{
		System.out.println("featival name:"+this.festname);
		System.out.println("featival Month:"+this.festMonth);
	}
}

		