package com.xworkz.playStore.Car;

import java.security.PrivateKey;

public class CarDto {
    private  String make;
    private String model;
    private  int year;
    private  String color;
    private  double price;
    private  String engineType;
    private  int mileage;

    public  CarDto(String  make,String model,int year,String color,double price,String engineType,int mileage){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.engineType=engineType;
        this.mileage=mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                ", mileage=" + mileage +
                '}';
    }
    public  void checkPrice(){
        if(this.price>20000){
            System.out.println("price is costly..");
        }
        else {
            System.out.println("price is cheaper..");
        }
    }
}
