package org.example.cw2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 4, 9, 1, 6, 8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    finish = false;
                }
            }
        } while (!finish);
    }
}
