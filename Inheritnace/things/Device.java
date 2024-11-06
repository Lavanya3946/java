package com.xworkz.Inheritnace.things;

public class Device extends Machine {
    public String deviceName;

    public Device(String manufacturer,String deviceName){
        super(manufacturer);
        this.deviceName=deviceName;
    }
    public void deviceInfo(){
        System.out.println("Device name:"+this.deviceName);
    }


}
