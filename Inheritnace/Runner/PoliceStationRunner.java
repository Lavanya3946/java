package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.casting.Inspector;
import com.xworkz.Inheritnace.casting.PoliceOfficer;
import com.xworkz.Inheritnace.casting.PoliceStation;
import com.xworkz.Inheritnace.casting.TrafficPolice;

public class PoliceStationRunner {
    public static void main(String[] args) {
        PoliceStation policeStation=new PoliceStation();

        PoliceOfficer ps1=new TrafficPolice();
        PoliceOfficer ps2=new Inspector();

        policeStation.justice(ps1);
        System.out.println("-----------------");
        policeStation.justice(ps2);
    }



}
