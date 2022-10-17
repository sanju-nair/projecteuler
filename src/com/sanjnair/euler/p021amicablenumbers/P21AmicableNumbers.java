/*
        Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
        If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

        For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
        The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

        Evaluate the sum of all the amicable numbers under 10000.
*/

package com.sanjnair.euler.p021amicablenumbers;

public class P21AmicableNumbers {
    public static void main(String[] args) {
        int sumOfAmicableNumbers = 0;
        for(int num=10000; num>=0; num--) {
            int sumOfDivisors = calculateSumOfDivisors(num);
            if (sumOfDivisors!=num && num == calculateSumOfDivisors(sumOfDivisors)) {
                System.out.println(num+", "+sumOfDivisors);
                sumOfAmicableNumbers += num;
            }
        }
        System.out.println("sumOfAmicableNumbers: "+sumOfAmicableNumbers);
    }

    private static int calculateSumOfDivisors(int number) {
        int sum = 1;
        for(int i=2;i*i<number;i++){
            if(number%i==0){
                sum += i + number/i;
            }
        }
        return sum;
    }
}
