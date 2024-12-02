package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.BagDto;

public class BagDtoRunner {
    public static void main(String[] args) {
        BagDto bagDto1=new BagDto("black",789,"laptop","celin");
        BagDto bagDto2=new BagDto("red",789,"laptop","celin");

        System.out.println("bag1 is equals to bag 2:"+bagDto1.equals(bagDto2));
        System.out.println("Bag1  hashcode:"+bagDto1.hashCode());
        System.out.println("Bag2 hashcode:"+bagDto2.hashCode());
    }
}
