package lesson8.inheritance;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(String firstName, String secondName, String uniId) {
        super(firstName, secondName, uniId);
        setSalary(500_000);
    }

    void teaches() {
        System.out.println("Just do it!");
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("I have not time to eat");
    }

    @Override
    public String toString() {
        return "Teacher:" + super.toString();
    }
}
