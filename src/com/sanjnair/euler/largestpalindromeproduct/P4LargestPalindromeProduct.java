/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/


package com.sanjnair.euler.largestpalindromeproduct;

import java.util.ArrayList;
import java.util.List;

public class P4LargestPalindromeProduct {
    public static void main(String[] args) {
        boolean found = false;
        for (int largestProduct = 999 * 999; largestProduct >= 100 * 100 && !found; largestProduct--) {
            if (isPalindrome(largestProduct)) {
                for (int factor = 999; factor > 99; factor--) {
                    if (largestProduct % factor == 0 && largestProduct / factor < 1000 && largestProduct / factor > 99) {
                        System.out.println("Palindrome: " + largestProduct + " Factors are: " + factor + " ," + largestProduct / factor);
                        found = true;
                        break;
                    } else if (largestProduct / factor > 999) {
                        break;
                    } else if (largestProduct / factor < 100) {
                        break;
                    }
                }
            }
        }
    }

    private static boolean isPalindrome(int num) {
        List<Integer> numArray = new ArrayList<>();
        do {
            numArray.add(0, num % 10);
            num = num / 10;
        } while (num > 0);

        int len = numArray.size() - 1;

        for (int i = 0; i <= len; i++, len--) {
            if (!numArray.get(i).equals(numArray.get(len))) {
                return false;
            }
        }
        return true;
    }
}
