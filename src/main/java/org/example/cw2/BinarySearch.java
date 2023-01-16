package org.example.cw2;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 4, 9, 1, 6, 8};
        int value = 10;
        InsertSort.insertSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Searching index = " + binarySearch(array, value, 0, array.length - 1));
    }

    private static int binarySearch(int[] array, int value, int min, int max) {
        int mid;

        if (max < min){
            return -1;
        } else {
            mid = (max - min) / 2 + min;
        }

        if (array[mid] < value){
            return binarySearch(array, value, mid + 1, max);
        } else {
            if (array[mid] > value){
                return binarySearch(array, value, min, mid - 1);
            }
            else {
                return mid;
            }
        }
    }
}
