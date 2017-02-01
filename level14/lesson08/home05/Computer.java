package com.javarush.test.level14.lesson08.home05;

/**
 * Created by dogy on 01.02.17.
 */
public class Computer
{
    private Keyboard keyboard = new Keyboard();
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {

        return mouse;
    }

    public Keyboard getKeyboard() {

        return keyboard;
    }

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Computer(Monitor monitor) {
        this.monitor = monitor;
    }

    public Computer(Mouse mouse) {

        this.mouse = mouse;
    }
    public Computer(){}
}
