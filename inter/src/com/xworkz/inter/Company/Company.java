package com.xworkz.inter.Company;

public class Company {
    CompanyRule companyRule;


    public  Company(CompanyRule companyRule){
        this.companyRule=companyRule;
    }

    public void checkHoliday(){
        boolean holiday=companyRule.holiday();

        if(holiday) {
            System.out.println("company is holiday ..");
        }
            else
            {
                System.out.println("company is not holiday..");
            }
        }
    }

