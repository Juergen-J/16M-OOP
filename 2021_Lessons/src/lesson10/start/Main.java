package lesson10.start;

import lesson10.calculator.Math;
import lesson10.data.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction myFirstFraction = new Fraction(3, 5);
        Fraction myLastFraction = new Fraction(5, 8);
        Fraction result = Math.addition(myFirstFraction, myLastFraction);
        System.out.println(result);
//        System.out.println(myFirstFraction);
    }
}
