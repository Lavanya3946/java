package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.SchoolDto;

public class SchoolDtoRunner {
    public static void main(String[] args) {

        SchoolDto schoolDto1=new SchoolDto("oxford","yelahanka",680,"manjula");
        SchoolDto schoolDto2=new SchoolDto("oxford","yelahanka",680,"manjula");
        System.out.println("Student 1 is equals to student 2:"+schoolDto1.equals(schoolDto2));
        System.out.println("student 1 hash code:"+schoolDto1.hashCode());
        System.out.println("student 2 hash code:"+schoolDto2.hashCode());

    }
}
