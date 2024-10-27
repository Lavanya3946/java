class Darshan
{
	 public static void gotoFirstFloor()
	 {
		 System.out.println("Darshan is going first floor..");
	 }
}
public class Lift
{
	public static void main(String[] args)
	{
		Security.operateLift();
		Darshan.gotoFirstFloor();
		Security.sleep();
	}
}		 