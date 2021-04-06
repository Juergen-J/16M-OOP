package homework28.dto;

public class Manager extends Employee {
    int grade;

    public Manager(String name, long id, int age, String company, double baseSalary, int grade) {
        super(name, id, age, company, baseSalary);
        this.grade = grade;
    }

    public Manager() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "grade=" + grade +
                '}';
    }

    @Override
    public double calcSalary() {
        return baseSalary * grade;
    }
}
