package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class TrainDto {
    private  String name;
    private String  start;
    private String  destination;
    private  int noOfHoursTravelling;


    public  void TrainDto(){

    }

    public TrainDto(String name, String start, String destination, int noOfHoursTravelling) {
        this.name = name;
        this.start = start;
        this.destination = destination;
        this.noOfHoursTravelling = noOfHoursTravelling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNoOfHoursTravelling() {
        return noOfHoursTravelling;
    }

    public void setNoOfHoursTravelling(int noOfHoursTravelling) {
        this.noOfHoursTravelling = noOfHoursTravelling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrainDto)) return false;
        TrainDto trainDto = (TrainDto) o;
        return getNoOfHoursTravelling() == trainDto.getNoOfHoursTravelling() && Objects.equals(getName(), trainDto.getName()) && Objects.equals(getStart(), trainDto.getStart()) && Objects.equals(getDestination(), trainDto.getDestination());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStart(), getDestination(), getNoOfHoursTravelling());
    }
}
