package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class CustomerDto {
    private String name;
    private String purchasedItem;
    private  long phone;
    private int id;
      public  void CustomerDto(){

    }

    public CustomerDto(String name, String purchasedItem, long phone, int id) {
        this.name = name;
        this.purchasedItem = purchasedItem;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurchasedItem() {
        return purchasedItem;
    }

    public void setPurchasedItem(String purchasedItem) {
        this.purchasedItem = purchasedItem;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerDto)) return false;
        CustomerDto that = (CustomerDto) o;
        return getPhone() == that.getPhone() && getId() == that.getId() && Objects.equals(getName(), that.getName()) && Objects.equals(getPurchasedItem(), that.getPurchasedItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPurchasedItem(), getPhone(), getId());
    }
}