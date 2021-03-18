package homework18.app;

import homework18.comparators.*;
import homework18.data.Car;

import java.util.Arrays;

public class CarAppl {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1980, "Carrera", "Red", 256.0, 25_000.0),
                new Car(1990, "Barrera", "Black", 116.0, 125_000.0),
                new Car(1986, "Marrera", "Blue", 156.0, 25_000.0),
                new Car(1982, "Parrera", "White", 800.0, 8_000.0),
                new Car(2021, "Vallera", "Yellow", 60.0, 2_000.0),
                new Car(1999, "Makarrera", "Green", 112.0, 10_000.0),
                new Car(1956, "01-Arrera", "Grey", 250.0, 825_000.0),
                new Car(1994, "Mozarrera", "Purple", 180.0, 25_000.0),
                new Car(2000, "Arrera", "Red", 700.0, 255_000.0),
                new Car(2010, "Irrera", "Pink", 400.0, 5_000.0)
        };
//A
        display(cars);

//        Arrays.sort(cars);
//        display(cars);
//B
//        Arrays.sort(cars, new ComparatorByColour());
//        display(cars);
//
//        Arrays.sort(cars,new ComparatorByEngine());
//        display(cars);
//
//        Arrays.sort(cars,new ComparatorByPrice());
//        display(cars);
//
        Arrays.sort(cars,new ComparatorByYear());
        display(cars);
//
//        Arrays.sort(cars,new ComparatorByYearAndPrice());
//        display(cars);

    }

    private static void display(Car[] arr) {
        for (Car e : arr) {
            System.out.println(e);
        }
        System.out.println("***********************************************************************");
    }
}
