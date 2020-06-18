package com.xiaozhang;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.awt.Point;
import java.util.Scanner;

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
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(Arrays.toString(numbers));  //boolean array initialized as false, string array initialized as empty strings
//      -----------------------------------------------------
//        int[] numbers2 = {2,3,4,1,5};
//        System.out.println(numbers2.length);
//        Arrays.sort(numbers2);
//        System.out.println(Arrays.toString(numbers2));
//      =======================================================
//      6. Multi-dimensional Arrays
//        int[][] matrix = new int[2][3]; // 2 row & 3 columns
//        matrix[0][0] = 1;
//        System.out.println(Arrays.deepToString(matrix));
//      -------------------------------------------------------
//        int[][][] cube = new int[2][3][4];
//        cube[0][0][0] = 3;
//        System.out.println(Arrays.deepToString(cube));
//      -------------------------------------------------------
//        int [][] matrix2 = {{1,2,3},{4,5,6}};
//        System.out.println(Arrays.deepToString(matrix2));
//      =======================================================
//      7. constants
//        final float PI = 3.14F; //treat this as a constant
//      =======================================================
//      8. arithmetic expressions
//        int add = 10 + 3;
//        System.out.println(add); //13
//      -------------------------------------------------------
//        int minus = 10 - 3;
//        System.out.println(minus); //7
//      -------------------------------------------------------
//        double divide = (double)10 / (double)3;
//        System.out.println(divide); //3.33333333
//      -------------------------------------------------------
//        int x = 1;
//        x++;
//        System.out.println(x); //2
//      -------------------------------------------------------
//        int y = 1;
//        int z = x++;
//        System.out.println(y); //1
//        System.out.println(z); //2
//      -------------------------------------------------------
//        int a = 1;
//        int b = ++x;
//        System.out.println(a); //2
//        System.out.println(b); //2
//      -------------------------------------------------------
//        int c = 1;
//        c += 2;
//        System.out.println(c); //3
//      =======================================================
//      9. order of operation
//        int num = 10 + 3 * 2;
//        System.out.println(num); //() > */ > +-
//      =======================================================
//      10. casting
        //  Implicit casting automatically converting
        //  byte > short > int > long > float > double
//        short x = 1; // 2 bytes for short
//        int y = x + 2; // 4 bytes for int
//        System.out.println(y);
//      -------------------------------------------------------
//        double xx = 1.1;
//        double yy = x + 2;
//        System.out.println(yy); // 3.0
//        int y2 = (int)xx + 2;
//        System.out.println(y2); // 3
//      --------------------------------------------------------
//        String xxx = "1";
//        Integer.parseInt(xxx);
//        int yyy = (int)x + 2;
//        System.out.println(yyy); // 3
//      -------------------------------------------------------
//        String x1 = "1.1";
//        double y1 = Double.parseDouble(x1) + 2;
//        System.out.println(y1); // 3.1
//      =======================================================
//      11. The Math Class
//        int a = Math.round(3.2837F);
//        System.out.println(a);
//      -------------------------------------------------------
//        int b = (int)Math.ceil(1.2F);
//        System.out.println(b);
//      -------------------------------------------------------
//        int c = (int)Math.floor(1.45F);
//        System.out.println(c);
//      -------------------------------------------------------
//        int d = Math.max(1,2);
//        System.out.println(d);
//      -------------------------------------------------------
//        int e = Math.min(1,2);
//        System.out.println(e);
//      -------------------------------------------------------
//        double f = Math.random();
//        System.out.println(f);
//      -------------------------------------------------------
//        double g = Math.random()*100; //btw 1 - 100
//        System.out.println(g);
//      -------------------------------------------------------
//        int h = (int) Math.round(Math.random()*100);
//        System.out.println(h);
//      =======================================================
//      12. Formatting numbers
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result); //$1,234,567.89
//      -------------------------------------------------------
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result2 = percent.format(0.15);
//        System.out.println(result2); // 15%
//      -------------------------------------------------------
//        String result3 = NumberFormat.getPercentInstance().format(0.3); // chain function
//        System.out.println(result3); // 30%
//      =======================================================
//      13. Reading input
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte(); //can only parse byte value
//        System.out.println("You are " + age + " years old.");
//      --------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("Your name is " + name + ".");
//      ========================================================
//      14. Mortgage Calculator Project
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();

        float r = interest / PERCENT / MONTH_IN_YEAR;
        int months = period * MONTH_IN_YEAR;

        double mort = principal * (r * Math.pow(1+r, months)) / (Math.pow(1+r, months) - 1);
        String mortgage = NumberFormat.getCurrencyInstance().format(mort);
        System.out.println("Mortgage: "+mortgage);

    }
}
