package com.xorkz.Abstraction.Internal;

public   class RedArmy extends Army{

    public RedArmy(int size) {
        super(size);
    }

    @Override
    public void useDrone() {
        System.out.println("useDrone is running in RedArmy..");
    }

    public void useArmyArea() {
        System.out.println("useArmyArea is running in redArmy..");
    }

    @Override
    public void protectedBorder() {
        System.out.println("protected border is running in RedArmy..");
    }

    @Override
    public String toString() {

        return "Red Army size:"+size;
    }
}
