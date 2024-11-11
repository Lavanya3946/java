package com.xworkz.inter.Hospital;

public class Fortis {

    HospitalRule hospitalRule;

    public Fortis(HospitalRule hospitalRule) {

        this.hospitalRule = hospitalRule;
    }


     public void checkHospital(){
          boolean clean=hospitalRule.clean();

        if (clean){
            System.out.println("hospital is clean..");
        }
        else {
            System.out.println("hospital is not clean..");
        }


    }
}
