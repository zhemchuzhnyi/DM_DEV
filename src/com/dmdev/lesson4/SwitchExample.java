package com.dmdev.lesson4;

public class SwitchExample {

    public static void main(String[] args) {
        // byte, short, int, char, String, enum
        int value = 21;
        switch (value){
            case 10:
                System.out.println("value == 10");
                break;
            case 2:
                System.out.println("value == 2");
                break;
            case 100:
                System.out.println("value == 100");
                break;
            case 28:
                System.out.println("value == 28");
                break;
            default:
                System.out.println("Нет такого значения");
        }
    }
}
