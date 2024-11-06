package com.xworkz.Runner;

import com.xworkz.Internal.Candle;

public class CandleRunner {
    public static void main(String[] args) {
        Candle candle1=new Candle("white",90,false);
        Candle candle2=new Candle("white",90,false);
        System.out.println("candle1 is equals to candle2:"+candle1.equals(candle2));
    }
}
