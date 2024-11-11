package com.xworkz.inter.Bank;

public class Bank  implements  BankRule{

    @Override
    public int openAccount() {
        System.out.println("openning a account..");
        return 0;
    }

    @Override
    public void closeAccount() {
        System.out.println("closing a account..");

    }

}
