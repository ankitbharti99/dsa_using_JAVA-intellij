package com.oop.enumExamples;

public class Main{

    //    When a class should have only a fixed number of predefined objects, use an enum.
    enum Planet implements A {
        EARTH(9.8f),
        MOON(1.3f),
        MARS(3.7f);
//internally: public static final Planet Earth = new Planet(9.8f);

        float gravity;
        Planet(float gravity) {
            this.gravity = gravity;
        }

        @Override
        public void hello() {
            System.out.println("Hello Interface");
        }
    }

    public static void main(String[] args) {
        System.out.println(Planet.EARTH.gravity);
        System.out.println(Planet.MOON.gravity);
        Planet planet;
        planet = Planet.EARTH;
        planet.hello();
    }
}