package ru.job4j.condition;
public class OddCheck {
    public static boolean check(int num) {
        boolean ret = true;
        if (num % 2 != 0) {
            ret = false;
        }
        return ret;
    }

    public static void main(String[] args) {
        boolean rsl = OddCheck.check(2);
        System.out.println(rsl);
        rsl = OddCheck.check(3);
        System.out.println(rsl);
    }
}