package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.things.*;

public class FactoryRunner {
    public static void main(String[] args) {

    Factory tataFactory=new TataFactory();
    Factory hondaFactory=new HondaFactory();
    Factory hyundaiFactory=new HyundaiFactory();
    Factory tvsFactory=new TVSFactory();


    TataFactory tataFactory1=new TataFactory();
    HondaFactory hondaFactory1=new HondaFactory();
    HyundaiFactory hyundaiFactory1=new HyundaiFactory();
    TVSFactory tvsFactory1=new TVSFactory();

    tataFactory.manufacturer();
    tataFactory.dispose();
    tataFactory.power();
    tataFactory.start();
    tataFactory.run();
    tataFactory1.tataSpecialFeature();
        System.out.println("__________________");


    hondaFactory.manufacturer();
    hondaFactory.dispose();
    hondaFactory.power();
    hondaFactory.run();
    hondaFactory.start();
    hondaFactory1.hondaSpecialFeature();
        System.out.println("__________________________");

    hyundaiFactory.manufacturer();;
    hyundaiFactory.dispose();
    hyundaiFactory.power();
    hyundaiFactory.run();;
    hyundaiFactory.start();;
    hyundaiFactory1.hyundaiSpecialFeature();
        System.out.println("________________________");

    tvsFactory.manufacturer();
    tvsFactory.dispose();
    tvsFactory.power();
    tvsFactory.run();
    tvsFactory.start();;
    tvsFactory1.tvsSpecialFeature();
    }
}
