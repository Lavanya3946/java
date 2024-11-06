package com.xworkz.Inheritnace.casting;

public class TrafficPolice extends PoliceOfficer{
    public void controlTraffic(){
        System.out.println("running controlTraffic in trafficpolice");
    }

    @Override
    public void controlCrime() {
        System.out.println("running controlcrime in traffic police");
    }
}
