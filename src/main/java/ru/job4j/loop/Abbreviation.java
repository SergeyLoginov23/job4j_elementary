package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int index = 0; index < s.length(); index++) {
             if (index == 0) {
                sb.append(s.charAt(index));
             }
             if (s.charAt(index) == ' ') {
                 sb.append(s.charAt(index + 1));
                 index++;
             }
        }
        s = sb.toString();
        return s;
    }
}