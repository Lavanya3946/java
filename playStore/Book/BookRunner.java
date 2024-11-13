package com.xworkz.playStore.Book;

public class BookRunner {
    public static void main(String[] args) {
        BookDto bookDto = new BookDto();
        bookDto.setBookId(1);
        bookDto.setName("Java");
        bookDto.setAuthor("james gosling");
        bookDto.setPrice(400);
        bookDto.setPublisher("oracle");
        bookDto.setYear(1995);

        BookSaveDetails bookSaveDetails=new BookSaveDetails();
        String msg=bookSaveDetails.bookDetailsSave(bookDto);
        System.out.println(msg);

        BookDto bookDto1 = new BookDto();
        bookDto1.setBookId(2);
        bookDto1.setName(" advanced Java");
        bookDto1.setAuthor("james gosling");
        bookDto1.setPrice(1000);
        bookDto1.setPublisher("oracle");
        bookDto1.setYear(2001);


        String msg1=bookSaveDetails.bookDetailsSave(bookDto1);
        System.out.println(msg1);

        BookDto bookDto2 = new BookDto();
        bookDto2.setBookId(3);
        bookDto2.setName(" C++");
        bookDto2.setAuthor("Dennis Ritchie");
        bookDto2.setPrice(500);
        bookDto2.setPublisher("C publisher");
        bookDto2.setYear(1970);


        String msg2=bookSaveDetails.bookDetailsSave(bookDto2);
        System.out.println(msg2);

        BookDto bookDto3 = new BookDto();
        bookDto3.setBookId(4);
        bookDto3.setName("Python");
        bookDto3.setAuthor("guido Van Rossum");
        bookDto3.setPrice(300);
        bookDto3.setPublisher("python publisher");
        bookDto3.setYear(1989);


        String msg3=bookSaveDetails.bookDetailsSave(bookDto3);
        System.out.println(msg3);

        BookDto bookDto4 = new BookDto();
        bookDto4.setBookId(5);
        bookDto4.setName(" Spring");
        bookDto4.setAuthor("Rod johnson ");
        bookDto4.setPrice(600);
        bookDto4.setPublisher("spring publisher");
        bookDto4.setYear(2002);


        String msg4=bookSaveDetails.bookDetailsSave(bookDto4);
        System.out.println(msg4);


        bookSaveDetails.read();
        System.out.println("_____________");
        bookSaveDetails.findBookById(1);
        bookSaveDetails.findBookByyear(2001);
        bookSaveDetails.findBookByName("Python");
        bookSaveDetails.findBookByPrice(500);
       bookSaveDetails.findBookByAuthor("guido Van Rossum");
        bookSaveDetails.findBookByPublisher("oracle");


    }
}
