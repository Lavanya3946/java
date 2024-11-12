package com.xworkz.playStore.Book;

public class BookDto {
    String name;
    String author;
    int price;
    int year;
    String publisher;

    public BookDto(String name, String author, int price, int year, String publisher) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                '}';
    }
    public  void checkPrice(){
        if(this.price>2000){
            System.out.println("price is costly..");
        }
        else {
            System.out.println("price is cheaper..");
        }
    }
}
