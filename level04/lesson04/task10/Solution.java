package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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
        if (nDate1 == nDate2 && nDate2 == nDate3) System.out.println(nDate1 + " " + nDate2 + " " + nDate3);
        else {
            if (nDate1 - nDate2 == 0) System.out.println(nDate1 + " " + nDate2);
            if (nDate2 - nDate3 == 0) System.out.println(nDate2 + " " + nDate3);
            if (nDate1 - nDate3 == 0) System.out.println(nDate1 + " " + nDate3);
        }

    }
}