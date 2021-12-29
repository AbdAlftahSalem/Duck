package com.app;

public class RedDuck extends Duck {

    String redDuck = "Red Duck";

    RedDuck() {
        flyBeh = new FlyWings();
        quackBeh = new DuckQuack();
    }

}
