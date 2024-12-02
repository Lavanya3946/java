package com.xworkz.hash_equals.Dto;

import java.time.LocalDate;
import java.util.Objects;

public class TripDto {
    private  String place;
    private int noOfPeoples;
    private String  vehicle;
    private LocalDate date ;


    public  void TripDto(){

    }

    public TripDto(String place, int noOfPeoples, String vehicle, LocalDate date) {
        this.place = place;
        this.noOfPeoples = noOfPeoples;
        this.vehicle = vehicle;
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getNoOfPeoples() {
        return noOfPeoples;
    }

    public void setNoOfPeoples(int noOfPeoples) {
        this.noOfPeoples = noOfPeoples;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TripDto)) return false;
        TripDto tripDto = (TripDto) o;
        return getNoOfPeoples() == tripDto.getNoOfPeoples() && Objects.equals(getPlace(), tripDto.getPlace()) && Objects.equals(getVehicle(), tripDto.getVehicle()) && Objects.equals(getDate(), tripDto.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlace(), getNoOfPeoples(), getVehicle(), getDate());
    }
}
