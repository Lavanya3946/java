package com.xworkz.playStore.Application;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationDto[] applicationDto=new ApplicationDto[5];
        applicationDto[0]=new ApplicationDto(1,"Instagram","357.0.0.51.100","67MB",4,100,"entertainment");
        applicationDto[1]=new ApplicationDto(3,"Snapchat","13.15.0.40","3.6MB",5,600,"pictures");
        applicationDto[2]=new ApplicationDto(39,"Whatsapp","2.24.33.78","3.3Gb",3,200,"chatting");
        applicationDto[3]=new ApplicationDto(4,"Linkedin","4.1.1003","3.2MB",5,100,"job searching");
        applicationDto[4]=new ApplicationDto(12,"Zomato","18.6.2","3.4MB",3,60,"food ordering");

        System.out.println("applications:");
        for (ApplicationDto applicationDto1:applicationDto){
            System.out.println(applicationDto1);
            applicationDto1.checkRating();
        }
    }
}
