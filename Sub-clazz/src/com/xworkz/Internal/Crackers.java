package com.xworkz.Internal;

public class Crackers {
    String name;
    int cost;


     public Crackers(String name,int cost){
         this.name=name;
         this.cost=cost;
     }


    @Override
    public boolean equals(Object obj) {
        System.out.println("obj is running in crackers");
        if(obj ==null)return false;

        if(obj instanceof Crackers){
            Crackers crackers=(Crackers) obj;
            return this.name.equals(crackers.name)&&
                    this.cost==crackers.cost;
        }
        return false;
    }
}
