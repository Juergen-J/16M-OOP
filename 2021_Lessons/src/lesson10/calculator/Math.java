package lesson10.calculator;

import lesson10.data.Fraction;

public class Math {
    public static void reduce(Fraction n) {
        int temp = gcdRecursionAlgorithm(n.getNumerator(), n.getDenominator());
        n.setNumerator(n.getNumerator() / temp);
        n.setDenominator(n.getDenominator() / temp);
    }

    public static Fraction addition(Fraction a, Fraction b) {
        int aNumerator;
        int bNumerator;
        int denominator;

        denominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        aNumerator = a.getNumerator() * (denominator / a.getDenominator());
        bNumerator = b.getNumerator() * (denominator / b.getDenominator());
        Fraction result = new Fraction(aNumerator + bNumerator, denominator);
        reduce(result);
        return result;
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        int aNumerator;
        int bNumerator;
        int denominator;

        denominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        aNumerator = a.getNumerator() * (denominator / a.getDenominator());
        bNumerator = b.getNumerator() * (denominator / b.getDenominator());

        Fraction result = new Fraction(aNumerator - bNumerator, denominator);
        reduce(result);
        return result;
    }

    public static Fraction multiplication(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.getNumerator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
        reduce(result);
        return result;
    }

    public static Fraction division(Fraction a, Fraction b) {
        Fraction result = new Fraction(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());
        reduce(result);
        return result;
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
