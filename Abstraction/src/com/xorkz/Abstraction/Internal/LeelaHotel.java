package com.xorkz.Abstraction.Internal;

public  class  LeelaHotel extends Hotel{
    @Override
    public void portableRoom() {
        System.out.println("portable room is running in leelaHotel..");
    }

    @Override
    public void service() {

        System.out.println("service is running in LeelaHotel..");
    }

    @Override
    public void advanceBooking() {

        System.out.println("advanceBooking is running in LeelaHotel");
    }

    @Override
    public String toString() {

        return "LeelaHotel [service,6-month advance booking ,portable room]";
    }
}
