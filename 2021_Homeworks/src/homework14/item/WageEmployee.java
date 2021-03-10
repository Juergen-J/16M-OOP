package homework14.item;

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
}
