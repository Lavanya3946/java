package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class FestivalDto {
    private  String name;
    private  String  month;
    private  String  god;
    private String  splfood;

    public  void FestivalDto(){

    }

    public FestivalDto(String name, String month, String god, String splfood) {
        this.name = name;
        this.month = month;
        this.god = god;
        this.splfood = splfood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getGod() {
        return god;
    }

    public void setGod(String god) {
        this.god = god;
    }

    public String getSplfood() {
        return splfood;
    }

    public void setSplfood(String splfood) {
        this.splfood = splfood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FestivalDto)) return false;
        FestivalDto that = (FestivalDto) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getMonth(), that.getMonth()) && Objects.equals(getGod(), that.getGod()) && Objects.equals(getSplfood(), that.getSplfood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMonth(), getGod(), getSplfood());
    }
}
