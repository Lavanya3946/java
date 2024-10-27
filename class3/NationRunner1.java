class Nation {
    String name;               // The name of the country
    PrimeMinister primeminister; // The Prime Minister of the country
    
    // Default constructor
     Nation() {
        this.name = name; // Default name
        this.primeminister =  new PrimeMinister("null","null"); // Default Prime Minister
    }

    // Constructor with parameters for name and Prime Minister
     Nation(String name, String pmName) {
        this.name = name;
        this.primeminister = new PrimeMinister(pmName, "Unknown"); // Assign PM name, default party
    }
}

class PrimeMinister {
    String name;   // The name of the Prime Minister
    String party;  // The political party of the Prime Minister
    
    // Constructor for Prime Minister
    public PrimeMinister(String name, String party) {
        this.name = name;
        this.party = party;
    }
}

public class NationRunner1 {
    public static void main(String[] args) {
        // Using default Nation constructor
        Nation nation1 = new Nation();
        System.out.println("Country name: " + nation1.name);
        System.out.println("Prime Minister: " + nation1.primeminister.name);

        // Using parameterized Nation constructor
        Nation nation2 = new Nation("India", "Modi");
        System.out.println("Country name: " + nation2.name);
        System.out.println("Prime Minister: " + nation2.primeminister.name);

        // Creating a Prime Minister with a name and party
        PrimeMinister primeminister = new PrimeMinister("Modi", "BJP");
        System.out.println("Prime Minister Name: " + primeminister.name);
        System.out.println("Party: " + primeminister.party);
	}
}