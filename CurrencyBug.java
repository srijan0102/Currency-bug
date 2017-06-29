package com.srijan.java;

import java.math.BigDecimal;

import static java.lang.System.*;

public class CurrencyBug {

    public static void main(String[] args) {
        out.println("This bug may causes problem in currency calculation");

        double amount = .12;
        double total =0;
        for (int i=0;i<10;i++){
            total = total + amount;
        }
        System.out.println("Total Ammount :" +total);
        System.out.println("This leads to make huge mistake in the calculation of ammount.Lets See How to fix them.");
        String strAmount = Double.toString(amount);
        String strTotal = Double.toString(total);
        BigDecimal bigAmount = new BigDecimal(strAmount);
        BigDecimal bigTotal = new BigDecimal(0);
        for (int i=0;i<10;i++){
            BigDecimal bSum= bigTotal.add(bigAmount);
            if(i==9) {
                System.out.println("Sum of BigDecimal Value :" +bSum.toString());
            }
        }
    }
}
