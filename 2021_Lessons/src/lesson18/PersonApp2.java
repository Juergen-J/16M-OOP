package lesson18;

import lesson18.comparators.ComparatorByName;
import lesson18.comparators.ComparetorByYear;

import java.util.Arrays;
import java.util.Comparator;

public class PersonApp2 {
    public static void main(String[] args) {
        Person2[] arr = {
                new Person2(1982, "Person1"),
                new Person2(1983, "Person2"),
                new Person2(1984, "Person3"),
                new Person2(1985, "Person4"),
                new Person2(1986, "Person5"),
                new Person2(1987, "Person6"),
                new Person2(1988, "Person7"),
                new Person2(1989, "APerson8")
        };
        Comparator<Person2> comp = new ComparatorByName();

        Arrays.sort(arr, comp);
        print(arr);

        Arrays.sort(arr, new ComparetorByYear());
    }

    public static void print(Person2[] arr) {
        for (Person2 p : arr) {
            System.out.println(p);

        }
    }
}
