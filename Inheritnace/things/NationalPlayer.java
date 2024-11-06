package com.xworkz.Inheritnace.things;

public class NationalPlayer extends StatePlayer{
    String nation;

    public NationalPlayer(String name, int age, int id, String department, String sport, String state,String nation) {
        super(name, age, id, department, sport, state);
        this.nation=nation;
    }
    public void printNationalPlayer(){
        System.out.println("nation of a player:"+this.nation);
    }
}
