package com.xworkz.Media.Internal;
public class AirportRuleImpl implements AirportRule {
    public  boolean beforeArrive;
    public  String Id;

    public AirportRuleImpl(boolean beforeArrive, String Id){
        this.beforeArrive=beforeArrive;
        this.Id=Id;


    }

    @Override
    public boolean arriveBefore() {
        System.out.println("arriveBefore is running in AirportRuleImpl..");
        return beforeArrive;
    }

    @Override
    public String idProof() {
        System.out.println("idProof is running in AirportRuleImpl..");
        return "Id:"+Id;
    }
}
