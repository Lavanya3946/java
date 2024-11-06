package com.xworkz.Inheritnace.Runner;


import com.xworkz.Inheritnace.casting.Government;
import com.xworkz.Inheritnace.casting.PoliceStation;
import com.xworkz.Inheritnace.casting.*;

public class GovrenmentRunner {
    public static void main(String[] args) {
        Government government=new Government();
        PoliceStation policeStation=new PoliceStation();


        PublicServent pub=new PoliceOfficer();
        PublicServent pub1=new Inspector();
        PublicServent pub2=new TicketCollector();
        PublicServent pub3=new TrafficPolice();


        government.run(pub);
        System.out.println("--------------");
        government.run(pub1);
        System.out.println("--------------");
        government.run(pub2);
        System.out.println("--------------");
        government.run(pub3);

    }
}
