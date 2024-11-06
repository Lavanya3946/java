package com.xworkz.Internal;

public class Candle {
    String color;
    int cost;
    boolean perfumed;

    public Candle(String color,int cost,boolean perfumed){
        this.color=color;
        this.cost=cost;
        this.perfumed=perfumed;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("obj is running in candle");
        if(obj==null) return false;
        if(obj instanceof Candle candle){
            return this.color.equals(candle.color)&&
                    this.cost== candle.cost&&
                    this.perfumed== candle.perfumed;
        }
        return false;
    }
}
