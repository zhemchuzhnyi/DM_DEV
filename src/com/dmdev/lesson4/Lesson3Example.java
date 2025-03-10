package com.dmdev.lesson4;

public class Lesson3Example {

    public static void main(String[] args) {
        int value = 5;
        int value2 = 3;
        int sum = value + value2;
        System.out.println(sum);

        // double
        int v = 10;
        int vv = 100;
        double sum1 = v / (double) vv; // приведение типов из инт в дабл, когда необходимо перевести в другой тип переменную - в скобках указывается тип переменной к которой необходимо привести
        System.out.println(sum1);

        int va = 5;
        va += 25;
        System.out.println(va);

        int val = 10;
        val++; //инкремент +1 к переменной
        System.out.println(val);
        val--; // декремент -1 от переменной
        System.out.println(val);






    }
}
