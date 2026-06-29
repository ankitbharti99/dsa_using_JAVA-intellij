package com.OOP.interfaces;

public class MyCar {
    private Engine engine;
    private MusicSystem player = new MusicSystem();
    private BrakeSystem brake = new BrakeSystem();

    public MyCar() {
//        engine = new PetrolEngine();
        engine = new ElectricEngine();
    }

    public MyCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.accelerate();
    }

    public void startmusic() {
        player.start();
    }

    public void pausedmusic() {
        player.pause();
    }

    public void brakesystem() {
        brake.brake();
    }

    public void changeEngine(Engine engine) {        //changing by passing reference of the class object
        this.engine = engine;
    }

    public void upgradeEngine() {            //changing without passing reference of the class object
        this.engine = new ElectricEngine();
    }
}
