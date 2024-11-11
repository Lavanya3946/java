package com.xworkz.inter.Runner;

import com.xworkz.inter.Company.Company;

import com.xworkz.inter.Company.CompanyRule;
import com.xworkz.inter.Company.CompanyRuleImpl;

public class CompanyRunner {
    public static void main(String[] args) {
      CompanyRule companyRule=new CompanyRuleImpl();
      Company company=new Company(companyRule);
      company.checkHoliday();



    }
}
