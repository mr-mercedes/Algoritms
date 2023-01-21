package org.example.cw2;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 4, 9, 1, 6, 8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
