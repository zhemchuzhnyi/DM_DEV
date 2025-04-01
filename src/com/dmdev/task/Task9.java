package com.dmdev.task;

/**
 * Написать прогрмму которая проходит циклом по англ алфавиту
 * начиная с буквы b и выводит каждую букву до тех пор, пока не встретит гласную
 * то есть вывести все согласные на консоль
 */

public class Task9 {

    public static void main(String[] args) {
        printLetters();
//        char value = 'c';
//        System.out.println((int) value);
    }
    public static void printLetters() {
        for (char letter = 'b'; !isVowel(letter); letter++) {
            System.out.println(letter);
        }
    }
    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == 'o';

    }
}
