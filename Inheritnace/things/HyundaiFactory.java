package com.xworkz.Inheritnace.things;

public class HyundaiFactory extends Factory{
    @Override
    public void manufacturer() {
        System.out.println("Hyundai factory is manufacturing");
    }

    @Override
    public void dispose() {
        System.out.println("Hyundai Factory is disposing");
    }

    @Override
    public void power() {
        System.out.println("Hyundai Factory has power");
    }

    @Override
    public void run() {
        System.out.println("Hyundai Factory is running");
    }

    @Override
    public void start() {
        System.out.println("hyundai Factory is starting");
    }
    public void hyundaiSpecialFeature(){
        System.out.println("Hyundai Factory is having own special features");
    }
}
