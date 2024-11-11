package com.xworkz.inter.Hospital;

public class MgRoadRule implements HospitalRule {
    @Override
    public boolean clean() {
        System.out.println("clean in running in MgRoadRule..");
        return true;
    }
}
