package com.xworkz.playStore.Student;

public class StudentInfo {
    String name;
    String email;
    int age;
    int weight;
    int height;
    String address;

    public StudentInfo(String name, String email, int age, int weight, int height, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", address='" + address + '\'' +
                '}';
    }
    public  void checkAge(){
        if(this.age>20){
            System.out.println("age is greater than 20");
        }
        else {
            System.out.println("age is less than 20");
        }
    }
}



