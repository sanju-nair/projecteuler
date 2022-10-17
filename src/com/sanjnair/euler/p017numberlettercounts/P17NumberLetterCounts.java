/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

        If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


        NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
        The use of "and" when writing out numbers is in compliance with British usage.
*/

package com.sanjnair.euler.p017numberlettercounts;

import java.util.HashMap;
import java.util.Map;

public class P17NumberLetterCounts {
    public static void main(String[] args) {
        Map<Integer, String> numberNames = new HashMap<>();
        numberNames.put(1, "One");
        numberNames.put(2, "Two");
        numberNames.put(3, "Three");
        numberNames.put(4, "Four");
        numberNames.put(5, "Five");
        numberNames.put(6, "Six");
        numberNames.put(7, "Seven");
        numberNames.put(8, "Eight");
        numberNames.put(9, "Nine");
        numberNames.put(10, "Ten");
        numberNames.put(11, "Eleven");
        numberNames.put(12, "Twelve");
        numberNames.put(13, "Thirteen");
        numberNames.put(14, "Fourteen");
        numberNames.put(15, "Fifteen");
        numberNames.put(16, "Sixteen");
        numberNames.put(17, "Seventeen");
        numberNames.put(18, "Eighteen");
        numberNames.put(19, "Nineteen");
        numberNames.put(20, "Twenty");
        numberNames.put(30, "Thirty");
        numberNames.put(40, "Forty");
        numberNames.put(50, "Fifty");
        numberNames.put(60, "Sixty");
        numberNames.put(70, "Seventy");
        numberNames.put(80, "Eighty");
        numberNames.put(90, "Ninety");

        int letterCount = 0;
        String numberName;
        for(int index=1;index<1000;index++) {
            numberName = "";
            int num = index;
            if (num >= 100) {
                int hundredsPlace = num/100;
                numberName += numberNames.get(hundredsPlace) + "Hundred";
                num -= hundredsPlace*100;
            }
            if(num>0){
                if(numberName.length()!=0)
                    numberName += "And";
                if(num<=20) {
                    numberName += numberNames.get(num);
                } else {
                    int tensPlace = num/10;
                    numberName += numberNames.get(tensPlace*10);
                    num -= tensPlace*10;
                    if(num>0) {
                        numberName += numberNames.get(num);
                    }
                }
            }
            System.out.println(numberName);
            letterCount +=numberName.length();
        }

        System.out.println("finalLetterCount: "+(letterCount+"OneThousand".length()));
    }
}
