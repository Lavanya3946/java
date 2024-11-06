package com.xworkz.Inheritnace.things;

public class Computer  extends Device{
    public String OS;

    public Computer(String manufacturer,String deviceName,String OS){
        super(manufacturer,deviceName);
        this.OS=OS;
    }

    public void computerInfo(){
        System.out.println("Operating System:"+this.OS);
    }
}
