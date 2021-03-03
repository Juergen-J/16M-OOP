package lesson10.data;

import lesson10.calculator.Math;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction Fraction(Fraction a, Fraction b, char arithmeticOperationSymbol) {
        Fraction result=new Fraction();
        switch (arithmeticOperationSymbol) {
            case '+':
//                return Math.addition(a, b);
//                result = Math.addition(a, b);
//                this.numerator = frResult.getNumerator();
//                this.denominator = frResult.getDenominator();
//                break;
//            case '-':
//                Fraction result = Math.subtract(a, b);

            default:
                break;
        }


        return a;
    }

    @Override
    public String toString() {
        return "Fraction{" + numerator +
                "/" + denominator +
                '}';
    }
}
