package lesson8.inheritance;

public class StartApp {
    public static void main(String[] args) {
        Person st1 = new Student("Xz", "Ivanov", 19, "VAS2141");
        Student st2 = new Student("Max", "Masturman", 25, "VAS2121");
        Person tich1 = new Teacher("Teacher", "Tichkovich", 89, "TICH0001", 9999);
        Teacher tich2 = new Teacher("New MoD", "Punk", 16, "TICH0099", 4.5);
        Person worker1 = new Worker("Work", "Workovskiy", 45, "WOR156");
        Worker worker2 = new Worker("IRUS", "V", 36, "WOR789");

        University uni1 = new University(10);
        uni1.adsPerson(st1);
        uni1.adsPerson(st2);
        uni1.adsPerson(tich1);
        uni1.adsPerson(tich2);
        uni1.adsPerson(worker1);
        uni1.adsPerson(worker2);

        printShelf(uni1);
        insertionSortImperative(uni1);
        printShelf(uni1);
//        System.out.println(uni1.people[0].toString());


    }

    private static void insertionSortImperative(University persons) {
        for (int i = 1; i < persons.size; i++) {
            // временная переменная, которая хранит значение
            Person newElement = persons.people[i];
            // цикл начался не с нуля, а с единицы - location предыдущее МЕСТО от элемента массива
            int location = i - 1;
//            System.out.println("i или круг = " + i);
//            System.out.println(newElement);
//            System.out.println(persons[location]);
//            System.out.println("**");

            // пока значение от location больше значения элемента проверки
            while (location >= 0 && persons.people[location].getAge() > newElement.getAge()) {
//                System.out.println("Находимся в цикл while при i = " + i);
//                System.out.println(newElement);
//                System.out.println(input[location]);
//                System.out.println("++");
                // присвоить значению на котором был элемент проверки значение предыдущего
                persons.people[location + 1] = persons.people[location];
                location = location - 1;  // Декремент  location
            }
            persons.people[location + 1] = newElement;  // значению location+1 передаём значение из памяти
        }
    }


    public static void printShelf(University person) {
        for (int i = 0; i < person.size; i++) {
//            System.out.println("Person #" + i + 1 + ":");
            System.out.println(person.people[i].toString());
        }
    }


}
