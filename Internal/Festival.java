package com.xworkz.Internal;

import java.util.Objects;

public class Festival {
    String name;
    String date;
    String godName;

    public Festival(String name, String date, String godName) {
        this.name = name;
        this.date = date;
        this.godName = godName;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("obj is running in festival");
        if (obj == null) {
            return false;
        }
        if (obj instanceof Festival) {
            Festival festival = (Festival) obj;
            if (this.name.equals(festival.name)) {
                if (this.date.equals(festival.date)) {
                    return this.godName.equals(festival.godName);
                }
            }
        }
            return false;
        }
    }










