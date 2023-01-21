package org.example.cw2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 4, 9, 1, 6, 8};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int startPos, int endPos) {
        int leftPos = startPos;
        int rightPos = endPos;
        int pivot = array[(startPos + endPos) / 2];
        do {
            while (array[leftPos] < pivot) {
                leftPos++;
            }
            while (array[rightPos] > pivot) {
                rightPos--;
            }
            if (leftPos <= rightPos) {
                if (leftPos < rightPos) {
                    int tmp = array[leftPos];
                    array[leftPos] = array[rightPos];
                    array[rightPos] = tmp;
                }
                leftPos++;
                rightPos--;
            }

        } while (leftPos <= rightPos);
        if (leftPos < endPos) {
            quickSort(array, leftPos, endPos);
        }
        if (startPos < rightPos) {
            quickSort(array, startPos, rightPos);
        }
    }
}
