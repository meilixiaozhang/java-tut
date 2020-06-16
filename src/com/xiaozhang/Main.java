package com.xiaozhang;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
//      primitive types -> to store simple values or characters
//      byte long double int float char boolean
        byte age = 24;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
//      reference types -> to store complicated objects like date or mail messages
        Date now = new Date();
//      shortcut: sout
        System.out.println(now);
    }
}
