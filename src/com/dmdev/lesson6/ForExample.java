package com.dmdev.lesson6;

public class ForExample {

    public static void main(String[] args) {
        for (int value = 110; value > 0; value--) { // for состоит из 3х частей
            System.out.println(value);
            if (value == 5) {
                continue; // - возвращается к началу условия
               // break; // - доходит до 5
            }
        }
        // 1я- инициализация в скобках, 2я- условие (value > 0), 3я- изменение\превращение\уменьшение переменной value
        // плюсы for - можнео использовать лайф темплейты - скорость


    }
}
