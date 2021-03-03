package lesson10.calculator;

import lesson10.data.Fraction;

public class Math {


    public static Fraction addition(Fraction a, Fraction b) {
        int aNumerator;
        int bNumerator;
        int denominator;

        denominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        aNumerator = a.getNumerator() * (denominator / a.getDenominator());
        bNumerator = b.getNumerator() * (denominator / b.getDenominator());

        return new Fraction(aNumerator + bNumerator, denominator);
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        int aNumerator;
        int bNumerator;
        int denominator;

        denominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        aNumerator = a.getNumerator() * (denominator / a.getDenominator());
        bNumerator = b.getNumerator() * (denominator / b.getDenominator());

        return new Fraction(aNumerator - bNumerator, denominator);
    }

    public static Fraction multiplication(Fraction a, Fraction b) {
        return new Fraction(a.getNumerator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
    }

    public static Fraction division(Fraction a, Fraction b) {
        return new Fraction(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());

    }

    private static int gcdRecursionAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursionAlgorithm(b, a % b);
    }

    private static int leastCommonMultiple(int a, int b) {
        return a / gcdRecursionAlgorithm(a, b) * b;
    }
}
