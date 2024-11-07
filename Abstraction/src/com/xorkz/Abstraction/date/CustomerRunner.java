package com.xorkz.Abstraction.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer=new Customer("lavanya", LocalDate.now(),LocalDate.of(2003,10,12), LocalTime.of(04 ,30,0 ));
        System.out.println(customer);
    }
}
