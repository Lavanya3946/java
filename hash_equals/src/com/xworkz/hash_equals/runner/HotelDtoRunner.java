package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.HotelDto;

public class HotelDtoRunner {
    public static void main(String[] args) {
        HotelDto hotelDto1=new HotelDto("udupi hotel","rajajinagar","rotti",30);
        HotelDto hotelDto2=new HotelDto("udupi hotel","rajajinagar","rotti",30);
        System.out.println("hotel 1 dto is equals to hotel 2 :"+hotelDto1.equals(hotelDto2));
        System.out.println("Hotel 1 dto hash code:"+hotelDto1.hashCode());
        System.out.println("Hotel 2 dto hash code:"+hotelDto2.hashCode());


    }
}

