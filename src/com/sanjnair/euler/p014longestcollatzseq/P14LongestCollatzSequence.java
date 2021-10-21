/*
The following iterative sequence is defined for the set of positive integers:

        n → n/2 (n is even)
        n → 3n + 1 (n is odd)

        Using the rule above and starting with 13, we generate the following sequence:

        13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
        It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

        Which starting number, under one million, produces the longest chain?

        NOTE: Once the chain starts the terms are allowed to go above one million.
*/


package com.sanjnair.euler.p014longestcollatzseq;

public class P14LongestCollatzSequence {
    public static void main(String[] args) {
        int longestSequence = 0;
        long longestSequenceNum = 0;
        for(long i = 999999L; i>1; i=i-2) {
            int currentSequence = 1;
            long n = i;
            while(n>1) {
                if(n%2==0){
                    n = n/2;
                } else {
                    n = 3*n+1;
                }
                currentSequence++;
            }
            if (currentSequence>longestSequence) {
                longestSequence = currentSequence;
                longestSequenceNum = i;
            }
        }
        System.out.println("longestSequence: "+longestSequence);
        System.out.println("longestSequenceNum: "+longestSequenceNum);

    }
}