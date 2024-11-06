package com.xworkz.Inheritnace.casting;

public class PoliceStation {
    public void justice(PoliceOfficer officer){
        if(officer instanceof Inspector){
            Inspector inspector=(Inspector) officer;
            inspector.controlStation();
        }
        if (officer instanceof TrafficPolice) {
            TrafficPolice trafficPolice=(TrafficPolice) officer;
            trafficPolice.controlTraffic();

        }
    }
}
