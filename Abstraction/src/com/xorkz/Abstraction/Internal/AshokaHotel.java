package com.xorkz.Abstraction.Internal;

public class AshokaHotel extends LeelaHotel{
    @Override
    public void portableRoom() {
        System.out.println("portable room is running in AshokaHotel...");
    }

    @Override
    public void service() {
        System.out.println("service is running in AshokaHotel ..");
    }

    @Override
    public void advanceBooking() {
        System.out.println("advance booking in AshokaHotel..");
    }

    @Override
    public String toString() {
        return "AshokaHotel[service,1-month advance booking,portable room]";
    }
}
