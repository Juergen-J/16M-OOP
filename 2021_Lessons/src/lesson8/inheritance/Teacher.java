package lesson8.inheritance;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(String firstName, String secondName, int age, String uniId, double salary) {
        super(firstName, secondName, age, uniId);
        this.salary = salary;
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
        return "Teacher:" + super.toString() + "\n Salary: " + salary;
    }
}
