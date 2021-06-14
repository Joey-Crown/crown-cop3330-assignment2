/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joseph Crown
 */
package ex26;

public class PaymentCalculator {

    /* n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    where

    n is the number of months.
    i is the daily rate (APR divided by 365).
    b is the balance.
    p is the monthly payment. */

    public static double PaymentCalculator(double balance, double apr, double monthlyPayment) {

        // round the values of money up to the nearest cent
        double rounded = balance / monthlyPayment;
        rounded = Math.ceil(rounded * 100);
        rounded = rounded / 100;

        // formula to find the number of months;
        double months = Math.log(1 + (rounded) * (1 - Math.pow(1 + apr, 30) ));
        months = months * (-1.0/30.0);
        months = months / Math.log(1 + apr);

        months = Math.ceil(months);

        return months;
    }

}
