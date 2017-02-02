package com.javarush.test.level14.lesson08.home09;

/**
 * Created by dogy on 02.02.17.
 */
public class USD extends Money
{
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
