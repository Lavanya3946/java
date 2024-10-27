class Gate 
{
    public static void open()
	{
        System.out.println("The gate is now open.");
    }
    public static void close() 
	{
        System.out.println("The gate is now closed.");
    }
}
class Security 
{
    public static void openGate() 
	{
        Gate.open();
    }
    public static void closeGate()
	{
        Gate.close(); 
    }
    public static void guard()
	{
        System.out.println("security is guarding..");
    }
    public static void operateLift()
	{
      System.out.println("security is operating lift:");  
    }
    public static void sleep()
	{
        System.out.println("Security is sleeping..");
    }
    public static void eat() 
	{
        System.out.println("Security is eating.. ");
    }
    public static void main(String[] args)
	{
		Security.openGate();
		Security.closeGate();
		Security.guard();
		Security.operateLift();
        Security.sleep();    
        Security.eat();  
	}
}