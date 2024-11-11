package com.xworkz.inter.Company;

public class CompanyRuleImpl  implements CompanyRule{
    @Override
    public boolean holiday() {
        System.out.println("holiday is running in CompanyRuleImpl..");
        return true;
    }
}
