package com.xworkz.playStore.Employee;

public class EmployeeDto {
    String name;
    String companyName;
    int salary;
    int id;
    int noOfExperience;

    public EmployeeDto(String name, String companyName, int salary, int id, int noOfExperience) {
        this.name = name;
        this.companyName = companyName;
        this.salary = salary;
        this.id = id;
        this.noOfExperience = noOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoOfExperience() {
        return noOfExperience;
    }

    public void setNoOfExperience(int noOfExperience) {
        this.noOfExperience = noOfExperience;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", noOfExperience=" + noOfExperience +
                '}';
    }
    public  void checkSalary(){
        if(this.salary>40000){
            System.out.println("salary is greater than 40 thousand....");
        }
        else {
            System.out.println("salary is less than 40 thousand ..");
        }
    }
}
