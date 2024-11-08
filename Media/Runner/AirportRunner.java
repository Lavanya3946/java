package com.xworkz.Media.Runner;

import com.xworkz.Media.Internal.AirportRuleImpl;

public class AirportRunner {
    public static void main(String[] args) {
        AirportRuleImpl airportRule=new AirportRuleImpl(true,"PAN");
        System.out.println(airportRule.arriveBefore());
        System.out.println(airportRule.idProof());

    }
}
