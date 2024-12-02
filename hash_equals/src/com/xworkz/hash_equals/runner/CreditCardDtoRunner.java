package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.CreditCardDto;

public class CreditCardDtoRunner {
    public static void main(String[] args) {
        CreditCardDto creditCardDto1=new CreditCardDto("visa",234538900,567);
        CreditCardDto creditCardDto2=new CreditCardDto("visa",234538900,567);
        System.out.println("creditCard 1 is equals to credit card 2:"+creditCardDto1.equals(creditCardDto2));
        System.out.println("Creditcard 1 hashcode:"+creditCardDto1.hashCode());
        System.out.println("Creditcard 2 hashcode:"+creditCardDto2.hashCode());
    }
}
