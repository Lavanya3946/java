package com.xworkz.Internal;

public class Rocket {
    String  company;
    double budget;
    String ceoName;

    public Rocket(String company,double budget,String ceoName){
        this.company=company;
        this.budget=budget;
        this.ceoName=ceoName;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("obj is running in rocket");
        if(obj==null)return false;
        if(obj instanceof  Rocket ){
            Rocket rocket =(Rocket) obj;
            return this.company.equals(rocket.company)&&
                    budget== rocket.budget &&
                    this.ceoName.equals(rocket.ceoName);
        }
        return false;
    }
}
