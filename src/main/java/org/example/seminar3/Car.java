package org.example.seminar3;


public class Car {

    public static int carCount = 0;

    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }

    public static class Wheel {

        public Wheel() {
        }

    }

    public class Engine {

        public Engine() {
        }
    }

}
