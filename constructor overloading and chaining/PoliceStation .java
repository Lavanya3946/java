class PoliceStation {
    private String name;
    private String location;
    private String subInspectorName;
    private String constableName;
    private String inspectorName;
    private String headConstableName;

    // Default Constructor
    public PoliceStation() {
        this("Unknown", "Unknown", "Unknown", "Unknown", "Unknown", "Unknown");
    }

    // Constructor with name and location
    public PoliceStation(String name, String location) {
        this.name = name;
        this.location = location;
        this.subInspectorName = "Unknown";
        this.constableName = "Unknown";
        this.inspectorName = "Unknown";
        this.headConstableName = "Unknown";
    }

    // Constructor with all parameters
    public PoliceStation(String name, String location, String subInspectorName, String constableName, String inspectorName, String headConstableName) {
        this.name = name;
        this.location = location;
        this.subInspectorName = subInspectorName;
        this.constableName = constableName;
        this.inspectorName = inspectorName;
        this.headConstableName = headConstableName;
    }

    // Copy constructor
    public PoliceStation(PoliceStation policeStation) {
        this.name = policeStation.name;
        this.location = policeStation.location;
        this.subInspectorName = policeStation.subInspectorName;
        this.constableName = policeStation.constableName;
        this.inspectorName = policeStation.inspectorName;
        this.headConstableName = policeStation.headConstableName;
    }

    // Method to print the details of the police station
    public void printDetails() {
        System.out.println("Police Station Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Sub Inspector Name: " + subInspectorName);
        System.out.println("Constable Name: " + constableName);
        System.out.println("Inspector Name: " + inspectorName);
        System.out.println("Head Constable Name: " + headConstableName);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        // Creating instances of PoliceStation
        PoliceStation ps1 = new PoliceStation("Downtown Station", "Downtown", "Officer A", "Constable A", "Inspector A", "Head Constable A");
        PoliceStation ps2 = new PoliceStation("Uptown Station", "Uptown", "Officer B", "Constable B");
        PoliceStation ps3 = new PoliceStation(ps1); // Using the copy constructor to create ps3 from ps1

        // Printing the details of each instance using printDetails() method
        ps1.printDetails();
        ps2.printDetails();
        ps3.printDetails();
    }
}
