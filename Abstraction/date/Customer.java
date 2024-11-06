package com.xorkz.Abstraction.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class Customer {
     private String name;
     private LocalDate registrationDate;
     private LocalDate dob;
     private  LocalTime timeOfBirth;

     public Customer(String name,LocalDate registrationDate,LocalDate dob,LocalTime timeOfBirth){
         this.name=name;
         this.registrationDate=registrationDate;
         this.dob=dob;
         this.timeOfBirth=timeOfBirth;
     }

    public String getName() {
        return name;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalTime getTimeOfBirth() {
        return timeOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", registrationDate=" + registrationDate +
                ", dob=" + dob +
                ", timeOfBirth=" + timeOfBirth +
                '}';
    }
}
