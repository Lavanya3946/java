package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.things.Cricket;
import com.xworkz.Inheritnace.things.IplCricket;
import com.xworkz.Inheritnace.things.Lavanya;

public class CricketRunner {
    public static void main(String[] args) {
        Cricket cricket=new IplCricket();
        cricket.agreement();
        cricket.schedule();
        System.out.println("___________");

        Lavanya lavanya=new Lavanya();
        lavanya.playCricket(cricket);
    }
}
