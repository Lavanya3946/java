package com.xworkz.Media.inheritypes;

public class Vehicle {
    String brand;
      public  Vehicle( String brand){
          this.brand=brand;

      }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
