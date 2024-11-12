package com.xworkz.playStore.Book;

public class BookRunner {
    public static void main(String[] args) {
        BookDto[] bookDto=new  BookDto[5];
        bookDto[0]=new BookDto("java basics","john doe",240,2001,"tech press");
        bookDto[1]=new BookDto("advanced java","john doe",2900,2003,"tech press");
        bookDto[2]=new BookDto("Magalu","kuvempu",240,2001,"tech press");
        bookDto[3]=new BookDto("ramayana","kuvempu",240,2001,"tech press");
        bookDto[4]=new BookDto("romeo juliet","shakespear",2400,2001,"himalyan");

        System.out.println("Books:");
        for (BookDto bookDto1:bookDto){
            System.out.println(bookDto1);
            bookDto1.checkPrice();
        }


    }
}
