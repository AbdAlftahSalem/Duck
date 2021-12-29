package com.app;

public class BlueDuck extends Duck {

    BlueDuck() {
        flyBeh = new NoFly();
        quackBeh = new NoQuack();
    }
}
