package com.xworkz.Runner;

import com.xworkz.Internal.Crackers;

public class CrackersRunner {
    public static void main(String[] args) {
        Crackers crack1=new Crackers("flower pot",100);
        Crackers crack2=new Crackers("flower pott",100);
        System.out.println("cracker1 is equal to crackers 2:"+crack1.equals(crack2));

    }
}
