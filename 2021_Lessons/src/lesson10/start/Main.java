package lesson10.start;

import lesson10.calculator.Math;
import lesson10.data.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction myFirstFraction = new Fraction(3, 8);
        Fraction myLastFraction = new Fraction(5, 8);
        Fraction additionResult = Math.addition(myFirstFraction, myLastFraction);
        Fraction subtractResult = Math.subtract(myFirstFraction, myLastFraction);
        Fraction multiplicationResult = Math.multiplication(myFirstFraction, myLastFraction);
        Fraction divisionResult = Math.division(myFirstFraction, myLastFraction);

        System.out.println();


    }
}
