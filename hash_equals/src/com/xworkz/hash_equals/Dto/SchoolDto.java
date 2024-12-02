package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class SchoolDto {
    private String  Name;
    private  String  address;
    private  int noOfStudents;
    private  String  principleName;


    public  void SchoolDto(){

    }

    public SchoolDto(String name, String address, int noOfStudents, String principleName) {
        Name = name;
        this.address = address;
        this.noOfStudents = noOfStudents;
        this.principleName = principleName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchoolDto)) return false;
        SchoolDto schoolDto = (SchoolDto) o;
        return getNoOfStudents() == schoolDto.getNoOfStudents() && Objects.equals(getName(), schoolDto.getName()) && Objects.equals(getAddress(), schoolDto.getAddress()) && Objects.equals(getPrincipleName(), schoolDto.getPrincipleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getNoOfStudents(), getPrincipleName());
    }
}
