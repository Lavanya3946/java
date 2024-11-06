package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.casting.PublicServent;
import com.xworkz.Inheritnace.casting.Railways;
import com.xworkz.Inheritnace.casting.TicketCollector;

public class RailwayRunner {
    public static void main(String[] args) {
        Railways rail=new Railways();

        PublicServent ps3=new TicketCollector();
        rail.validateTicket(ps3);

    }
}
