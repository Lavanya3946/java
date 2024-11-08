package com.xworkz.Media.Runner;

import com.xworkz.Media.Internal.HospitalRuleImpl;

public class HospitalRuleRunner {
    public static void main(String[] args) {
        HospitalRuleImpl hospitalRule=new HospitalRuleImpl("JayDeva",10,1500, true);
        System.out.println(hospitalRule.hospitalName());
        System.out.println(hospitalRule.visitingHours());
        System.out.println("admit Patient:"+hospitalRule.admitPatient());
        System.out.println("no of Beds:"+hospitalRule.noOfBeds());
    }
}
