package lesson27.interfaces;

import lesson27.dto.Employee;

import java.util.List;

public interface ICompany {
    boolean hireEmployee(Employee emp);

    Employee fireEmployee(long id);

    Employee setEmployeeSalary(long id, double salary);

    double getCompanyProfit();

    double getCompanyExpenses();

    int numberOfEmployees();

    Employee findById(long id);

    List<Employee> getEmployeesWithSalary(double start, double finish);

    List<Employee> getFiredEmployees();


}
