package com.xworkz.Media.inheritypes;

public class DeviceRunner {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone("vivo","x123");
        smartPhone.deviceInfo();;
        smartPhone.recharge();
        smartPhone.useGadget();
        smartPhone.makeCall();
    }
}
