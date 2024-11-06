package com.xworkz.Internal;

public class Mic {
    String brand;
    double wireLength;
    int cost;

    public Mic(String brand, double wireLength, int cost) {
        this.brand = brand;
        this.wireLength = wireLength;
        this.cost = cost;
    }


    @Override
    public boolean equals(Object obj) {
        System.out.println("mic is running in  Mic");
        if (obj == null) return false;
        if (obj instanceof Mic) {
            Mic mic = (Mic) obj;

            return this.brand.equals(mic.brand) &&
                    (this.wireLength == mic.wireLength) &&
                    (this.cost == mic.cost);
        }
        return false;
    }
}
