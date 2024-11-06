package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.things.*;

public class Example4Runner {
    public static void main(String[] args) {
        SpecialCement sc=new SpecialCement();
        sc.applications();
        sc.Characteristics();
        sc.types();
        sc.Characteristics();
        sc.usage();
        System.out.println("____________");

        NormalCement nc=new NormalCement();
        nc.Characteristics();
        nc.properties();
        nc.types();
        nc.usage();
        System.out.println("______________");

        Cement cement=new Cement();
        cement.types();
        cement.properties();
        cement.usage();
        System.out.println("___________");

        Building build=new Building();
        build.usage();
        build.properties();
        System.out.println("________");

        Material material=new Material();
        material.properties();
        System.out.println("________________");

        NormalCement nc1=new SpecialCement();
        nc1.usage();;
        nc1.types();
        nc1.properties();
        nc1.Characteristics();
        System.out.println("__________");



        
    }
}
