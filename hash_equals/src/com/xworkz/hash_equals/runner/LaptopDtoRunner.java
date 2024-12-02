package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.LaptopDto;

public class LaptopDtoRunner {
    public static void main(String[] args) {
        LaptopDto laptopDto1=new LaptopDto("hp",40000,"windows  11","i3");
        LaptopDto laptopDto2=new LaptopDto("hp",40000,"windows  11","i5");

        System.out.println("laptop1 is equals to laptop2:"+laptopDto1.equals(laptopDto2));
        System.out.println("laptop 1 hashcode:"+laptopDto1.hashCode());
        System.out.println("laptop 2 hashcode:"+laptopDto2.hashCode());



    }
}
