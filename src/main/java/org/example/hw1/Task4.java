package main.java.org.example.hw1;
/*
Реализовать сдвиг элементов в массиве на n влево или вправо.
```java
// [1, 2, 3, 4], n = 1 => [4, 1, 2, 3]
public void shift(int[] array) {
    // TODO: 12.01.2023
}
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        new Task4().run();
    }

    void run() {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private void solve(Scanner in) {
        int[] array = fillArray(in);
        System.out.println(Arrays.toString(array));
        int[] newArray = hyperShiftArray(array, in);
        System.out.println(Arrays.toString(newArray));
    }

    private int[] hyperShiftArray(int[] array, Scanner in) {
        System.out.print("Enter number of shift: ");
        int offset = Integer.parseInt(in.next());
        int[] newArray = new int[array.length];
        if (offset > 0) {
            return rightShift(array, newArray, offset);
        } else if (offset < 0) {
            return leftShift(array, newArray, offset);
        } else {
            return array;
        }
    }

    private int[] fillArray(Scanner in) {
        System.out.print("Enter length: ");
        int length = Integer.parseInt(in.next());
        Random rd = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10);
        }
        return array;
    }

    private int[] leftShift(int[] array, int[] newArray, int offset) {
        int leftOffset = Math.abs(offset);
        int[] tmpArray = new int[leftOffset];
        for (int i = 0; i < array.length; i++) {
            if (i < leftOffset){
                tmpArray[i] = array[i];
                continue;
            }
            newArray[i - leftOffset] = array[i];
        }
        System.arraycopy(tmpArray, 0 , newArray, array.length - leftOffset, leftOffset);
        return newArray;
    }

    private int[] rightShift(int[] array, int[] newArray, int offset){
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[array.length - offset--];
            if (array.length - offset == array.length) {
                offset = array.length;
            }
        }
        return newArray;
    }
}
