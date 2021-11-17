package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String s =  Integer.toString(i);
        boolean ret = true;
        for (int index = 0; index < s.length() / 2; index++) {
            if (s.charAt(index) !=  s.charAt(s.length() - 1 - index)) {
                ret = false;
                break;
            }
        }
        return ret;
    }
}