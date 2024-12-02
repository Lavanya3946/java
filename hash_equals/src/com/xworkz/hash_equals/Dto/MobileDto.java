package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class MobileDto {
    private  String  name;
    private  int price;
    private  int ram;
    private  String color;

    public  void MobileDto(){

    }

    public MobileDto(String name, int price, int ram, String color) {
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.color = color;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobileDto)) return false;
        MobileDto mobileDto = (MobileDto) o;
        return getPrice() == mobileDto.getPrice() && getRam() == mobileDto.getRam() && Objects.equals(getName(), mobileDto.getName()) && Objects.equals(getColor(), mobileDto.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getRam(), getColor());
    }
}
