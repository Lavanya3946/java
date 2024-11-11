package com.xworkz.inter.Traffic;

public class TrafficPolice implements TrafficRule{
    @Override
    public void stopRedLight() {
        System.out.println("stop red light is running in Traffic police");
    }

    @Override
    public void speedLimit() {
        System.out.println("speedLimit is running in traffic Police");

    }

    @Override
    public void wearSeatBelt() {
        System.out.println("wearSeatBelt is running in Traffic police.. ");

    }
}
