package com.xworkz.Media.inheritypes;

public class Appliance extends  Device{
    public Appliance(String brand, String model) {
        super(brand, model);
    }
    void useAppliance(){
        System.out.println("useAppliance is running..");
    }
}
