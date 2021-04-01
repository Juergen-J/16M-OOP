package lesson27.model;

import lesson27.dto.Employee;
import lesson27.interfaces.ICompany;

import java.util.List;
import java.util.TreeSet;

public class Company implements ICompany {
    private String name;
    private String address;
    private TreeSet<Employee> emps = new TreeSet<>();
    private TreeSet<Employee> firedEmps = new TreeSet<>();


    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        int count = 1;
        String str = "Company name: " + name + "/n" + "Company address: " + address;
        for (Employee e : emps) {
            str += "==================" + count + "===============\n";
            str += "Company: " + e.getCompany() + "\n";
            str += "Employee id: " + e.getId() + "\n";
            str += "Name: " + e.getName() + "\n";
            str += "Salary: " + e.getBaseSalary() + "\n";
            count++;
        }
        return "";
    }

    @Override
    public boolean hireEmployee(Employee emp) {
        if (emp == null || firedEmps.contains(emp))
            return false;
        return emps.add(emp);
    }

    @Override
    public Employee fireEmployee(long id) {
        Employee temp = findById(id);
        if (temp != null) {
            emps.remove(temp);
            firedEmps.add(temp);
        }
        return null;
    }

    @Override
    public Employee setEmployeeSalary(long id, double salary) {
        return null;
    }

    @Override
    public double getCompanyProfit() {
        return 0;
    }

    @Override
    public double getCompanyExpenses() {
        return 0;
    }

    @Override
    public int numberOfEmployees() {
        return 0;
    }

    @Override
    public Employee findById(long id) {
        for (Employee e : emps) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeesWithSalary(double start, double finish) {
        return null;
    }

    @Override
    public List<Employee> getFiredEmployees() {
        return null;
    }
}
