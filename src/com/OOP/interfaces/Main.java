package com.OOP.interfaces;

public class Main {
    static void main() {
//        Car car = new Car();
//        car.start();
//        car.stop();
//        car.accelerate();
//        car.brake();

//        Media mediaCar = new Car();
//        mediaCar.stop();

//        MusicSystem mediaCar = new MusicSystem();
//        mediaCar.pause();
//
//        PetrolEngine petrolEngine = new PetrolEngine();
//        petrolEngine.start();

        MyCar myCar = new MyCar();
        myCar.start();
        myCar.changeEngine(new PetrolEngine());  //changing by passing reference of the class object
        myCar.stop();
//        myCar.upgradeEngine();   //changing without passing reference of the class object
        myCar.accelerate();
        myCar.startmusic();
        myCar.pausedmusic();
        myCar.brakesystem();
    }
}
