package lesson4.de.telran.dao;

import lesson4.de.telran.data.Student;

public class Group {
    public Student[] students;
    public int size;

    public Group(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public boolean addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteStudent(Student person) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(person)) {
                students[i] = students[size - 1]; //students[i]=null
                //                students[size-1]=null;
                size--;
                return true;
            }
        }

        return false;
    }
}
