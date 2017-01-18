package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nDate1 = Integer.parseInt(reader.readLine());
        int nDate2 = Integer.parseInt(reader.readLine());
        int nDate3 = Integer.parseInt(reader.readLine());

        if (nDate1 != min(nDate1, min(nDate2,nDate3)) && nDate1 != max(nDate1, max(nDate2,nDate3))) {
            System.out.println(max(nDate1, max(nDate2,nDate3)) + " " + nDate1 + " " + min(nDate1, min(nDate2,nDate3)));
        }
        if (nDate2 != min(nDate1, min(nDate2,nDate3)) && nDate2 != max(nDate1, max(nDate2,nDate3))) {
            System.out.println(max(nDate1, max(nDate2,nDate3)) + " " + nDate2 + " " + min(nDate1, min(nDate2,nDate3)));
        }
        if (nDate3 != min(nDate1, min(nDate2,nDate3)) && nDate3 != max(nDate1, max(nDate2,nDate3))) {
            System.out.println(max(nDate1, max(nDate2,nDate3)) + " " + nDate3 + " " + min(nDate1, min(nDate2,nDate3)));
        }

    }
    public static int min (int a, int b){
        if (a < b) return a;
        else return b;
    }
    public static int max (int a, int b){
        if (a > b) return a;
        else return b;
    }
}
