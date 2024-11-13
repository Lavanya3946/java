package com.xworkz.playStore.Application;

public class ApplicationRunner {
    public static void main(String[] args) {

        ApplicationDto applicationDto1=new ApplicationDto();
        applicationDto1.setName("InstaGram");
        applicationDto1.setId(1);
        applicationDto1.setVersion("3.2");
        applicationDto1.setSize("3.1gb");
        applicationDto1.setRatings(2);
        applicationDto1.setFeedbacks("entertainment");
        applicationDto1.setNoOfDownloads(30);

        ApplicationSaveDetails applicationSaveDetails=new ApplicationSaveDetails();
        String msg=applicationSaveDetails.applicationDetailsSave(applicationDto1);
        System.out.println(msg);

        ApplicationDto applicationDto2=new ApplicationDto();
        applicationDto2.setName("snap");
        applicationDto2.setId(2);
        applicationDto2.setVersion("3.2");
        applicationDto2.setSize("3.1gb");
        applicationDto2.setRatings(2);
        applicationDto2.setFeedbacks("entertainment");
        applicationDto2.setNoOfDownloads(30);


        String msg1=applicationSaveDetails.applicationDetailsSave(applicationDto2);
        System.out.println(msg1);

        ApplicationDto applicationDto3=new ApplicationDto();
        applicationDto3.setName("LinkedIn");
        applicationDto3.setId(3);
        applicationDto3.setVersion("3.2");
        applicationDto3.setSize("3.1gb");
        applicationDto3.setRatings(2);
        applicationDto3.setFeedbacks("jobs");
        applicationDto3.setNoOfDownloads(30);

        String msg3=applicationSaveDetails.applicationDetailsSave(applicationDto3);
        System.out.println(msg3);



        ApplicationDto applicationDto4=new ApplicationDto();
        applicationDto4.setName("whats app");
        applicationDto4.setId(4);
        applicationDto4.setVersion("3.2");
        applicationDto4.setSize("3.1gb");
        applicationDto4.setRatings(2);
        applicationDto4.setFeedbacks("chatting");
        applicationDto4.setNoOfDownloads(30);
        String msg4=applicationSaveDetails.applicationDetailsSave(applicationDto4);
        System.out.println(msg4);
        applicationSaveDetails.read();

        ApplicationDto applicationDto5=new ApplicationDto();
        applicationDto5.setName("twitter");
        applicationDto5.setId(5);
        applicationDto5.setVersion("3.2");
        applicationDto5.setSize("3.1gb");
        applicationDto5.setRatings(2);
        applicationDto5.setFeedbacks("jobs");
        applicationDto5.setNoOfDownloads(30);

        String msg5=applicationSaveDetails.applicationDetailsSave(applicationDto5);
        System.out.println(msg5);
        applicationSaveDetails.read();
        System.out.println("_________________");
        applicationSaveDetails.findApplicationById(2);
        applicationSaveDetails.findApplicationByName("twitter");

    }
}
