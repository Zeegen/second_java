package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Arrays;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<String>(Arrays.asList("Тыква","1","3","3","Персик","9","Виноград"));
        list[1] = new ArrayList<String>(Arrays.asList("Вишня","1","Боб","3","Яблоко","2","10","Арбуз"));
        list[2] = new ArrayList<String>();
        list[2].add("fff");
        list[2].add("asdf");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}