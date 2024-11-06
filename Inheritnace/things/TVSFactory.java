package com.xworkz.Inheritnace.things;

public class TVSFactory extends Factory{
    @Override
    public void manufacturer() {
        System.out.println("TVS factory is having manufacturing");
    }

    @Override
    public void dispose() {
        System.out.println("TVS factory is disposing the waste");
    }

    @Override
    public void power() {
        System.out.println("TVS factory is having power");
    }

    @Override
    public void run() {
        System.out.println("Tvs factory is running");
    }

    @Override
    public void start() {
        System.out.println("TVS factory is starting");
    }
    public void tvsSpecialFeature(){
        System.out.println("TVS factory is having its own features");
    }
}
