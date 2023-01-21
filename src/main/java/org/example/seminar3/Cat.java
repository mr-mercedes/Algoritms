package org.example.seminar3;


import java.util.Arrays;
import java.util.Objects;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, "Кот");
    }

    public Cat() {
        this("Имя кота по-умолчанию");
    }

    // if a1.equals(a2) => a1.hashCode() == a2.hashCode()
    // if a1.hashcode() != a2.hashCode() => !a1.equals(a2)

    @Override
    public boolean equals(Object obj) {
        Objects.requireNonNull(obj);
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }

        Cat other = (Cat) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
