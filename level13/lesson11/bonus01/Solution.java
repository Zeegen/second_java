package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(reader.readLine());
        Scanner rdr = new Scanner(f);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (rdr.hasNext()) {list.add(rdr.nextInt());}
        Collections.sort(list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
        {
            Integer obj = it.next();
            if (obj % 2 != 0) it.remove();
        }
        for (Integer prn : list) System.out.println(prn);
    }
}
