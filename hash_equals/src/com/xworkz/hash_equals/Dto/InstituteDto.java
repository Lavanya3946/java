package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class InstituteDto {
    private  String  name;
    private  String course;
    private  int noOfMonths;
    private String  address;


    public  void InstituteDto(){

    }

    public InstituteDto(String name, String course, int noOfMonths, String address) {
        this.name = name;
        this.course = course;
        this.noOfMonths = noOfMonths;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InstituteDto)) return false;
        InstituteDto that = (InstituteDto) o;
        return getNoOfMonths() == that.getNoOfMonths() && Objects.equals(getName(), that.getName()) && Objects.equals(getCourse(), that.getCourse()) && Objects.equals(getAddress(), that.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourse(), getNoOfMonths(), getAddress());
    }
}
