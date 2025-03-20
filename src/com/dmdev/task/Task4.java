package com.dmdev.task;

/**
 * Написать программу, которая считывает год, введенный пользователем и определяет является ли этот год високосным
 * Год считается високосным - если делится на 4 без остатка
 * Если год делится на 100 - это не високосный год, за искл годов делящихся на 400
 * Пример
 * 1992 - високосный
 * 1900 - нет
 * 2000 - високосный
 */

public class Task4 {

    public static void main(String[] args) {
        int year = 1901;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}
