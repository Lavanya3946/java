package com.xorkz.Abstraction.Internal;

public abstract class Army {
    int size;

     public  Army(int size){
         this.size=size;
     }
     public void protectedBorder(){
         System.out.println("protectBorder is running in Army");
     }
     public  abstract void useDrone();

    @Override
    public String toString() {
        return " Army size:"+size;
    }
}
