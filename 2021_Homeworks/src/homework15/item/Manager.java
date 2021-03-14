package homework15.item;

import java.util.Objects;

public class Manager extends Employee {
    int grade; //– позиционный уровень(в диапазоне от 1 - 4).

    public Manager() {
    }

    public Manager(String name, long id, int age, String company, double baseSAlary, int grade) {
        super(name, id, age, company, baseSAlary);
        if (grade > 0 && grade < 5)
            this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 5)
            this.grade = grade;
        else
            System.out.println("Wrong enter");
    }

    @Override
    public double calcSalary() {
        return getBaseSAlary() * grade;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "company='" + company + '\'' +
                ", baseSAlary=" + baseSAlary +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return grade == manager.grade;
    }
}
