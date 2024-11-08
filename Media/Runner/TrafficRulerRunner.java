package com.xworkz.Media.Runner;
import com.xworkz.Media.Internal.TrafficRuleImpl;

public class TrafficRulerRunner {
    public static void main(String[] args) {
        TrafficRuleImpl trafficRule=new TrafficRuleImpl(true,50);
        System.out.println("wearing Helmet:"+trafficRule.wearingHelmet());
        System.out.println("speed limit:"+trafficRule.speedLimit());



    }
}
