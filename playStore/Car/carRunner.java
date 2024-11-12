package com.xworkz.playStore.Car;

import java.util.Arrays;

public class carRunner {
    public static void main(String[] args) {

        CarDto [] carDto=new CarDto[5];
        carDto[0]=new CarDto("Toyoto","camry",2020,"blue",2500,"hybrid",1500);
        carDto[1]=new CarDto("Honda","civic",2018,"red",25000,"gasoline",15000);
        carDto[2]=new CarDto("Toyota","camry",2013,"red",25000,"gasoline",15000);
        carDto[3]=new CarDto("Honda","civic",2011,"black",25000,"gasoline",15000);
        carDto[4]=new CarDto("Honda","civic",2012,"blue",25000,"gasoline",15000);


        for (CarDto carDto1:carDto){
            System.out.println(carDto1);

                carDto1.checkPrice();
            }
    }
    }

