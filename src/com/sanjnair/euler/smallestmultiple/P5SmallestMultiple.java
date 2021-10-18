/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

package com.sanjnair.euler.smallestmultiple;

public class P5SmallestMultiple {
    public static void main(String[] args) {

        long product = 1L;

        for (long i = 1; i <= 20; i++) {
            product = lcm(i, product);
        }

        System.out.println("product:" + product);
    }

    private static long lcm(long a, long b) {
        //LCM = a*b/GCD
        long gcd = 1;
        for (long i = gcd; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return a * b / gcd;
    }
}
