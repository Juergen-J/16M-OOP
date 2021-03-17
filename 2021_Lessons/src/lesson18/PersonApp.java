package lesson18;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person[] persArr = {
                new Person(1982, "Person1"),
                new Person(1983, "Person2"),
                new Person(1984, "Person3"),
                new Person(1985, "Person4"),
                new Person(1986, "Person5"),
                new Person(1987, "Person6"),
                new Person(1988, "Person7"),
                new Person(1989, "APerson8")
        };

        Arrays.sort(persArr);
        print(persArr);
    }

    public static void print(Person[] arr) {
        for (Person p : arr) {
            System.out.println(p);

        }
    }
}
