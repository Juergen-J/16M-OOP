package lesson4.de.telran.app;

import lesson4.de.telran.data.Student;

public class StartApp {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("good", "yes", 56);
        Student st3 = new Student();
        Student st4 = new Student();
//        System.out.println(st4.studentID);
//        System.out.println(st2.toDisplay());

//#1
        Student[] group = new Student[]{st1, st2, st3, st4};
        printInfo(group);
    }

    public static void printInfo(Student[] group) {
        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i].toDisplay());
        }
    }
}
