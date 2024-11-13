package com.xworkz.playStore.Car;

public class carRunner {
    public static void main(String[] args) {

        CarDto carDto1=new CarDto();
        carDto1.setMake("Totota");
        carDto1.setModel("corolla");
        carDto1.setColor("Red");
        carDto1.setEngineType("petrol");
        carDto1.setMileage(17.4);
        carDto1.setPrice(150000);
        carDto1.setYear(2023);

        CarSaveDetails carSaveDetails=new CarSaveDetails();
        String msg1=carSaveDetails.carDetailsSave(carDto1);
        System.out.println(msg1);



        CarDto carDto2=new CarDto();
        carDto2.setMake("Honda");
        carDto2.setModel("civic");
        carDto2.setColor("blue");
        carDto2.setEngineType("Diesel");
        carDto2.setMileage(18.2);
        carDto2.setPrice(1800000);
        carDto2.setYear(2022);


        String msg2=carSaveDetails.carDetailsSave(carDto2);
        System.out.println(msg2);



        CarDto carDto3=new CarDto();
        carDto3.setMake("Hyundai");
        carDto3.setModel("Elontra");
        carDto3.setColor("White");
        carDto3.setEngineType("Electric");
        carDto3.setMileage(0.0);
        carDto3.setPrice(25000);
        carDto3.setYear(2024);


        String msg3=carSaveDetails.carDetailsSave(carDto3);
        System.out.println(msg3);

        CarDto carDto4=new CarDto();
        carDto4.setMake("ford");
        carDto4.setModel("Mustang");
        carDto4.setColor("Black");
        carDto4.setEngineType("petrol");
        carDto4.setMileage(10.0);
        carDto4.setPrice(550000);
        carDto4.setYear(2021);


        String msg4=carSaveDetails.carDetailsSave(carDto4);
        System.out.println(msg4);

        CarDto carDto5=new CarDto();
        carDto5.setMake("Tesla");
        carDto5.setModel("Model3");
        carDto5.setColor("silver");
        carDto5.setEngineType("Electric");
        carDto5.setMileage(9.0);
        carDto5.setPrice(400000);
        carDto5.setYear(2023);


        String msg5=carSaveDetails.carDetailsSave(carDto5);
        System.out.println(msg5);

        carSaveDetails.read();
        System.out.println("___________");
        carSaveDetails.findCarByYear(2021);
        carSaveDetails.findCarByColor("silver");
        carSaveDetails.findCarByModel("Mustang");
        carSaveDetails.findCarByPrice(25000);
        carSaveDetails.findCarByEngineType("Electric");
    }
    }

