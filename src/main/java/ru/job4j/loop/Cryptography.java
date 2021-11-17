package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (s.trim().isEmpty()) {
            s = "empty";
        } else if (s.length() > 4) {
            for (int index = 0; index < s.length() - 4; index++) {
                sb.setCharAt(index, '#');
                s = sb.toString();
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String code = Cryptography.code("");
        System.out.println(code);
    }
}