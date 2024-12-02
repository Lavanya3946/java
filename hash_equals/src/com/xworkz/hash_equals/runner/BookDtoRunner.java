package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.BagDto;
import com.xworkz.hash_equals.Dto.BookDto;

public class BookDtoRunner {
    public static void main(String[] args) {
        BookDto bookDto1=new BookDto("java",340,"james gosling","Sun Microsystem");
        BookDto bookDto2=new BookDto("java",300,"james gosling","Sun Microsystem");

        System.out.println("Book1 is equals to book2:"+bookDto1.equals(bookDto2));
        System.out.println("Book1 hashcode:"+bookDto1.hashCode());
        System.out.println("Book 2 hashcode:"+bookDto2.hashCode());
    }
}
