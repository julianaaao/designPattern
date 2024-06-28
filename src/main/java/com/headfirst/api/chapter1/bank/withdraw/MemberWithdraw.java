package com.headfirst.api.chapter1.bank.withdraw;

public class MemberWithdraw implements Withdraw{
    @Override
    public void withdraw(String account, double amount) {
        System.out.println("Hanpass member: "+ account + " withdrawal of " + amount + " completed (no fee).");
    }
}
