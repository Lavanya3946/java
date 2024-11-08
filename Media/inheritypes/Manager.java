package com.xworkz.Media.inheritypes;

public class Manager extends Employee{
    public int teamSize=0;

    public Manager(String name, int age, double salary, int teamSize) {
        super(name, age, salary, teamSize);
        this.teamSize=teamSize;
    }
}
