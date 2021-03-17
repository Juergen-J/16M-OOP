package lesson18.comparators;

import lesson18.Person2;

import java.util.Comparator;

public class ComparetorByYear implements Comparator<Person2> {
    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o2.getBirthYear() - o1.getBirthYear();
    }
}
