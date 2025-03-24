package com.dmdev.lesson6;

// циклы нужны  для повторения одного и того же действия (кусочка кода) - несколько раз, до тех пор пока условие верно


public class WhileExample {

    public static void main(String[] args) {
        int value = 0;
        do {
            System.out.println(value);
        } while (value < 10); // цикл с постусловием - выполняется 1 раз
    }

    private static void whileExample() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value--; // value = value -1 -декремент
        }
    }
}
