package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class IplTeamDto {
    private  String  name;
    private  int noOfPlayers;
    private   String ownerName;
    private  int budget;


    public  void IplTeamDto(){

    }

    public IplTeamDto(String name, int noOfPlayers, String ownerName, int budget) {
        this.name = name;
        this.noOfPlayers = noOfPlayers;
        this.ownerName = ownerName;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IplTeamDto)) return false;
        IplTeamDto that = (IplTeamDto) o;
        return getNoOfPlayers() == that.getNoOfPlayers() && getBudget() == that.getBudget() && Objects.equals(getName(), that.getName()) && Objects.equals(getOwnerName(), that.getOwnerName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNoOfPlayers(), getOwnerName(), getBudget());
    }
}
