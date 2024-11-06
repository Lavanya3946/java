package com.xworkz.Inheritnace.things;
public class Lavanya {
    public void playCricket(Cricket cricket){
        System.out.println("lavanya is playing cricket");
        cricket.agreement();
        cricket.schedule();
        if (cricket instanceof IplCricket){
            System.out.println("ref is IplCricket");
            IplCricket castedIplCricket=(IplCricket) cricket;
            castedIplCricket.prizeMoney();

        }
    }
}
