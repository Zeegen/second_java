package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
       // System.out.println(integerList);
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++)
        {
            if (min > array.get(i)) min = array.get(i);
        }
        return min;

        /*Collections.sort(array);
        return array.get(0);*/
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Тут создать и заполнить список
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        //Random rand = new Random();
        int n = Integer.parseInt(reader.readLine());
        //for (int i = 0; i < n; i++) linkedList.add(rand.nextInt(50) - 10);
        for (int i = 0; i < n; i++) linkedList.add(Integer.parseInt(reader.readLine()));
        return linkedList;
    }
}
