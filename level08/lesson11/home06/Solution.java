package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human sun = new Human("Sun1", true, 12);
        Human sun2 = new Human("Sun2", true, 13);
        Human douter = new Human("Doter", false, 17);
        Human mother = new Human("Mom", false, 23, new Human[]{sun, sun2, douter});
        Human father = new Human("Father", true, 30, new Human[]{sun, sun2, douter});
        Human grendPa = new Human("GrendPa1", true, 78, new Human[]{father});
        Human grendMa = new Human("GrendMa1", false, 67, new Human[]{father});
        Human grendPa2 = new Human("GrendPa2", true, 77, new Human[]{mother});
        Human grendMa2 = new Human("GrendMa2", false, 60, new Human[]{mother});

        System.out.println(sun);
        System.out.println(sun2);
        System.out.println(douter);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grendPa);
        System.out.println(grendMa);
        System.out.println(grendPa2);
        System.out.println(grendMa2);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human (String name, boolean sex, int age, Human[] chil)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, chil);
        }
        Human (String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
