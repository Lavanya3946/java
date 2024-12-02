package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.InstituteDto;

public class InstituteDtoRunner {
    public static void main(String[] args) {
        InstituteDto instituteDto1=new InstituteDto("xworkz","java",6,"rajajinagar");
        InstituteDto instituteDto2=new InstituteDto("xworkz","java",6,"rajajinagar");
        System.out.println("Institute 1 is equals to institute 2:"+instituteDto1.equals(instituteDto2));
        System.out.println("Institute 1 hash code:"+instituteDto1.hashCode());
        System.out.println("Institute 2 hash code:"+instituteDto2.hashCode());

    }
}
