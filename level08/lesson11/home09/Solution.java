package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date check = new Date(date);
        Date startTime = new Date();
        startTime.setHours(0);
        startTime.setMinutes(0);
        startTime.setSeconds(0);
        startTime.setDate(0);
        startTime.setMonth(0);
        startTime.setYear(check.getYear());
        long msDay = 24 * 60 * 60 * 1000;

        return ((check.getTime() - startTime.getTime()) / msDay) % 2 != 0 ? false : true;
    }
}
