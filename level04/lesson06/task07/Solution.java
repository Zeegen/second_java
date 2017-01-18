package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
        if (nDate1 != nDate2 && nDate1 != nDate3) System.out.println("1");
        if (nDate2 != nDate1 && nDate2 != nDate3) System.out.println("2");
        if (nDate3 != nDate1 && nDate3 != nDate2) System.out.println("3");

    }
}
