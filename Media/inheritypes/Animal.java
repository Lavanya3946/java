package com.xworkz.Media.inheritypes;


public class Animal {
    void eat(){
        System.out.println("eating..");
    }
     public static class Dog extends Animal{
        void bark(){
            System.out.println("barking..");
        }
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
    }
}