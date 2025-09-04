package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double divisionAndDifference(double first, double second) {
        return ru.job4j.math.MathFunction.division(first, second)
                + ru.job4j.math.MathFunction.difference(first, second);
    }

    public static double sumAllOfFunc(double first, double second) {
        return ru.job4j.math.MathFunction.division(first, second)
                + ru.job4j.math.MathFunction.difference(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 равен: " + divisionAndDifference(10, 20));
        System.out.println("Результат расчета 3 равен: " + sumAllOfFunc(10, 20));
    }
}