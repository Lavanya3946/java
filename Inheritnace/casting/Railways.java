package com.xworkz.Inheritnace.casting;

public class Railways {
    public void validateTicket(PublicServent servant){
        if(servant instanceof TicketCollector){
            TicketCollector ticketCollector=(TicketCollector) servant;
            ticketCollector.checkTicket();
        }
    }
}
