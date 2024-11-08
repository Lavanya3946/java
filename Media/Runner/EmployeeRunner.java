package com.xworkz.Media.Runner;

import com.xworkz.Media.inheritypes.Developer;
import com.xworkz.Media.inheritypes.Manager;

public class EmployeeRunner {
    public static void main(String[] args) {
        Manager manager = new Manager("lavanya", 21, 30000.00, 10);
        System.out.println(manager.name);
        System.out.println(manager.age);
        System.out.println(manager.salary);
        System.out.println(manager.teamSize);
        System.out.println("_______________");
        Developer developer = new Developer("monika", 20, 10000, 5, "java");
        System.out.println(developer.name);
        System.out.println(developer.age);
        System.out.println(developer.salary);
        System.out.println(developer.programmingLanguage);
    }
}
