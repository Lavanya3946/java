package com.xorkz.Abstraction.Internal;

public class WhiteArmy extends RedArmy{
    public WhiteArmy(int size){
        super(size);

    }
    @Override
    public void useBrahmos() {
        System.out.println("useBrahmos is running in WhiteArmy..");
    }

    @Override
    public String toString() {
        return "WhiteArmy size:"+size;
    }
}
