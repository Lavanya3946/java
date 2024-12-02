package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.MobileDto;

public class mobileDtoRunner {
    public static void main(String[] args) {
        MobileDto mobileDto1=new MobileDto("redmi",26000,128,"silver");
        MobileDto mobileDto2=new MobileDto("redmi",26000,128,"silver");
        System.out.println("mobile1 is=mobile2:"+mobileDto2.equals(mobileDto1));
        System.out.println("mobile1 hash code:"+mobileDto1.hashCode());
        System.out.println("mobile2 hash code:"+mobileDto2.hashCode());


    }
}
