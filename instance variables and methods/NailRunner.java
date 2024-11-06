class NailRunner
{
	public static void main(String[] args)
	{
		Nail nail=new Nail();
		nail.material="steel";
		nail.length=5.0;
		nail.diameter=3.9;
		nail.type="coomon";
		nail.finish="galvonized";
		
		Nail nail1=new Nail("Aluminium",3.6,6.8,"box","bright");
		Nail refNail=new Nail("steel",8.0,9,"coomon","brigth");
		Nail nail2=refNail;
		
		System.out.println("properties of nail:");
		nail.print();
		System.out.println("____________________");
		System.out.println("properties of nail1:");
		nail1.print();
		System.out.println("____________________");
		System.out.println("properties of nail2:");
		nail2.print();
	}
}
		
		
		
		
		