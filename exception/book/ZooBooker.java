package com.xworkz.exception.book;

import com.xworkz.exception.dto.ZooBookingDTO;
import com.xworkz.exception.exceptional.TicketBookingException;

public class ZooBooker {

    public void buyTickets(ZooBookingDTO zooBookingDTO) throws TicketBookingException {
        System.out.println("ZooBooking is running..");
        zooBookingDTO.getCustomerName();
        zooBookingDTO.getMobile();
        zooBookingDTO.getNoOfTickets();

        if (zooBookingDTO.getCustomerName()==null||zooBookingDTO.getCustomerName().length()<4||zooBookingDTO.getNoOfTickets()<1||
        String.valueOf(zooBookingDTO.getMobile()).length()<10){


            System.err.println("Information is  Invalidate..");
            throw new TicketBookingException();

        }
        else{
            System.out.println("Information is Validate..   " +
                    "Booked successfully");
        }

    }

    }


