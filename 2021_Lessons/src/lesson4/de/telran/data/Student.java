package lesson4.de.telran.data;

public class Student {
    public String firstName;
    public String lastName;
    static int count = 20210000;
    public int studentID;
    public int age;
    public double middleRating;


    public Student() {
        this.studentID = count;
        count++;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentID = count;
        count++;
    }

    public String toDisplay() {
        return "-**STUDENT INFO**-" +
                "\n Student name: " + firstName + " " + lastName +
                "\n Age: " + age +
                "\n ID: " + studentID +
                "\n Rating: " + middleRating;
    }
}
