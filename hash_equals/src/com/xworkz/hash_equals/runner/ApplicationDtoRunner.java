package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.ApplicationDto;

public class ApplicationDtoRunner {
    public static void main(String[] args) {
        ApplicationDto applicationDto1=new ApplicationDto("instagram",5,56,"social media");
        ApplicationDto applicationDto2=new ApplicationDto("instagram",4,56,"social media");
        System.out.println("Application1 is equals to Application 2:"+applicationDto1.equals(applicationDto2));
        System.out.println("Application1 hashcode:"+applicationDto1.hashCode());
        System.out.println("Application2 hashcode:"+applicationDto2.hashCode());
    }
}
