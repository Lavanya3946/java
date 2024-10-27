class Car
 {
    String make = "null";
    String model = "null";
    int year = 0;
    String color = "null";
    String engineType = "null";
    int horsepower = 0;
    int torque = 0;
    String transmission = "null";
    int numberOfDoors = 0;
    boolean isElectric = false;

    public Car()
	{
        
    }

    
    public Car(String make, String model)
	{
        this.make = make;
        this.model = model;
    }

   
    public Car(String make, String model, int year)
	{
        this.make = make;
        this.model = model;
        this.year = year;
    }

    
    public Car(String make, String model, int year, String engineType, String transmission)
	{
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.transmission = transmission;
    }

    
    public Car(String make, String model, int year, String color, String engineType, int horsepower, int torque, String transmission, int numberOfDoors, boolean isElectric)
	{
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.torque = torque;
        this.transmission = transmission;
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }
}

public class mainRunner
 {
    public static void main(String[] args) 
	{
        
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry");
        Car car3 = new Car("Honda", "Civic", 2022);
        Car car4 = new Car("Tesla", "Model S", 2021, "Electric", "Automatic");
        Car car5 = new Car("Ford", "Mustang", 2020, "Blue", "Gasoline", 450, 500, "Manual", 2, false);

        
        System.out.println("Car 1: " + car1.make + ", " + car1.model + ", " + car1.year + ", " + car1.color + ", " + car1.engineType + ", " + car1.horsepower + " hp, " + car1.torque + " Nm, " + car1.transmission + ", " + car1.numberOfDoors + " doors, Electric: " + car1.isElectric);
        System.out.println("Car 2: " + car2.make + ", " + car2.model + ", " + car2.year + ", " + car2.color + ", " + car2.engineType + ", " + car2.horsepower + " hp, " + car2.torque + " Nm, " + car2.transmission + ", " + car2.numberOfDoors + " doors, Electric: " + car2.isElectric);
        System.out.println("Car 3: " + car3.make + ", " + car3.model + ", " + car3.year + ", " + car3.color + ", " + car3.engineType + ", " + car3.horsepower + " hp, " + car3.torque + " Nm, " + car3.transmission + ", " + car3.numberOfDoors + " doors, Electric: " + car3.isElectric);
        System.out.println("Car 4: " + car4.make + ", " + car4.model + ", " + car4.year + ", " + car4.color + ", " + car4.engineType + ", " + car4.horsepower + " hp, " + car4.torque + " Nm, " + car4.transmission + ", " + car4.numberOfDoors + " doors, Electric: " + car4.isElectric);
        System.out.println("Car 5: " + car5.make + ", " + car5.model + ", " + car5.year + ", " + car5.color + ", " + car5.engineType + ", " + car5.horsepower + " hp, " + car5.torque + " Nm, " + car5.transmission + ", " + car5.numberOfDoors + " doors, Electric: " + car5.isElectric);
	}
}