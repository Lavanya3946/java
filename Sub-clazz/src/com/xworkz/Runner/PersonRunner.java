package com.xworkz.Runner;

import com.xworkz.Internal.Person1;

public class PersonRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person1 person=new Person1();
        System.out.println("representation:" +person.toString());
       person.eat();
    }
}
