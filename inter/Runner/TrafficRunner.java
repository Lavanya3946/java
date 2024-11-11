package com.xworkz.inter.Runner;

import com.xworkz.inter.Traffic.TrafficPolice;
import com.xworkz.inter.Traffic.TrafficRuleImpl;

public class TrafficRunner {
    public static void main(String[] args) {
        TrafficPolice trafficPolice=new TrafficPolice();
        TrafficRuleImpl trafficPolice1=new TrafficRuleImpl(trafficPolice);
        trafficPolice.stopRedLight();
        trafficPolice.speedLimit();
        trafficPolice.wearSeatBelt();

    }
}
