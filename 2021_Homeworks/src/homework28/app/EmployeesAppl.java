package homework28.app;

import homework28.dto.Employee;
import homework28.dto.SalesMan;

public class EmployeesAppl {
    public static void main(String[] args) {

        // TODO: 06.04.2021 лень печатать
//        Employee[] emps = new Employee[3];
//        getSumSalaryAllEmployees(emps);
//        double salary = 2000.0;
//        printEmpsWithSalaryMoreThan(emps, salary);
//        getСompanyRevenue(emps);
    }

    private static double getСompanyRevenue(Employee[] emps) {
        double companyRevenue = 0.0;
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] instanceof SalesMan)
                companyRevenue += ((SalesMan) emps[i]).getTotalSales();
        }
        return companyRevenue;
    }

    private static void printEmpsWithSalaryMoreThan(Employee[] emps, double salary) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].calcSalary() >= salary)
                System.out.println(emps[i]);
        }
    }

    private static double getSumSalaryAllEmployees(Employee[] emps) {
        double salarySum = 0.0;
        for (int i = 0; i < emps.length; i++) {
            salarySum += emps[i].calcSalary();
        }
        return salarySum;
    }


}
