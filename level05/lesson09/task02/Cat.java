package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен,
то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String name;
    int waight;
    int age;
    String color;
    String address;

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int waight, int age){
        this.name = name;
        this.waight = waight;
        this.age = age;
    }
    public  Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.waight = 6;
    }
    public Cat(int waight, String color){
        this.waight = waight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 4;
    }
    public Cat(int waight, String color, String address){
        this.waight = waight;
        this.color = color;
        this.address = address;

    }

}
