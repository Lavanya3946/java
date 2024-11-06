package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.things.Computer;
import com.xworkz.Inheritnace.things.Device;
import com.xworkz.Inheritnace.things.Machine;
import com.xworkz.Inheritnace.things.Mobile;

public class Example1Runner {
    public static void main(String[] args) {
        Machine machine1 = new Device("sony", "generic Device");
        machine1.start();
        machine1.deviceInfo();
        System.out.println("________________");

        Machine machine2 = new Computer("Dell", "xps 15", "windows 10");
        machine2.start();
        machine2.deviceInfo();
        machine2.computerInfo();
        System.out.println("___________________");

        Machine machine3 = new Mobile("samsung", "galaxy", "android", "oppo");
        machine3.start();
        machine3.deviceInfo();
        machine3.computerInfo();
        machine3.mobileInfo();
        System.out.println("__________________");

        Device device=new Device("hp","intel");
        {
            device.deviceInfo();
        }

    }

       }

