package com.xworkz.Inheritnace.things;

public class OrionMall extends Mall{
    @Override
    public void open() {
        System.out.println("OrionMall is open");
    }

    @Override
    public void close() {
        System.out.println("OrionMall is closed");
    }

    @Override
    public void elevator() {
        System.out.println("OrionMall has elevator");
    }

    @Override
    public void security() {
        System.out.println("Orion mall security is active");
    }
    public void foodCourt(){
        System.out.println("Orion Mall has large food court");
}
}
