package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class LaptopDto {
    private  String  name;
    private  int price;
    private String  windows;
    private  String  series;

    public  void LaptopDto(){

    }

    public LaptopDto(String name, int price, String windows, String series) {
        this.name = name;
        this.price = price;
        this.windows = windows;
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LaptopDto)) return false;
        LaptopDto laptopDto = (LaptopDto) o;
        return price == laptopDto.price && Objects.equals(name, laptopDto.name) && Objects.equals(windows, laptopDto.windows) && Objects.equals(series, laptopDto.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, windows, series);
    }
}
