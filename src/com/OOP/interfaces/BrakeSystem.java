package com.OOP.interfaces;

public class BrakeSystem implements Brake{
    @Override
    public void brake() {
        System.out.println("Car slows down and stops");
    }
}
