package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class ClothDto {
    private  String type;
    private  String  color;
    private  int price;
    private  String quality;

    public  void ClothDto(){

    }

    public ClothDto(String type, String color, int price, String quality) {
        this.type = type;
        this.color = color;
        this.price = price;
        this.quality = quality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClothDto)) return false;
        ClothDto clothDto = (ClothDto) o;
        return getPrice() == clothDto.getPrice() && Objects.equals(getType(), clothDto.getType()) && Objects.equals(getColor(), clothDto.getColor()) && Objects.equals(getQuality(), clothDto.getQuality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getColor(), getPrice(), getQuality());
    }
}
