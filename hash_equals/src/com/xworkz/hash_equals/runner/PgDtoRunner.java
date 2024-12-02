package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.PgDto;

public class PgDtoRunner {
    public static void main(String[] args) {
        PgDto pgDto1=new PgDto("golden pg",6000,6,"veg");
        PgDto pgDto2=new PgDto("kushi pg",6000,6,"veg");
        System.out.println("Pgdto1 is equals to pgdto2:"+pgDto1.equals(pgDto2));
        System.out.println("Pgdto1 hashcode:"+pgDto1.hashCode());
        System.out.println("Pgdto2 hashcode:"+pgDto2.hashCode());

    }
}
