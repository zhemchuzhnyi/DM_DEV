package com.dmdev.task;

/**
 * Дано целое число.
 * Определить, является ли последняя цифра этого числа - цифрой 3
 */

public class Task2 {

    public static void main(String[] args) {
        // необходимо поделить по модулю, интересет остаток
        int testValue = 912312;
        if (testValue % 10 == 3) {
            System.out.println("Последняя цифра числа является 3");
        }
    }
}
