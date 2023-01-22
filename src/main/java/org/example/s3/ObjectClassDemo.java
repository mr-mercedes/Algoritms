package org.example.s3;


import java.lang.reflect.Field;

public class ObjectClassDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        reflection();

        // string -> []

        // StringPool -> StringTable [hash, "s1"]
        String s1 = "s1";
        String s2 = "s1";
        String s3 = new String("s1");
        String s4 = new String("s1");

        String stop = "";

        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true

        String intern = s3.intern();
        System.out.println(intern == s1);
        System.out.println(intern == s2);
        System.out.println(intern == s3);
    }

    private static void reflection() throws NoSuchFieldException, IllegalAccessException {
        Animal animal = new Animal("initialName", "cat");
//        Class<? extends Animal> aClass = animal.getClass();
        Class<Animal> animalClass = Animal.class;

        Class<Main.ListNode> listNodeClass = Main.ListNode.class;
        Class<?>[] listNodeSubClasses = listNodeClass.getDeclaredClasses();
        Class<?> listNodeIterator = listNodeSubClasses[0];
        System.out.println(listNodeIterator.getName());

        System.out.println(animalClass.getName());
        System.out.println(animalClass.getCanonicalName());
        System.out.println(animalClass.getSimpleName());

        Field name = animalClass.getField("name");
        name.setAccessible(true);
        name.set("newName", animal);

        System.out.println(animal);
    }

}
