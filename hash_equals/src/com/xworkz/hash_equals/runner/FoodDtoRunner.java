package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.FoodDto;

public class FoodDtoRunner {

    public static void main(String[] args) {
        FoodDto foodDto1=new FoodDto("masala dose",40,"veg",2);
        FoodDto foodDto2=new FoodDto("masala dose",40,"veg",29);
        System.out.println("food1 is equals to food 2:"+foodDto1.equals(foodDto2));
        System.out.println("food1 hashcode:"+foodDto1.hashCode());
        System.out.println("food2 hashcode:"+foodDto2.hashCode());



    }
}
