package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class TvDto {
    private  String name;
    private float inch;
    private int price;
    private String type;


    public  void TvDto(){

    }

    public TvDto(String name, float inch, int price, String type) {
        this.name = name;
        this.inch = inch;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getInch() {
        return inch;
    }

    public void setInch(float inch) {
        this.inch = inch;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TvDto)) return false;
        TvDto tvDto = (TvDto) o;
        return Float.compare(getInch(), tvDto.getInch()) == 0 && getPrice() == tvDto.getPrice() && Objects.equals(getName(), tvDto.getName()) && Objects.equals(getType(), tvDto.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getInch(), getPrice(), getType());
    }
}
