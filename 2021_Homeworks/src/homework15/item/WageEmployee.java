package homework15.item;

import java.util.Objects;

public class WageEmployee extends Employee {
    int hours;
    double wage;

    public WageEmployee() {
    }

    public WageEmployee(String name, long id, int age, String company, double baseSAlary, int hours, double wage) {
        super(name, id, age, company, baseSAlary);
        this.hours = hours;
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "company='" + company + '\'' +
                ", baseSAlary=" + baseSAlary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    @Override
    public double calcSalary() {
        return hours * wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WageEmployee)) return false;
        if (!super.equals(o)) return false;
        WageEmployee that = (WageEmployee) o;
        return hours == that.hours && Double.compare(that.wage, wage) == 0;
    }

}
