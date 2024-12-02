package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.FestivalDto;

public class FestivalDtoRunner {
    public static void main(String[] args) {
        FestivalDto festivalDto1=new FestivalDto("dasara","october","chamundeshwari","obbat");
        FestivalDto festivalDto2=new FestivalDto("Dasara","october","chamundeshwari","obbat");

        System.out.println("Festival1 DTO is equals to Festival 2:"+festivalDto1.equals(festivalDto2));
        System.out.println("Festival 1 hash code:"+festivalDto1.hashCode());
        System.out.println("Festival 2 hash code:"+festivalDto2.hashCode());
    }
}
