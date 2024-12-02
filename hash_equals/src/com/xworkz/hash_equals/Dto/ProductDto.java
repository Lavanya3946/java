package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class ProductDto {
    public ProductDto(String name, int price, String type, String quality) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.quality = quality;
    }

    private  String name;
    private  int price;
    private String type;
    private String quality;

    public  void ProductDto(){

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductDto)) return false;
        ProductDto that = (ProductDto) o;
        return getPrice() == that.getPrice() && Objects.equals(getName(), that.getName()) && Objects.equals(getType(), that.getType()) && Objects.equals(getQuality(), that.getQuality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getType(), getQuality());
    }
}
