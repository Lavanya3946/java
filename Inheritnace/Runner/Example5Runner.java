package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.things.*;

public class Example5Runner {
    public static void main(String[] args) {
        House house = new House();
        house.type();
        System.out.println("__________");

        Apartment apartment = new Apartment();
        apartment.height();
        apartment.type();
        System.out.println("_________");

        Bungalow bungalow = new Bungalow();
        bungalow.bungalow();
        bungalow.type();
        bungalow.height();
        System.out.println("____________");

        Villa villa = new Villa();
        villa.villa();
        villa.bungalow();
        villa.type();
        villa.height();
        System.out.println("_________________");

        Cottage cottage = new Cottage();
        cottage.cottage();
        cottage.bungalow();
        cottage.villa();
        cottage.type();
        cottage.height();
        System.out.println("____________");

        Duplex duplex = new Duplex();
        duplex.duplex();
        duplex.bungalow();
        duplex.cottage();
        duplex.type();
        duplex.villa();
        duplex.height();
        System.out.println("_____________");

        TownHouse th = new TownHouse();
        th.townhouse();
        th.bungalow();
        th.cottage();
        th.duplex();
        th.type();
        th.height();
        th.villa();
        System.out.println("_______________");

        Mansion mansion = new Mansion();
        mansion.mansion();
        ;
        mansion.bungalow();
        mansion.cottage();
        mansion.duplex();
        mansion.townhouse();
        mansion.type();
        mansion.height();
        mansion.villa();
    }
}



