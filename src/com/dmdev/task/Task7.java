package com.dmdev.task;

/*
В 1626 году индейцы продали Манхэттен за 24$
Написать программу которая высчитывает сумму получившуюся бы в текущем году,
если бы индейцы положили бы деньги в банк под 5% годовых
 */

public class Task7 {

    public static void main(String[] args) {
        double sourceSum = 26;
        double result = sum(sourceSum);
        System.out.println(result);


    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2025; year++){
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + " : " + result);

        }
        return result;
    }
}
