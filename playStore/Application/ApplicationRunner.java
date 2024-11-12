package com.xworkz.playStore.Application;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationDto[] applicationDto=new ApplicationDto[5];
        applicationDto[0]=new ApplicationDto(1,"instagram","3.1","3.4Gb",4,60,"entertainment");
        applicationDto[1]=new ApplicationDto(3,"snapchat","3.1","3.4Gb",4,60,"entertainment");
        applicationDto[2]=new ApplicationDto(39,"whatsapp","3.1","3.4Gb",3,60,"entertainment");
        applicationDto[3]=new ApplicationDto(4,"linkedin","3.1","3.4Gb",4,60,"entertainment");
        applicationDto[4]=new ApplicationDto(12,"zomoto","3.1","3.4Gb",4,60,"entertainment");

        System.out.println("applications:");
        for (ApplicationDto applicationDto1:applicationDto){
            System.out.println(applicationDto1);
            applicationDto1.checkRating();
        }
    }
}
