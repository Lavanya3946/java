package com.xworkz.Media.Internal;

public class HospitalRuleImpl implements HospitalRule{
    String name;
    int visitingTime;
    int beds;
    boolean admission;

     public HospitalRuleImpl(String name,int visitingTime,int beds,boolean admission){
        this.name=name;
        this.visitingTime=visitingTime;
        this.beds=beds;
        this.admission=admission;
    }



    @Override
    public String hospitalName() {
        System.out.println ("hospitalName is running in HospitalRuleImpl..");
        return  "name:"+name;
    }

    @Override
    public String visitingHours() {
        System.out.println("VisitingHours is running in HospitalRuleImpl..");
        return "visitingTime:"+visitingTime;
    }

    @Override
    public int noOfBeds() {
        System.out.println("noOfBeds is running in HospitalRuleImpl..");
        return beds;
    }

    @Override
    public boolean admitPatient() {
        System.out.println("admitPatient is running in HospitalRuleImpl..");
        return admission;
    }
}
