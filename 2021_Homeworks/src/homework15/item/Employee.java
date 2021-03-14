package homework15.item;

import java.util.Objects;

public abstract class Employee extends Person {
    String company;
    double baseSAlary;

    public Employee() {
    }

    public Employee(String name, long id, int age, String company, double baseSAlary) {
        super(name, id, age);
        this.company = company;
        this.baseSAlary = baseSAlary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getBaseSAlary() {
        return baseSAlary;
    }

    public void setBaseSAlary(double baseSAlary) {
        this.baseSAlary = baseSAlary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", baseSAlary=" + baseSAlary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public abstract double calcSalary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.baseSAlary, baseSAlary) == 0 && Objects.equals(company, employee.company);
    }

}
