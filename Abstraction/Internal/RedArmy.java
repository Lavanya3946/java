package com.xorkz.Abstraction.Internal;

public  abstract class RedArmy extends Army{

    public RedArmy(int size) {
        super(size);
    }

    @Override
    public void useDrone() {
        System.out.println("useDrone is running in RedArmy..");
    }
    public  abstract void useBrahmos();

    @Override
    public String toString() {
        return "Red Army size:"+size;
    }
}
