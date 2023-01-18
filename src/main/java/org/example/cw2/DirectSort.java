package org.example.cw2;

import java.util.Arrays;

public class DirectSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 4, 9, 1, 6, 8};
        directSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPos]){
                    minPos = j;
                }
            }
            if(i != minPos){
                int tmp = array[i];
                array[i] = array[minPos];
                array[minPos] = tmp;
            }
        }
    }
}
