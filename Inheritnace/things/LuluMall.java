package com.xworkz.Inheritnace.things;

public class LuluMall extends Mall{

    @Override
    public void open() {
        System.out.println("Lulu mall is opened");
    }

    @Override
    public void close() {
        System.out.println("Lulu Mall is closed");
    }

    @Override
    public void elevator() {
        System.out.println("Lulu mall has elevator");
    }

    @Override
    public void security() {
        System.out.println("Lulu mall security is active");
    }
    public void games(){
        System.out.println("There are many sports to play in Lulu Mall");
    }
}
