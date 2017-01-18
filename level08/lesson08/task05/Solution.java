package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    /*public static void main (String[] args){
        HashMap<String,String> test =createMap();
        System.out.println(test);
        removeTheFirstNameDuplicates(test);
        System.out.println(test);

    }*/



    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> stringHashMap = new HashMap<String, String>();
        for (int i = 0; i < 10; i++){
            stringHashMap.put("Fn" + i, "Ln"+ ((i < 6) ? + i : + (i - 6)));
        }
return stringHashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashSet<String> dupel = new HashSet<String>();

        /*for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (dupel.contains(entry.getValue())) it.remove();
            else dupel.add(entry.getValue());
        }*/

        HashSet<String> set = new HashSet<String>();
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> entry : copy.entrySet())
        {
            if (set.contains(entry.getValue()))
                removeItemFromMapByValue(map, entry.getValue());
            else
                set.add(entry.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
