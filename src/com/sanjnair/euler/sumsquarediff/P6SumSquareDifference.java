/*
The sum of the squares of the first ten natural numbers is,

        The square of the sum of the first ten natural numbers is,

        Hence, the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

package com.sanjnair.euler.sumsquarediff;

public class P6SumSquareDifference {
    public static void main(String[] args) {
        long sumOfSquares = 0L;
        long sum = 0L;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        long sumSquareDiff = sum * sum - sumOfSquares;
        System.out.println("sumSquareDiff: " + sumSquareDiff);
    }
}
