/*
        n! means n × (n − 1) × ... × 3 × 2 × 1

        For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
        and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

        Find the sum of the digits in the number 100!
*/

package com.sanjnair.euler.p020factorialdigitsum;

import java.math.BigInteger;

public class P20FactorialDigitSum {
    public static void main(String[] args) {
        BigInteger factorial = new BigInteger("1");
        int limit = 100;
        for(int i=1; i<=limit; i++) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println("factorial: "+factorial);
        String factorialString = factorial.toString();
        int sum = 0;
        for(int index=factorialString.length()-1; index>=0; index--) {
            sum += factorialString.charAt(index) - '0';
        }
        System.out.println("sum: "+sum);
    }
}
