package org.example;

import java.util.Scanner;

/*
Рекурсивно найти n-ое число Фибоначчи.
Определить сложность. (fn[0] = 0 или 1) [fn(n) = (fn(n - 1) + fn(n - 2)]
 */
public class Task1 {
    public static void main(String[] args) {
        new Task1().run();
    }

    void run() {
        try (Scanner in = new Scanner(System.in);) {
            solve(in);
        }
    }

    void solve(Scanner in) {
        System.out.print("Enter number of febo: ");
        String number = in.next();
        int answer = febo(Integer.parseInt(number));
        System.out.println(number + "th of febonachi is " + answer);
        System.out.println("Сложность алгоритма O(n^2)");
    }

    private int febo(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return febo(number - 1) + febo(number - 2);
    }
}