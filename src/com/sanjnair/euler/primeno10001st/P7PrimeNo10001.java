/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

        What is the 10 001st prime number?
*/

package com.sanjnair.euler.primeno10001st;

public class P7PrimeNo10001 {
    public static void main(String[] args) {
        long i = 1;
        int limit = 10001;
        for (int count = 0; count < limit; ) {
            if (isPrime(++i)) {
                count++;
            }
        }
        System.out.println("Prime No " + limit + "  is: " + i);
    }

    private static boolean isPrime(long num) {
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
