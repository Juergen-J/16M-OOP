package lesson4.de.telran.app;

import lesson4.de.telran.dao.Group;
import lesson4.de.telran.data.Student;

public class NewStartApp {
    public static void main(String[] args) {
        Group group17 = new Group(20);
        Student st1 = new Student("Nick", "Kazj", 56);
        Student st2 = new Student("Dino", "K", 6);
        Student st3 = new Student("Elvis", "Nepres", 88);
        Student st4 = new Student("Ivan", "Dorf", 18);

        group17.addStudent(st1);
        group17.addStudent(st2);
        group17.addStudent(st3);
        group17.addStudent(st4);

        group17.deleteStudent(st2);
        System.out.println(group17.students[0].firstName);
    }


}
