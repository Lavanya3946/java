package com.xworkz.Runner;

import com.xworkz.Internal.Mic;

public class MicRunner {
    public static void main(String[] args) {
        Mic mic1=new Mic("brandA",1.5,45);
        Mic mic2=new Mic("brandA",1.5,45);
        Mic mic3=new Mic("brandB",1.5,45);
        System.out.println("Mic 1 is equals to mic 2:"+mic1.equals(mic2));
        System.out.println("Mic 1 is equals to mic 2:"+mic2.equals(mic3));
    }
}
