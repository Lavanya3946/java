package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.CustomerDto;

public class CustomerDtoRunner {
    public static void main(String[] args) {
        CustomerDto customerDto1=new CustomerDto("monika","rice",720431523l,1);
        CustomerDto customerDto2=new CustomerDto("monika","rice",720431523l,1);

        System.out.println("Customer 1 is equals to customer 2: "+customerDto1.equals(customerDto2));
        System.out.println("Customer1 hashcode:"+customerDto1.hashCode());
        System.out.println("Customer2 hashcode:"+customerDto2.hashCode());
    }
}
