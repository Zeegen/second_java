package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDate1 = reader.readLine();
        int nDate1 = Integer.parseInt(sDate1);
        String sDate2 = reader.readLine();
        int nDate2 = Integer.parseInt(sDate2);
        String sDate3 = reader.readLine();
        int nDate3 = Integer.parseInt(sDate3);
        if (nDate1 < nDate2 + nDate3 && nDate2 < nDate1 + nDate3 && nDate3 < nDate1 + nDate2) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
}