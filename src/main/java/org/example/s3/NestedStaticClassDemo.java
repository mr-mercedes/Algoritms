package org.example.s3;


public class NestedStaticClassDemo {

    public static void main(String[] args) {
//        Car car = new Car();
        Car.Wheel wheel = new Car.Wheel();
//        Car.Engine engine = new Car.Engine();

//        Car.Engine engine = car.getEngine();


        Animal first = new Animal("afirst", "cat");
        Animal second = new Animal("xsecond", "dog");

        // first < second

        System.out.println(first.compareTo(second)); // -
        System.out.println(second.compareTo(first)); // +
    }

}
