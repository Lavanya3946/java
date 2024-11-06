package com.xworkz.Inheritnace.casting;

public class PoliceOfficer extends PublicServent{
    @Override
    public void protectIPC() {
        System.out.println("running protectedIPC in policeOfficer");
    }
    public void controlCrime(){
        System.out.println("running controlCrime in policeOfficer");
    }
}
