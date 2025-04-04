package com.dmdev.task;

/**
 * Написать программу определяющую является ли введенное число простым
 * т.е делится без остатка только на 1 и само на себя
 */

public class Task8 {

    public static void main(String[] args) {
        int value = 12;
        boolean result = isSimple(value);
        System.out.println(result);


    }

    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
