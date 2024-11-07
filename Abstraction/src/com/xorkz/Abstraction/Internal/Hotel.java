package com.xorkz.Abstraction.Internal;

public abstract class Hotel {

    public void service(){
        System.out.println("service is running in Hotel..");
    }
    public void advanceBooking(){
        System.out.println("advanceBooking running in Hotel..");
    }
    public  abstract void portableRoom();

    @Override
    public String toString() {
        return "Hotel [service,advance booking,portable room]";
    }
}
