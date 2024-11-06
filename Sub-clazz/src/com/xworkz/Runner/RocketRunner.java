package com.xworkz.Runner;

import com.xworkz.Internal.Rocket;

public class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1=new Rocket("SpaceX",90000,"Elon musk");
        Rocket rocket2=new Rocket("SpaceX",90000,"Elon musk");

        System.out.println("Rocket 1 is equals to rocket2:"+rocket1.equals(rocket2));
    }
}
