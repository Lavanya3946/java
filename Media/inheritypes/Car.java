package com.xworkz.Media.inheritypes;

import java.awt.print.Printable;

public class Car extends Vehicle{
    int doors;

    public Car(String brand,int doors) {
        super(brand);
        this.doors=doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}';
    }
}
