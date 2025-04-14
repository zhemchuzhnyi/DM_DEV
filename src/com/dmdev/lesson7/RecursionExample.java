package com.dmdev.lesson7;

/*
Написать программу высчитывающую факториал введенного числа (с помощью рекурсии)
 */

public class RecursionExample {

    public static void main(String[] args) {
        // 1 * 2 * 3 * 4 * 5 * 6 = 6!
    }

    public static int factorial(int value) {
        if(value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }
}
