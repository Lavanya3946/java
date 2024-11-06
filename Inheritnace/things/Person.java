package com.xworkz.Inheritnace.things;

public class Person {
    String name;
    int age;
      public Person(String name, int age){
          this.name=name;
          this.age=age;
      }
      public void printPerson(){
          System.out.println("Name:"+this.name+  "age:"+this.age);

    }
}
