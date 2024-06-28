package com.headfirst.api.chapter1.bank.deposit;

public class NonMemberDeposit implements Deposit{
    @Override
    public void deposit(String account, double amount) {
        System.out.println("Non-Hanpass member: " + account + " deposit of " + amount + " completed.");
    }
}
