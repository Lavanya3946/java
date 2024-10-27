class Iron
{
	String color;
	String state;
	double melthingPoint;
	boolean isMagnetic;
	String use;
	
	
	Iron(String color,String state,double melthingPoint,boolean isMagnetic,String use)
	{
		this.color=color;
		this.state=state;
		this.melthingPoint=melthingPoint;
		this.isMagnetic=isMagnetic;
		this.use=use;
	}
		
		
		public void print()
		{
			System.out.println("color:"+this.color);
			System.out.println("state:"+this.state);
			System.out.println("melthingPoint:"+this.melthingPoint);
			System.out.println("isMagnetic:"+this.isMagnetic);
			System.out.println("use:"+this.use);
		}
}
			
	