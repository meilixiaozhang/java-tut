package com.xiaozhang;

import java.lang.reflect.Array;
import java.util.Arrays;
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
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
//      -----------------------------------------------------
//      reference type: allocate memory to store point, another one stores the address in that location
//      store reference in the memory
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
//      =====================================================
//      3. Strings
//        String message = "Hello World" + "!!";
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("loo"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("o")); // returns index
//        System.out.println(message.indexOf("sky")); // returns -1
//        System.out.println(message.replace("!", "*")); // The original string is not changed, in Java Strings are IMMUTABLE
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.trim()); // get rid of white spaces
//      =======================================================
//      4. Escape Sequences
//        String message2 = "Hello \"Pretty\""; //fix double quotes in string with a backslash
//        System.out.println(message2);
//        String message3 = "c:\\Windows\\..."; //fix a back slash in string with another backslash
//        System.out.println(message3);
//        String message4 = "c:\nWindows\\..."; // insert a new line: \n
//        System.out.println(message4);
//        String message5 = "c:\tWindows\\..."; // for a tab
//        System.out.println(message5);
//      =======================================================
//      5. Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));  //boolean array initialized as false, string array initialized as empty strings
//      --------------------------------------------------------
        int[] numbers2 = {2,3,4,1,5};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }
}
