package com.app;

public class Duck {

    FlyBeh flyBeh;
    QuackBeh quackBeh;

    void fly(){
        flyBeh.fly();
    }

    void quack(){
        quackBeh.quack();
    }
}
