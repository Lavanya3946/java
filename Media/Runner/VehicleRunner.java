package com.xworkz.Media.Runner;

import com.xworkz.Media.inheritypes.Car;
import com.xworkz.Media.inheritypes.ElectricCar;
import com.xworkz.Media.inheritypes.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle("BMW");
        System.out.println(vehicle);
        Car car=new Car("Kwid",4);
        System.out.println(car);
        ElectricCar electricCar=new ElectricCar("Tesla",4,40);
        System.out.println(electricCar);

    }
}
