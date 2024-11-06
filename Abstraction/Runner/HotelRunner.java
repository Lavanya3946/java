package com.xorkz.Abstraction.Runner;

import com.xorkz.Abstraction.Internal.AshokaHotel;
import com.xorkz.Abstraction.Internal.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new AshokaHotel();
        hotel.service();
        hotel.advanceBooking();
        hotel.portableRoom();
        System.out.println(hotel.toString());

    }
}
