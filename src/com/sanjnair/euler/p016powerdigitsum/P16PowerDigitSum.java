/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

        What is the sum of the digits of the number 21000?
*/

package com.sanjnair.euler.p016powerdigitsum;

import java.math.BigInteger;

public class P16PowerDigitSum {
    public static void main(String[] args) {
        int index = 1000;
        BigInteger value = new BigInteger("2").pow(index);
        String valueString = value.toString();
        int sumOfDigits = 0;
        for(int i=valueString.length()-1;i>=0;i--) {
            sumOfDigits += valueString.charAt(i) - '0';
        }
        System.out.println("valueString: "+valueString+", sumOfDigits: "+sumOfDigits);
    }
}
