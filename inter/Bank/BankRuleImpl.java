package com.xworkz.inter.Bank;

public class BankRuleImpl {
    public  Bank bank;

    public  BankRuleImpl(Bank bank){
        this.bank=bank;
    }
    public void openSavingAccount(){
        bank.openAccount();
        System.out.println("saving account opened with account number:");
    }
    public void closeSavingAccount(){
        bank.closeAccount();
        System.out.println("savings account closed..");

    }
}


