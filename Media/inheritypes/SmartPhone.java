package com.xworkz.Media.inheritypes;

public class SmartPhone extends Gadget{

    public SmartPhone(String brand, String model) {
        super(brand, model);
    }
    void makeCall(){
        System.out.println("makeCall is running..");
    }
}
