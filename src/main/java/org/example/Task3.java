package org.example;
/*
Найти сумму элементов главной диагонали в двумерном массиве. Найти сумму элементов побочной диагонали в двумерном массиве.
 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 ```java public void findMainDiagonalSum(int[][] matrix) {
 // TODO: 12.01.2023
}

 */

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        new Task3().run();
    }

    void run() {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private void solve(Scanner in) {
        System.out.print("Enter size of matrix: ");
        int colRow = Integer.parseInt(in.next());
        int[][] array = fillArray(colRow, colRow);
        printArray(array);
        System.out.println("Sum of main diagonal " + sumOfMainDig(array));
        System.out.println("Sum of minor diagonal " + sumOfMinorDig(array));
    }

    private int sumOfMinorDig(int[][] array) {
        int sum = 0;
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum += array[j++][i];
        }
        return sum;
    }

    private int sumOfMainDig(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    private void printArray(int[][] array) {
        for (int[] cols : array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(cols[i] + "\t");
            }
            System.out.println();
        }
    }

    private int[][] fillArray(int col, int row) {
        Random rd = new Random();
        int[][] array = new int[col][row];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rd.nextInt(10);
            }
        }
        return array;
    }
}
