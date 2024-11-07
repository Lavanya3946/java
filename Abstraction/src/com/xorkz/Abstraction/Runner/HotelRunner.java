package com.xorkz.Abstraction.Runner;

import com.xorkz.Abstraction.Internal.AshokaHotel;
import com.xorkz.Abstraction.Internal.Hotel;
import com.xorkz.Abstraction.Internal.LeelaHotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new AshokaHotel();
        hotel.service();
        hotel.advanceBooking();
        hotel.portableRoom();
        System.out.println(hotel.toString());
        System.out.println("_______________");
        LeelaHotel leelaHotel=new LeelaHotel();
        leelaHotel.service();
        leelaHotel.advanceBooking();
        leelaHotel.portableRoom();
        System.out.println(leelaHotel.toString());

    }
}
