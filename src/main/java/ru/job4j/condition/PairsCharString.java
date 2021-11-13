package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        boolean ret = false;
        if ((l == null)  && (r == null) || (l.trim().isEmpty() && r.trim().isEmpty())) {
            ret =  true;
            System.out.println("Условие 1" + ret);
        } else if ((l.charAt(0) == r.charAt(r.length() - 1)) && (l.charAt(l.length() - 1) == r.charAt(0))) {
            ret =  true;
            System.out.println("Условие 2" + ret);
        }
        return ret;
    }
}