package com.app;

public class Main {

    public static void main(String[] args) {

        RedDuck redDuck = new RedDuck();
        redDuck.fly();
        redDuck.quack();

        System.out.println("***************************************************");

        BlueDuck blueDuck = new BlueDuck();
        blueDuck.fly();
        blueDuck.quack();

    }
}
