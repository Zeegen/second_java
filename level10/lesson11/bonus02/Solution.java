package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

/*HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        while (true) {
            String name = reader.readLine();
            if (name.equals("")) break;
            String[] strings = name.split(" ");
            hashMap.put(strings[1], Integer.parseInt(strings[0]));
        }

        for (Map.Entry<String,Integer> prN : hashMap.entrySet()){
            System.out.println(prN.getValue() + " " + prN.getKey());
        }*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true)
        {
            try
            {
                Integer id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();

                map.put(name, id);
            }
            catch (Exception e){
                break;
            }
        }


        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            String id = pair.getKey();
            Integer name = pair.getValue();
            System.out.println(name + " " + id);
        }
    }
}
