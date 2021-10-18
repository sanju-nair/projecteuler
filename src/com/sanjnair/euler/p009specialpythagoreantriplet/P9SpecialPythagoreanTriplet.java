/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

        a2 + b2 = c2
        For example, 32 + 42 = 9 + 16 = 25 = 52.

        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        Find the product abc.
*/


package com.sanjnair.euler.p009specialpythagoreantriplet;

public class P9SpecialPythagoreanTriplet {
    public static void main(String[] args) {

        double a, b, c;
        for (a = 1; a < 1000; a++) {
            for (b = a; b < 1000; b++) {
                c = 1000 - (a + b);
                if (c * c == (a * a + b * b)) {
                    System.out.println("a: " + a + " b: " + b + " c:" + c);
                    System.out.println("abc: " + a * b * c);
                }
/* Method 2
                c = Math.sqrt(a*a + b*b);

                if (c % 1 == 0 && (a+b+c == 1000)) {
                    System.out.println("a: "+a+" b: "+b+" c:"+c);
                    System.out.println("abc: "+a*b*c);
                }
*/
            }
        }


    }
}
