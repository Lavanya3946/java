package com.xworkz.Inheritnace.things;

public class Employee extends Person{
    int id;

    public Employee(String name, int age ,int id) {
        super(name, age);
        this.id=id;

    }


    public void printEmployee(){
        System.out.println("Employee ID:"+this.id);
    }
}
