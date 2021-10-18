/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

package com.sanjnair.euler.summationofprimes;

public class P10SummationOfPrimes {
    public static void main(String[] args) {
        long i = 1L;
        long sum = 0L;
        long limit = 2000000L;
        while (i < limit) {
            if (isPrime(++i)) {
                sum += i;
//                System.out.println(i);
            }
        }
        System.out.println("Sum of primes below " + limit + " is: " + sum);
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
