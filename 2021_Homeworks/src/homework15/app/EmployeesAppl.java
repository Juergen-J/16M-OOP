package homework15.app;

import homework15.item.*;

public class EmployeesAppl {
    public static void main(String[] args) {

//                B) Помещаем все экземпляры в массив Employee[] emps
//        C) Напишите метод void printAllEmployees(emps) принимающий массив сотрудников и выводящий на консоль всех сотрудников(информацию о сотрудниках).
        Manager manager01 =
                new Manager("Manager1", 777777, 45, "Company", 4500.0, 4);
        Manager manager02 =
                new Manager("Manager2", 777776, 48, "Company", 4600.0, 1);
        Manager manager03 =
                new Manager("Manager3", 777778, 38, "Company", 4600.0, 3);
        SalesMan salesMan01 =
                new SalesMan("Sales-Man1", 777775, 25, "Company", 2564.0, 9999.0, 10);
        SalesMan salesMan02 =
                new SalesMan("Sales-Man2", 777774, 18, "Company", 1990.0, 100000.0, 5);
        SalesMan salesMan03 =
                new SalesMan("Sales-Man3", 777000, 28, "Company", 1990.0, 10000.0, 15);
        WageEmployee wageEmployee01 =
                new WageEmployee("Wage-Employee1", 777773, 23, "Company", 0.0, 40, 9.90);
        WageEmployee wageEmployee02 =
                new WageEmployee("Wage-Employee2", 777772, 50, "Company", 0.0, 20, 13.50);
        WageEmployee wageEmployee03 =
                new WageEmployee("Wage-Employee3", 756772, 40, "Company", 0.0, 40, 12.50);

        Employee[] emps = new Employee[]{manager01, manager02, manager03, salesMan01, salesMan02, salesMan03, wageEmployee01, wageEmployee02, wageEmployee03};
        printAllEmployees(emps);

        getSumSalaryAllEmployees(emps);

        double salary = 2500.0;
        printEmpsWithSalaryMoreThan(emps, salary);

        getСompanyRevenue(emps);
    }


    private static double getSumSalaryAllEmployees(Employee[] emps) {
        double result = 0.0;
        for (Employee e : emps) {
            result += e.calcSalary();
        }
        return result;
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee e : emps) {
            System.out.println(e);
        }
    }

    private static void printEmpsWithSalaryMoreThan(Employee[] emps, double salary) {
        for (Employee e : emps) {
            if (e.calcSalary() >= salary) {
                System.out.println(e);
            }
        }
    }

    private static double getСompanyRevenue(Employee[] emps) {
        double revenue = 0.0;
        for (Employee e : emps) {
            if (e instanceof SalesMan) {
                revenue += ((SalesMan) e).getTotalSales();
            }
        }
        return revenue;
    }

}
