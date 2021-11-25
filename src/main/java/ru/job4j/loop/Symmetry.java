package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String str =  Integer.toString(i);
        boolean ret = true;
        for (int index = 0; index < str.length() / 2; index++) {
            if (str.charAt(index) !=  str.charAt(str.length() - 1 - index)) {
                ret = false;
                break;
            }
        }
        return ret;
    }
}