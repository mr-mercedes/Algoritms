package main.java.org.example.hw1;

import java.util.Scanner;

/*
Найти n-ое число Фибоначчи за O(n).
 */
public class Task2 {
    public static void main(String[] args) {
        new Task2().run();
    }

    void run() {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    void solve(Scanner in) {
        System.out.print("Enter number of febo: ");
        String number = in.next();
        int answer = feboLine(Integer.parseInt(number));
        System.out.println(number + "th of febonachi is " + answer);
        System.out.println("Сложность алгоритма O(n)");

    }

    private int feboLine(int number) {
        int firstNumber = 1;
        int secondNumber = 1;
        int swapNumber;
        int counter = number;
        while (--counter > 0){
            swapNumber = secondNumber;
            secondNumber += firstNumber;
            firstNumber = swapNumber;
        }
        return secondNumber;
    }
}
