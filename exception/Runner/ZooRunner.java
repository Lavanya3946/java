package com.xworkz.exception.Runner;

import com.xworkz.exception.book.ZooBooker;
import com.xworkz.exception.dto.ZooBookingDTO;
import com.xworkz.exception.exceptional.TicketBookingException;

public class ZooRunner {
    public static void main(String[] args) {
        ZooBookingDTO zooBookingDTO=new ZooBookingDTO("Lavanya",7760213946L,1);
        try{
            ZooBooker zooBooker=new ZooBooker();
            zooBooker.buyTickets(zooBookingDTO);

        } catch (TicketBookingException e) {
            System.err.println("booking in the main..");
        }
    }
}
