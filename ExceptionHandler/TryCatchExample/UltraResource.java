package com.xworkz.ExceptionHandler.TryCatchExample;

public class UltraResource implements AutoCloseable {

    public void connect(){
        System.out.println("connect");
    }
    public  void use(){
        System.out.println("use");
    }

    @Override
    public void close() {
        System.out.println("close");

    }
}
