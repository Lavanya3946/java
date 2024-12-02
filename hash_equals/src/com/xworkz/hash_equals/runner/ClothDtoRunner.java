package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.ClothDto;

public class ClothDtoRunner {
    public static void main(String[] args) {
        ClothDto clothDto1=new ClothDto("saree","red",3000,"cotton");
        ClothDto clothDto2=new ClothDto("saree","red",9000,"cotton");
        System.out.println("Cloth1 is equals to cloth2 :"+clothDto1.equals(clothDto2));
        System.out.println("Cloth 1 hashcode:"+clothDto1.hashCode());
        System.out.println("cloth 2 hashcode:"+clothDto2.hashCode());

    }
}
