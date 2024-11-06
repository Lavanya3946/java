package com.xworkz.Inheritnace.things;

public class Bowler extends CricketPlayer{
    String bowlingStyle;
    public Bowler(String name, int age, int id, String department, String sport, String state, String nation, String battingStyle,String bowlingStyle) {
        super(name, age, id, department, sport, state, nation, battingStyle);
        this.bowlingStyle=bowlingStyle;
    }
    public void printbowler(){
        System.out.println("bowling style of a player:"+this.bowlingStyle);
    }
}
