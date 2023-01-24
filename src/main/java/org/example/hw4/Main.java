package org.example.hw4;



public class Main {
    public static void main(String[] args) {
        Homework.Tree<Integer> tree = new Homework.Tree<>();
        tree.add(5);
        tree.add(3);
        tree.add(2);
        tree.add(1);
        tree.add(8);
        tree.add(12);
        tree.add(4);

        System.out.println(tree.contains(2));
        System.out.println(tree.contains(8));
        System.out.println(tree.contains(-1));
        System.out.println(tree.contains(0));
        System.out.println(tree.contains(4));
    }
}
