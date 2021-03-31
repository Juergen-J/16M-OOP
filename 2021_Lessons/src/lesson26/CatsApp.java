package lesson26;

import java.util.*;

public class CatsApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Ma", 4, 'F'),
                new Cat("Da", 5, 'F'),
                new Cat("Fa", 4, 'M'),
                new Cat("Ka", 3, 'D'),
                new Cat("La", 2, 'M'),
                new Cat("Va", 7, 'M'),
                new Cat("Wa", 1, 'F'),
                new Cat("Wa", 1, 'F'),
                new Cat("Wa", 1, 'F')
        };

        HashSet<Cat> catsSet = new HashSet<>(Arrays.asList(cats));
        printCats(catsSet);
        boolean res = catsSet.add(new Cat("Ma", 4, 'F'));

        LinkedHashSet<Cat> catsLSet = new LinkedHashSet<>(Arrays.asList(cats));
        printCats(catsLSet);


    }

    private static void printCats(Set<Cat> catsSet) {
        for (Cat c : catsSet) {
            System.out.println(c);
        }
        System.out.println("****************************");
    }
}
