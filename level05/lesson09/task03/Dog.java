package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String name;
    int haight;
    String color;
    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int haight){
        this.name = name;
        this.haight = haight;
    }
    public Dog(String name, int haight, String color){
        this.name = name;
        this.haight = haight;
        this.color = color;
    }

}
