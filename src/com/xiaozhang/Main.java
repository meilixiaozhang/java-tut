package com.xiaozhang;

import java.util.Date;
import java.awt.Point;

public class Main {

    public static void main(String[] args) {
//      1. primitive types & reference types
//      primitive types -> to store simple values or characters
//      byte long double int float char boolean
//        byte age = 24;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = true;
//      ----------------------------------------------------
//      reference types -> to store complicated objects like date or mail messages
//        Date now = new Date();
//      shortcut: sout
//        System.out.println(now);
//      =====================================================
//      2. differences btw primary and reference types
//      primitive type store values at different memory locations
//      copy by value, and the values are completely independent
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
//      -----------------------------------------------------
//      reference type: allocate memory to store point, another one stores the address in that location
//      store reference in the memory
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
