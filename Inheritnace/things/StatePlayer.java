package com.xworkz.Inheritnace.things;

public class StatePlayer extends Player{
    String state;

    public StatePlayer(String name, int age, int id, String department, String sport,String state) {
        super(name, age, id, department, sport);
        this.state=state;
    }
    public void printStatePlayer(){
        System.out.println("state of a player:"+this.state);
    }
}
