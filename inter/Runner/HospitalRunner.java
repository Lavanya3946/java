package com.xworkz.inter.Runner;

import com.xworkz.inter.Hospital.Fortis;
import com.xworkz.inter.Hospital.HospitalRule;
import com.xworkz.inter.Hospital.MgRoadRule;

public class HospitalRunner {
    public static void main(String[] args) {
        HospitalRule hospitalRule=new MgRoadRule();
        Fortis fortis=new Fortis(hospitalRule);
        fortis.checkHospital();

    }
}
