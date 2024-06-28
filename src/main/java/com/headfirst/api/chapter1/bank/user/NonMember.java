package com.headfirst.api.chapter1.bank.user;

import com.headfirst.api.chapter1.bank.deposit.NonMemberDeposit;
import com.headfirst.api.chapter1.bank.withdraw.NonMemberWithdraw;

public class NonMember extends Hanpass {
    public NonMember() {
        this.deposit = new NonMemberDeposit();
        this.withdraw = new NonMemberWithdraw();
    }
}
