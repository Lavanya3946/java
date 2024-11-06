package com.xworkz.Inheritnace.things;

public class IplCricket extends Cricket{
    @Override
    public void schedule() {
        System.out.println("running schedule in IplCricket");
    }
    public void prizeMoney(){
        System.out.println("running prizeMoney in IplCricket");
    }
}
