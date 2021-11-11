package ru.job4j.converter;


public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static boolean checkResult(float out, float expected) {
        boolean rsl = expected == out;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 420;
        float expectedEur = 6;
        float expectedDollar = 7;
        System.out.println("420 rubles are 6 euros. Test result : " + checkResult(Converter.rubleToEuro(in), expectedEur));
        System.out.println("420 rubles are 7 dollars. Test result : " + checkResult(Converter.rubleToDollar(in), expectedDollar));
    }
}
