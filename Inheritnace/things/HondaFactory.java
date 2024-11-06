package com.xworkz.Inheritnace.things;

public class HondaFactory extends Factory{
    @Override
    public void manufacturer() {
        System.out.println("Honda Factory is manufacturing");
    }

    @Override
    public void dispose() {
        System.out.println("Honda Factory is disposing waste");
    }

    @Override
    public void power() {
        System.out.println("Honda Factory is having power");
    }

    @Override
    public void run() {
        System.out.println("Honda Factory is running");
    }

    @Override
    public void start() {
        System.out.println("Honda Factory is staring");
    }
    public void hondaSpecialFeature(){
        System.out.println("Honda Factory has its own Feature");
    }
}
