package com.xworkz.playStore.Book;

public class BookSaveDetails {
    BookDto bookDto[]=new BookDto[5];
    int index=0;


    public  String bookDetailsSave(BookDto dto){
        if(dto!=null){
            bookDto[index]=dto;
            index++;
            return "book Data is saved";
        }else {
            return "Book data is not found";
        }
    }
    public  void read(){
        for (int index = 0; index <bookDto.length ; index++) {
            System.out.println(bookDto[index]);

        }
    }

    public  void findBookByName(String name){
        for (int i = 0; i <bookDto.length ; i++) {
            if (bookDto[i].getName() == name) {
                System.out.println("Finding Book by Name:"+bookDto[i]);
            }
        }
    }
    public  void findBookByyear(int year){
        for (int i = 0; i < bookDto.length; i++) {
            if (bookDto[i].getYear() ==year) {
                System.out.println("Finding Book by Year:" + bookDto[i]);
            }
        }
        }

        public  void findBookById(int id){
            for (int i = 0; i < bookDto.length; i++) {
                if (bookDto[i].getBookId()==id){
                    System.out.println("Finding Book by Id:"+bookDto[i]);
                }
            }
        }
        public  void findBookByPrice(int price){
            for (int i = 0; i < bookDto.length; i++) {
                if (bookDto[i].getPrice()>=price){
                    System.out.println("Finding book By Price:"+bookDto[i]);
                }
            }
        }
        public void findBookByAuthor(String author){
            for (int i = 0; i <bookDto.length ; i++) {
                if (bookDto[i].getAuthor()==author){
                    System.out.println("Finding Book by Author:"+bookDto[i]);
                }
            }
        }
        public  void  findBookByPublisher(String publisher){
            for (int i = 0; i <bookDto.length ; i++) {
                if (bookDto[i].getPublisher()==publisher){
                    System.out.println("Finding book By Publisher: "+bookDto[i]);
                }

            }
        }
    }


