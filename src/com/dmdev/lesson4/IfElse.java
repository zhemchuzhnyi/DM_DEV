package com.dmdev.lesson4;

public class IfElse {

    public static void main(String[] args) {
        int value = 0;
      //  boolean test = value > 0;
        if (value > 0) { // больше нуля - положительное
            System.out.println("Число является положительным");
        } else if (value < 0){ // иначе - если меньше нуля - явл отрицательным
            System.out.println("Число является отрицательным");
        } else {
            System.out.println("Число является нулем");
            /* условия можно продлевать до бесконечности с помощью данной конструкции
            главное чтобы в конструкции if было что-то что является булеан.
            if - что - то такое (меньше - больше)
            else if - что-то такое (меньше - больше)
            else - будет такое (меньше - больше - равно)
             */

        }
    }
}
