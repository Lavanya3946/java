package com.xworkz.Inheritnace.casting;

public class Government {
    public void run(PublicServent servant){
        if(servant instanceof PoliceOfficer){
            PoliceOfficer officer=(PoliceOfficer) servant;
            officer.controlCrime();
        }
        if(servant instanceof TicketCollector) {
            TicketCollector ticketCollector = (TicketCollector) servant;
            ticketCollector.checkTicket();
        }

            if(servant instanceof Inspector) {
                Inspector inspector = (Inspector) servant;
                inspector.controlStation();
            }

                if(servant instanceof TrafficPolice){
                    TrafficPolice trafficpolice=(TrafficPolice) servant;
                    trafficpolice.controlTraffic();
                }
            }
        }


