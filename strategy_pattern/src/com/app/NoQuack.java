package com.app;

public class NoQuack implements QuackBeh {
    @Override
    public void quack() {
        System.out.println("Duck is not quack");
    }
}
