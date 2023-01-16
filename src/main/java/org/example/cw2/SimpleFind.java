package org.example.cw2;

public class SimpleFind {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 4, 9, 1, 6, 8};
        int value = 5;
        System.out.println("Searching index = " + find(array, value));
    }

    private static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
