package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.TrainDto;

public class TrainDtoRunner {
    public static void main(String[] args) {
        TrainDto trainDto1=new TrainDto("shatapdhi","bangalore","arsikere",4);
        TrainDto trainDto2=new TrainDto("shatapdhi","bangalore","arsikere",4);
        System.out.println("Train 1 dto is equals to Train2 :"+trainDto1.equals(trainDto2));
        System.out.println("Train 1 hash code:"+trainDto1.hashCode());
        System.out.println("Train 2 hash code:"+trainDto2.hashCode());



    }
}
