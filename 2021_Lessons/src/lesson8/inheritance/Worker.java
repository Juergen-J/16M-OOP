package lesson8.inheritance;

public class Worker extends Person {
    private String skill;
    private double salary;

    public Worker() {
    }

    public Worker(String firstName, String secondName, int age, String uniId) {
        super(firstName, secondName, age, uniId);
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void eats() {
//        super.eats();
        System.out.println("I am rich");
    }

    void works() {
        System.out.println("I work");
    }

    @Override
    public String toString() {
        return "Worker:" + super.toString() + "\n I can:" + skill + "\n Salary: " + salary;
    }
}
