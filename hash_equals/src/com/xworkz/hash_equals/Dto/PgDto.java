package com.xworkz.hash_equals.Dto;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Objects;

public class PgDto {
    private  String  name;
    private  int fee;
    private  int noOfMonths;
    private String typeofFood;

    public  void PgDto(){

    }

    public PgDto(String name, int fee, int noOfMonths, String typeofFood) {
        this.name = name;
        this.fee = fee;
        this.noOfMonths = noOfMonths;
        this.typeofFood = typeofFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public String getTypeofFood() {
        return typeofFood;
    }

    public void setTypeofFood(String typeofFood) {
        this.typeofFood = typeofFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PgDto)) return false;
        PgDto pgDto = (PgDto) o;
        return getFee() == pgDto.getFee() && getNoOfMonths() == pgDto.getNoOfMonths() && Objects.equals(getName(), pgDto.getName()) && Objects.equals(getTypeofFood(), pgDto.getTypeofFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFee(), getNoOfMonths(), getTypeofFood());
    }
}
