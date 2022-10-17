/*
You are given the following information, but you may prefer to do some research for yourself.

        1 Jan 1900 was a Monday.
            Thirty days has September,
            April, June and November.
            All the rest have thirty-one,
            Saving February alone,
            Which has twenty-eight, rain or shine.
            And on leap years, twenty-nine.
        A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
        How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/

package com.sanjnair.euler.p019countingsundays;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class P19CountingSundays {
    public static void main (String[] args) {
        int noOfSundays = 0;
        for(int year=1901; year<=2000; year++){
            for(int month = Calendar.JANUARY; month<= Calendar.DECEMBER; month++) {
                GregorianCalendar cal = new GregorianCalendar(year, month, 1);
                if (cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
                    noOfSundays++;
                }
            }
        }
        System.out.println("noOfSundays: "+noOfSundays);
    }
}
