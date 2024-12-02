package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class FoodDto {
    private  String name;
    private int price;
    private  String  type;
    private  int id;

    public void FoodDto(){

    }

    public FoodDto(String name, int price, String type, int id) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodDto)) return false;
        FoodDto foodDto = (FoodDto) o;
        return getPrice() == foodDto.getPrice() && getId() == foodDto.getId() && Objects.equals(getName(), foodDto.getName()) && Objects.equals(getType(), foodDto.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getType(), getId());
    }
}
