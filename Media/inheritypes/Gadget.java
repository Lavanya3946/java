package com.xworkz.Media.inheritypes;

public class Gadget extends  Device implements Rechargeable{

    public Gadget(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void recharge() {
        System.out.println("recharge is running");
    }
    void useGadget(){
        System.out.println("using the gadget..");
    }
}
