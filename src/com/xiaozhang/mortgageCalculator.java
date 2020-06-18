package com.xiaozhang;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    final static byte PERCENT = 100;
    final static byte MONTHS = 12;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
        float annualRate = (float) readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualRate, years);
        printPayments(principal, annualRate, years);
    }

    private static void printMortgage(int principal, float annualRate, byte years){
        double mortgage = calculateMortgage(principal, annualRate, years);
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormat);
    }

    private static void printPayments(int prinicipal, float annualRate, byte years){
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month < years * MONTHS; month++) {
            double balanceRemained = calculateRemains(prinicipal, annualRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balanceRemained));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between" + min + "and " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principal, float annualRate, byte years) {
        float monthlyRate = annualRate / PERCENT / MONTHS;
        short payments = (short)(years * MONTHS);

        double mort = principal * (monthlyRate * Math.pow(1+monthlyRate, payments)) / (Math.pow(1+monthlyRate, payments) - 1);
        return mort;
    }

    public static double calculateRemains(int principal, float annualRate, byte years, short paymentsMade) {
      float monthlyRate = annualRate / PERCENT / MONTHS;
        short totalPayments = (short)(years * MONTHS);
        String balanceFormat = "";

        double balance = principal * (Math.pow(1+monthlyRate, totalPayments) - Math.pow(1+monthlyRate, paymentsMade)) / (Math.pow(1+monthlyRate, totalPayments) - 1);
        return balance;
    }
}
