package com.dmdev.task;

/**
 * Имеется целое число, вводимое с консоли
 * Это число - сумма денег в рублях.
 * Вывести число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */

public class Task3 {

    public static void main(String[] args) {
        int rubles = 120;
        // 1 !11 - деление по модулю - рубль
        // рублей - 5 - 19
        // рубля 2 - 4

        if ((rubles % 10 == 1) && (rubles % 100 != 11)) {
            System.out.println(rubles + " рубль");
        } else if ((rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4)
                && !(rubles % 100 == 12 || rubles % 100 == 13 || rubles % 100 == 14)) {
            System.out.println(rubles + " рубля");
        } else {
        System.out.println(rubles + " рублей");
    }
    }
}
