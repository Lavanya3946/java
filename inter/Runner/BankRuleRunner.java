package com.xworkz.inter.Runner;


import com.xworkz.inter.Bank.Bank;
import com.xworkz.inter.Bank.BankRuleImpl;

public class BankRuleRunner {
    public static void main(String[] args) {
        Bank bank=new Bank();
        BankRuleImpl bankRule=new BankRuleImpl(bank);
        bankRule.openSavingAccount();
        bankRule.closeSavingAccount();


    }
}
