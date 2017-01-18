package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //double nDate = Double.parseDouble(reader.readLine());
        int nDate1 = Integer.parseInt(reader.readLine());
        int nDate2 = Integer.parseInt(reader.readLine());
        int nDate3 = Integer.parseInt(reader.readLine());
        int nDate4 = Integer.parseInt(reader.readLine());
        System.out.println( max (max(nDate1,nDate2), max(nDate3,nDate4)));



    }
    public static int max (int a, int b){
       if (a > b) return a;
       else return b;
    }
}

