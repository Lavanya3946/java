package com.xworkz.Media.Internal;

public class TrafficRuleImpl implements TrafficRule{

    public boolean wearHelmet;
    public int speed;

    public TrafficRuleImpl(boolean wearHelmet, int speed){
        this.wearHelmet=wearHelmet;
        this.speed=speed;
    }


    @Override
    public boolean wearingHelmet() {
        System.out.println("wearingHelmet is running in TrafficRuleImpl..");
        return wearHelmet;
    }

    @Override
    public int speedLimit() {
        System.out.println("speedLimit is running in TrafficRuleImpl..");
        return speed;
    }
}
