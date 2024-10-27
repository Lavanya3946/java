class ThreadLocal
{
	String color;
	int thickness;
	
	public static void main(String[] args)
	{
		ThreadLocal threadlocal=new ThreadLocal();
		System.out.println("color of a thread:"+threadlocal.color);
		System.out.println("Thickness of a thead:"+threadlocal.thickness);
		threadlocal.color="red";
		System.out.println("color of a thread after updated is:"+threadlocal.color);
		threadlocal.thickness=2;
		System.out.println("Thickness of a thread after updated is:"+threadlocal.thickness);
		
	}
}