package com.xworkz.Inheritnace.things;

public class GovtEmployee extends Employee{
    String department;

    public GovtEmployee(String name, int age, int id ,String department) {
        super(name, age, id);
        this.department=department;
    }


     public void printGovtEmployee(){
         System.out.println("Department of Govt Employeee:"+this.department);
     }
}
