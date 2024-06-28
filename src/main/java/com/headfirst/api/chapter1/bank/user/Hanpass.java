package com.headfirst.api.chapter1.bank.user;

import com.headfirst.api.chapter1.bank.deposit.Deposit;
import com.headfirst.api.chapter1.bank.withdraw.Withdraw;

public class Hanpass {
    Deposit deposit;
    Withdraw withdraw;

    public void withdraw(String account, double amount){
        withdraw.withdraw(account, amount);
    }
    public void deposit(String account, double amount){
        deposit.deposit(account, amount);
    }
    public void setWithdraw(Withdraw withdraw){
        this.withdraw = withdraw;
    }
    public void setDeposit(Deposit deposit){
        this.deposit = deposit;
    }

}
