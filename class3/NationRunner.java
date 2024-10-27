public class NationRunner
 {
    public static void main(String[] args)
	{
        
        Nation nation1 = new Nation();
        System.out.println("Country name: " + nation1.name);
        System.out.println("Prime Minister: " + nation1.primeministerr.name);
        Nation nation2 = new Nation("India", "Modi");
        System.out.println("Country name: " + nation2.name);
        System.out.println("Prime Minister: " + nation2.primeministerr.name);
        PrimeMinisterr primeministerr = new primeministerr("Modi", "BJP");
        System.out.println("Prime Minister Name: " + primeministerr.name);
        System.out.println("Party: " + primeministerr.party);
	}
 }