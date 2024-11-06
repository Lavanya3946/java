package com.xworkz.Inheritnace.casting;

public class TicketCollector extends PublicServent{
    public void checkTicket(){
        System.out.println("running checkticket in ticketcollector");
    }

    @Override
    public void protectIPC() {
        System.out.println("running protectedIPC in ticketcollector");
    }
}
