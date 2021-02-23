package lesson8.inheritance;

public class Student extends Person {
    private double rating;

    public Student() {
    }

    public Student(String firstName, String secondName, String uniId) {
        super(firstName, secondName, uniId);
        this.rating = 10;
    }

    void study() {
        System.out.println("Study");
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("I am student and can eat");
    }

    @Override
    public String toString() {
        return "Student: \n" + super.toString() +
                "\n Rating: " + rating;
    }
}
