package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.things.LuluMall;
import com.xworkz.Inheritnace.things.Mall;
import com.xworkz.Inheritnace.things.MantriMall;
import com.xworkz.Inheritnace.things.OrionMall;

public class MallRunner {
    public static void main(String[] args) {
        Mall orionmall=new OrionMall();
        Mall lulumall=new LuluMall();
        Mall mantrimall=new MantriMall();

       OrionMall orionmall1=new OrionMall();
       LuluMall luluMall1=new LuluMall();
       MantriMall mantriMall1=new MantriMall();


       orionmall.open();
       orionmall.close();
       orionmall.elevator();
       orionmall.security();
       orionmall1.foodCourt();
        System.out.println("____________________");

       lulumall.open();
       lulumall.close();
       lulumall.elevator();
       lulumall.security();
       luluMall1.games();
        System.out.println("______________________");


       mantrimall.open();
       mantrimall.elevator();
       mantrimall.security();
       mantrimall.close();
       mantriMall1.cinema();
        System.out.println("_____________________________");

    }
}
