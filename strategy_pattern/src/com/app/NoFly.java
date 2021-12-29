package com.app;

public class NoFly implements FlyBeh {

    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
