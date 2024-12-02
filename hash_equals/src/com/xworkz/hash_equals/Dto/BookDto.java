package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class BookDto {
    private  String name;
    private  int price;
    private  String author;
    private  String  publisher;

    public  void  BookDto(){

    }


    public BookDto(String name, int price, String author, String publisher) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDto)) return false;
        BookDto bookDto = (BookDto) o;
        return getPrice() == bookDto.getPrice() && Objects.equals(getName(), bookDto.getName()) && Objects.equals(getAuthor(), bookDto.getAuthor()) && Objects.equals(getPublisher(), bookDto.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getAuthor(), getPublisher());
    }
}
