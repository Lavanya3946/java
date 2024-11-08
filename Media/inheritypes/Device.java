package com.xworkz.Media.inheritypes;

public class Device {
    String  brand;
    String model;

    public  Device(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    void deviceInfo()
    {
        System.out.println("Device:"+brand+" "+model+" "+model);
    }
}
