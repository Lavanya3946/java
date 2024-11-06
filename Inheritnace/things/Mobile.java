package com.xworkz.Inheritnace.things;

public class Mobile extends Computer{
    public String name;

    public Mobile(String manufacturer, String deviceName, String OS ,String name) {
        super(manufacturer, deviceName, OS);
        this.name=name;
    }

    @Override
    public void mobileInfo() {
        System.out.println("mobile network:"+this.name);
    }
}

