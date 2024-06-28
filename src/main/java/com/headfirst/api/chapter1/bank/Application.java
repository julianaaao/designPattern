package com.headfirst.api.chapter1.bank;

import com.headfirst.api.chapter1.bank.user.Hanpass;
import com.headfirst.api.chapter1.bank.user.Member;
import com.headfirst.api.chapter1.bank.user.NonMember;

public class Application {

    public static void main(String[] args) {
        Hanpass member = new Member();
        member.deposit("Kim", 50000);
        Hanpass nonMember = new NonMember();
        nonMember.withdraw("Lee", 48000);
    }
}
