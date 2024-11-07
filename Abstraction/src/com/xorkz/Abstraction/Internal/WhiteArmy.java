package com.xorkz.Abstraction.Internal;

public class WhiteArmy extends RedArmy{
    public WhiteArmy(int size){
        super(size);

    }
    @Override
    public void useArmyArea() {
        System.out.println("useArmyArea is running in WhiteArmy..");
    }

    @Override
    public void protectedBorder() {
        System.out.println("protected border is running in WhiteArmy..");
    }

    @Override
    public void useDrone() {
        System.out.println("useDrone is running in WhiteArmy..");
    }

    @Override
    public String toString() {
        return "WhiteArmy size:"+size;
    }
}
