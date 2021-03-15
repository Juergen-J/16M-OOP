package lesson16.app;

import lesson16.interfaces.*;
import lesson16.items.*;

public class App {
    public static void main(String[] args) {
        Animals[] anAr = {
                new Cat("kind of cat", "cats", "Cat"),
                new Cat("kind of cat", "cats", "Cat2"),
                new Dog("kind of dog", "dogs", "Dog"),
                new Dog("kind of dog", "dogs", "Dog2"),
                new Tuki("kind of tuki", "birds", "green", "Tuki"),
                new Tuki("kind of tuki", "birds", "green", "Tuki2")
        };


        printAllBarkable(anAr);
    }

    private static void printAllBarkable(Animals[] anAr) {
        for (Animals a : anAr) {
            if (a instanceof IBarkable) {
                System.out.println(a);
                ((IBarkable) a).bark();
            }
        }

    }


}
