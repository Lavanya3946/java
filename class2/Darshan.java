class Darshan
{
	 public static void gotoFirstFloor()
	 {
		 Security.operateLift();
		 Security.sleep();
		 System.out.println("Darshan is sleeping..");
	 }
}
public class Lift
{
	public static void main(String[] args)
	{
		Darshan.gotoFirstFloor();
		Security.sleep();
	}
}		 