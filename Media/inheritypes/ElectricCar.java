package com.xworkz.Media.inheritypes;

public class ElectricCar extends Car{
    int batteryLife;
    public ElectricCar(String brand, int doors,int batteryLife) {
        super(brand, doors);
        this.batteryLife=batteryLife;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLife=" + batteryLife +
                '}';
    }
}
    


