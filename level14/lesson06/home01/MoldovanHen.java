package com.javarush.test.level14.lesson06.home01;

/**
 * Created by dogy on 31.01.17.
 */
public class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth(){return 3;}
    public String getDescription () {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
