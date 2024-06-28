package com.headfirst.api.chapter1.bank.user;

import com.headfirst.api.chapter1.bank.deposit.MemberDeposit;
import com.headfirst.api.chapter1.bank.withdraw.MemberWithdraw;

public class Member extends Hanpass {
    public Member (){
        this.deposit = new MemberDeposit();
        this.withdraw = new MemberWithdraw();
    }
}
