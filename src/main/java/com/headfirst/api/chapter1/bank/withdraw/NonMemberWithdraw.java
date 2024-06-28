package com.headfirst.api.chapter1.bank.withdraw;

public class NonMemberWithdraw implements Withdraw {
    @Override
    public void withdraw(String account, double amount) {
        double fee = 1000;
        System.out.println("Non-Hanpass member: "+account + " withdrawal of "+ amount + " completed with " + fee + "fee.");
    }
}
