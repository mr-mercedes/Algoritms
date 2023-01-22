package org.example.s3;

import java.util.Objects;

public class Animal implements Comparable<Animal> {

    public String name;
    private String type;

//    private static int counter = 0;

    public Animal(String name, String type) {
        Animal currentAnimal = this;

        currentAnimal.name = Objects.requireNonNull(name, "name must not be null");
        currentAnimal.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.getName());
    }



}
