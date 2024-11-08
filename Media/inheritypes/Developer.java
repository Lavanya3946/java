package com.xworkz.Media.inheritypes;

public class Developer extends Employee{
    public String programmingLanguage="java";

    public Developer(String name, int age, double salary,int teamSize, String programmingLanguage) {
        super(name, age, salary,teamSize);
        this.programmingLanguage=programmingLanguage;
    }

}
