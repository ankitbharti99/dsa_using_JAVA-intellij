package com.OOP.interfaces;

public class Car implements Engine, Brake, Media {

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");
    }
}
