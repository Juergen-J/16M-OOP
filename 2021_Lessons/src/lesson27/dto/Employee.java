package lesson27.dto;

public abstract class Employee extends Person {

    String company;
    double baseSalary;
    double totalSalary = 0.0;

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        if (company != null)
            this.company = company;
        else
            this.company = "Not defined";
        this.baseSalary = baseSalary;
    }

    public Employee() {
        this.company = "Not defined";
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null)
            this.company = company;
        else
            System.out.println("Wrong company");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0)
            this.baseSalary = baseSalary;
        else
            System.out.println("Wrong base salary");
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", company=" + company + ", baseSalary="
                + baseSalary + "]";
    }

}
