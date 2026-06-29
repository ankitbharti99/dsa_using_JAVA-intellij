package com.OOP.interfaces;

public class MusicSystem implements Media{

    @Override
    public void start() {
        System.out.println("Music starts playing");
    }

    @Override
    public void stop() {
        System.out.println("Music stops playing");
    }

    public void pause() {
        System.out.println("Music paused");
    }
}
