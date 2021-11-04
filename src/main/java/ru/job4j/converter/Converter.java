package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl =  value / 60;
        return rsl;
    }

    public static boolean checkResult(float out, float expected) {
        boolean rsl = expected == out;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEur = 2;
        float expectedDollar = 2;
        System.out.println("140 rubles are 2 euros. Test result : " + checkResult(Converter.rubleToEuro(in), 2F));
        System.out.println("140 rubles are 2.3 dollars. Test result : " + checkResult(Converter.rubleToDollar(in), 2.3333333F));
    }
}
