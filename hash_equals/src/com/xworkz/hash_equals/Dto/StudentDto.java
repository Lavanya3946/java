package com.xworkz.hash_equals.Dto;

import java.time.LocalDate;
import java.util.Objects;

public class StudentDto {
    private  String name;
    private  long phoneno;
    private String address;
    private LocalDate Dob;

    public  void StudentDto(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public void setDob(LocalDate dob) {
        Dob = dob;
    }

    public StudentDto(String name, long phoneno, String address, LocalDate dob) {
        this.name = name;
        this.phoneno = phoneno;
        this.address = address;
        Dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDto)) return false;
        StudentDto that = (StudentDto) o;
        return getPhoneno() == that.getPhoneno() && Objects.equals(getName(), that.getName()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getDob(), that.getDob());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhoneno(), getAddress(), getDob());
    }
}
