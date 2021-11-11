package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println("Результат вычисления: " + d);
    }
}