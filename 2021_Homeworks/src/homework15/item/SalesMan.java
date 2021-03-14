package homework15.item;

import java.util.Objects;

public class SalesMan extends Employee {
    double totalSales;
    int bonus;

    public SalesMan() {
    }

    public SalesMan(String name, long id, int age, String company, double baseSAlary, double totalSales, int bonus) {
        super(name, id, age, company, baseSAlary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "company='" + company + '\'' +
                ", baseSalary=" + baseSAlary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", totalSales=" + totalSales +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public double calcSalary() {
        return getBaseSAlary() + totalSales * (bonus / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesMan)) return false;
        if (!super.equals(o)) return false;
        SalesMan salesMan = (SalesMan) o;
        return Double.compare(salesMan.totalSales, totalSales) == 0 && bonus == salesMan.bonus;
    }

}
