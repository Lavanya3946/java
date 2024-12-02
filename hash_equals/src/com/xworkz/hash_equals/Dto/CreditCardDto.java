package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class CreditCardDto {
    private  String  type ;
    private int no;
    private int cvv;

    public CreditCardDto(String type, int no, int cvv) {
        this.type = type;
        this.no = no;
        this.cvv = cvv;
    }

    public  void CreditCardDto(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv)
    {
        this.cvv = cvv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditCardDto)) return false;
        CreditCardDto that = (CreditCardDto) o;
        return getNo() == that.getNo() && getCvv() == that.getCvv() && Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getNo(), getCvv());
    }
}
