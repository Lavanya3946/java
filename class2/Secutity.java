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
        System.out.println("Security is opening the gate...");
        Gate.open();
    }
    public static void closeGate()
	{
        System.out.println("Security is closing the gate...");
        Gate.close(); 
    }
    public static void guard()
	{
        System.out.println("Security is guarding the premises.");
    }
    public static void operateLift()
	{
        System.out.println("Security is operating the lift.");
    }
   
    public static void sleep(int hours)
	{
        System.out.println("Security is sleeping for " + hours + " hours.");
    }
    public static void eat(String food) 
	{
        System.out.println("Security is eating " + food + ".");
    }

    public static void main(String[] args)
	{
        Security.openGate();  
        Security.closeGate(); 
        Security.guard();     
        Security.operateLift();
        Security.sleep(8);    
        Security.eat("lunch"); 
    }
}