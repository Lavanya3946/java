package com.xworkz.Inheritnace.things;

public class CricketPlayer extends NationalPlayer{
    String battingStyle;

    public CricketPlayer(String name, int age, int id, String department, String sport, String state, String nation,String battingStyle) {
        super(name, age, id, department, sport, state, nation);
        this.battingStyle=battingStyle;
    }
    public void printCricketPlayer(){
        System.out.println("batting style of a player:"+this.battingStyle);
    }
}
