package com.xworkz.playStore.Employee;

public class EmployeeDto {
    String name;
    String companyName;
    int salary;
    int id;
    int noOfExperience;

    public  void employee()
    {

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
}
