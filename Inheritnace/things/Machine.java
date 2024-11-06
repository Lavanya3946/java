package com.xworkz.Inheritnace.things;

public class Machine {
    public String manufacture;

    public Machine(String manufacture){
        this.manufacture=manufacture;
    }
    public void  start(){
        System.out.println("machine is starting:");
    }
    public void deviceInfo(){
        System.out.println("manufacturer:"+this.manufacture);
    }
    public void computerInfo(){
        System.out.println(" computer is starting:");
    }
    public void mobileInfo(){
        System.out.println("this ia a mobile device:");
    }
}
