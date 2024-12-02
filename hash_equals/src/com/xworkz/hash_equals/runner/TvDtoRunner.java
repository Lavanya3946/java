package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.TvDto;

public class TvDtoRunner {
    public static void main(String[] args) {

        TvDto tvDto1=new TvDto("sony",42,50000,"HD");
        TvDto tvDto2=new TvDto("sony",42,50000,"HD");

        System.out.println("Tv dto 1 is equals to Tv dto2:"+tvDto1.equals(tvDto2));
        System.out.println("Tv dto 1 hashcode:"+tvDto1.hashCode());
        System.out.println("Tv dto 2 hashcode:"+tvDto2.hashCode());


    }
}
