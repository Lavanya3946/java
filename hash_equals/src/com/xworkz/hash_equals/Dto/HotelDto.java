package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class HotelDto {
    private String name;
    private  String  address;
    private String  foodName;
    private int price;

    public  void HotelDto(){

    }

    public HotelDto(String name, String address, String foodName, int price) {
        this.name = name;
        this.address = address;
        this.foodName = foodName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotelDto)) return false;
        HotelDto hotelDto = (HotelDto) o;
        return getPrice() == hotelDto.getPrice() && Objects.equals(getName(), hotelDto.getName()) && Objects.equals(getAddress(), hotelDto.getAddress()) && Objects.equals(getFoodName(), hotelDto.getFoodName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getFoodName(), getPrice());
    }
}
