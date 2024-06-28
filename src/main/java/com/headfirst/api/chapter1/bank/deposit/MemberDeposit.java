package com.headfirst.api.chapter1.bank.deposit;

public class MemberDeposit implements Deposit {
    @Override
    public void deposit(String account, double amount) {
        double bonusAmount = amount * 0.01;
        System.out.println("Hanpass member: " + account + " deposit of " + amount + " with 1% bonus (" + bonusAmount + ") completed.");
    }
}
