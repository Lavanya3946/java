package com.xworkz.Inheritnace.things;

public class MantriMall extends Mall {
    @Override
    public void open() {
        System.out.println("mantri mall is opened");
    }

    @Override
    public void close() {
        System.out.println("mantri mall is closed");
    }

    @Override
    public void elevator() {
        System.out.println("mantri mall elevator is working");
    }

    @Override
    public void security() {
        System.out.println("mantri mall security is active");
    }
    public void cinema(){
        System.out.println("Mantri mall is running cinema");
    }
}
