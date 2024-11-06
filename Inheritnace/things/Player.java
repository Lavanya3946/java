package com.xworkz.Inheritnace.things;

public class Player extends GovtEmployee{
    String sport;
    public Player(String name, int age, int id, String department,String sport) {
        super(name, age, id, department);
        this.sport=sport;
    }
    public void printPlayer(){
        System.out.println("Sports of player:"+this.sport);
    }
}
