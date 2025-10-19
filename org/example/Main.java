package org.example;
import java.util.Scanner;

public class Main {

    public static int FirstNumber(int number) {
        int first;
        if (number < 1000) {
            first = number / 100;
        } else {
            first = number % 1000 / 100;
        }
        return first;
    }

    public static int SecondNumber(int number) {
        int second = number % 100 / 10;
        return second;
    }

    public static int ThirdNumber(int number) {
        int third = number % 10;
        return third;
    }

    public static int TakeTheAnswer(int number1, int number2, int number3) {
        int answer = number1 + number2 + number3;
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter:");
        int number = scanner.nextInt();

        int first = FirstNumber(number);
        int second = SecondNumber(number);
        int third = ThirdNumber(number);
        int answer = TakeTheAnswer(first, second, third);

        System.out.println(answer);
    }
}