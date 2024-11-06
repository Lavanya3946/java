package com.xworkz.Inheritnace.things;

import javax.imageio.stream.FileCacheImageInputStream;

public class TataFactory extends Factory  {
    @Override
    public void manufacturer() {
        System.out.println("Tata Factory is manufacturing");
    }

    @Override
    public void dispose() {
        System.out.println("TataFactory is disposing waste");
    }

    @Override
    public void power() {
        System.out.println("TataFactory is having power");
    }

    @Override
    public void run() {
        System.out.println("TataFactory is running");
    }

    @Override
    public void start() {
        System.out.println("TataFactory is starting");
    }
    public void tataSpecialFeature(){
        System.out.println("TataFactory is its having  its own features");
    }
}
