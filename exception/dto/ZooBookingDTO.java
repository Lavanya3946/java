package com.xworkz.exception.dto;

public class ZooBookingDTO  {
    private  String customerName;
    private  String email;
    private  long mobile;
    private  int noOfTickets;

    public ZooBookingDTO( String customerName, long mobile, int noOfTickets) {
        this.customerName = customerName;
        this.mobile = mobile;
        this.noOfTickets = noOfTickets;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getMobile() {
        return mobile;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }
}
