package com.xworkz.hash_equals.runner;


import com.xworkz.hash_equals.Dto.TripDto;

import java.time.LocalDate;

public class TripDtoRunner {
    public static void main(String[] args) {
        TripDto tripDto1=new TripDto("mysore",6,"car", LocalDate.of(2026,12,31));
        TripDto tripDto2=new TripDto("mysore",6,"car", LocalDate.of(2026,12,31));
        System.out.println("TripDto 1 is equals to Trip 2:"+tripDto1.equals(tripDto2));
        System.out.println("Trip 1 hash code:"+tripDto1.hashCode());
        System.out.println("Trip 2 hash code:"+tripDto2.hashCode());



    }
}
