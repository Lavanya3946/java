package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.things.Animal;
import com.xworkz.Inheritnace.things.Dog;
import com.xworkz.Inheritnace.things.Mammal;

public class Example3Runner {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        System.out.println("______");
        Mammal mammal=new Mammal();
        mammal.walk();
        System.out.println("___________");
        Mammal mammal1= new Dog();
        mammal.eat();
        mammal.walk();
        System.out.println("______________");
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
        dog.walk();


    }
}
