package lesson27.dto;

public class SalesMan extends Employee {

    double totalSales;
    int bonus;

    public SalesMan(String name, long id, int age, String company, double baseSalary, double totalSales, int bonuse) {
        super(name, id, age, company, baseSalary);
        setTotalSales(totalSales);
        setBonus(bonuse);
        totalSalary = baseSalary + (totalSales * ((double) bonus / 100));
    }

    public SalesMan() {
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales > 0)
            this.totalSales = totalSales;
        else
            System.out.println("Wrong total sales");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus > 0)
            this.bonus = bonus;
        else
            System.out.println("Wrong bonuse");
    }

    @Override
    public String toString() {
        return "SalesMan [company=" + company + ", baseSalary=" + baseSalary + ", name=" + name + ", id=" + id
                + ", age=" + age + ", totalSales=" + totalSales + ", bonuse=" + bonus + "]";
    }


}
