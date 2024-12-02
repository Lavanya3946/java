package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class BagDto {
    private String  color;
    private  int price;
    private  String type;
    private String brand;

    public void BagDto(){

    }

    public BagDto(String color, int price, String type, String brand) {
        this.color = color;
        this.price = price;
        this.type = type;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BagDto)) return false;
        BagDto bagDto = (BagDto) o;
        return getPrice() == bagDto.getPrice() && Objects.equals(getColor(), bagDto.getColor()) && Objects.equals(getType(), bagDto.getType()) && Objects.equals(getBrand(), bagDto.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getPrice(), getType(), getBrand());
    }
}
