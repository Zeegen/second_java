package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human greandFather = new Human("Дед1",true, 89, null, null);
        System.out.println(greandFather.toString());
        Human greandFather2 = new Human("Дед2",true, 89, null, null);
        System.out.println(greandFather2.toString());

        Human greandMother = new Human("Баба1",false, 67, null, null);
        System.out.println(greandMother.toString());
        Human greandMother2 = new Human("Баба2",false, 67, null, null);
        System.out.println(greandMother2.toString());
        Human mother = new Human("Мама", false, 24,greandFather,greandMother);
        System.out.println(mother.toString());
        Human father = new Human("Папа", true,27, greandFather2,greandMother2);
        System.out.println(father.toString());
        Human douter = new Human("Ира", false, 16, father, mother);
        System.out.println(douter.toString());
        Human douter2 = new Human("Оля", false, 16, father, mother);
        System.out.println(douter2.toString());
        Human son = new Human("Дима", true, 13, father, mother);
        System.out.println(son.toString());

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

      Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
