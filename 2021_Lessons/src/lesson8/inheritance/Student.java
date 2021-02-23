package lesson8.inheritance;

public class Student extends Person {
    private double rating;
    private boolean universityPaid = false;

    public Student() {
    }

    public Student(String firstName, String secondName, int age, String uniId) {
        super(firstName, secondName, age, uniId);
        this.rating = 10;
    }

    public boolean isUniversityPaid() {
        return universityPaid;
    }

    public void setUniversityPaid(boolean universityPaid) {
        this.universityPaid = universityPaid;
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
        return "Student:" + super.toString() +
                "\n Rating: " + rating
                + "\n Paid university:" + universityPaid;
    }
}
