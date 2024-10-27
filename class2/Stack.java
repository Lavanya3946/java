public class Stack
{
	public static void recursiveMethod()
	{
		recursiveMethod();
		System.out.println("the stack is full");
	}
	public static void main(String[] args)
	{
		recursiveMethod();
	}
}