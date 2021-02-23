package lesson8.inheritance;

public class University {
    public Person[] people;
    public int size;

    public University(int capacity) {
        people = new Person[capacity];
        size = 0;
    }

    public boolean adsPerson(Person person) {
        if (size < people.length) {
            people[size] = person;
            size++;
            return true;
        }
        return false;
    }

    public boolean deletePerson(Person person) {
        for (int i = 0; i < size; i++) {
            if (people[i].equals(person)) {
                people[i] = people[size - 1]; //students[i]=null
                //                students[size-1]=null;
                size--;
                return true;
            }
        }
        return false;
    }
}
