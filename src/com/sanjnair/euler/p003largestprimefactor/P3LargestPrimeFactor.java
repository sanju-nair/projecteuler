/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

package com.sanjnair.euler.p003largestprimefactor;

public class P3LargestPrimeFactor {
    public static void main(String[] args) {
        long num = 600851475143L;
        long largestPrimeFactor = 1;

        for (long i = 3; i <= num; i = i + 2) {
            if (num % i == 0) {
                num /= i;
                largestPrimeFactor = i;
                System.out.println("primeFactor: " + i);
            }
        }
        System.out.println("largestPrimeFactor: " + largestPrimeFactor);
    }
}
