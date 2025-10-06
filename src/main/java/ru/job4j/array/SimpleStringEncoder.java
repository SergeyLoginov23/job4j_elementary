package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int index = 1; index < input.length(); index++) {
             if (symbol != input.charAt(index)) {
                 if (counter > 1) {
                     result += String.valueOf(symbol) + counter;
                 } else {
                     result += String.valueOf(symbol);
                 }
                 counter = 1;
                 symbol = input.charAt(index);
             } else {
                 counter++;
             }
             if (index == input.length() - 1) {
                 if (counter > 1) {
                     result += String.valueOf(symbol) + counter;
                 } else {
                     result += String.valueOf(symbol);
                 }
             }
        }
        if (input.length() == 1) {
            result = String.valueOf(symbol);
        }
        return result;
    }
}