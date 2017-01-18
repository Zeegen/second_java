package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> tempo = new ArrayList<String>();
        for (int i = 0; i < N; i++) strings.add(reader.readLine());
        for (int i = 0; i < strings.size(); i++){
            if (i < M) tempo.add(strings.get(i));
            else tempo.add(0, strings.get(strings.size() + M - 1 - i));
        }
        for (String s : tempo) System.out.println(s);

        //напишите тут ваш код
    }
}
