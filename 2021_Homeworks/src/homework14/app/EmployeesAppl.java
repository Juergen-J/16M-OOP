package homework14.app;

import homework14.item.Employee;
import homework14.item.Manager;
import homework14.item.SalesMan;
import homework14.item.WageEmployee;

public class EmployeesAppl {
    public static void main(String[] args) {

//                B) Помещаем все экземпляры в массив Employee[] emps
//        C) Напишите метод void printAllEmployees(emps) принимающий массив сотрудников и выводящий на консоль всех сотрудников(информацию о сотрудниках).
        Manager manager01 =
                new Manager("Manager1", 777777, 45, "Company", 4500.0, 4);
        Manager manager02 =
                new Manager("Manager2", 777776, 48, "Company", 4600.0, 3);
        SalesMan salesMan01 =
                new SalesMan("Sales-Man1", 777775, 25, "Company", 2564.0, 9999.0, 10);
        SalesMan salesMan02 =
                new SalesMan("Sales-Man2", 777774, 18, "Company", 1990.0, 100000.0, 5);
        WageEmployee wageEmployee01 =
                new WageEmployee("Wage-Employee1", 777773, 23, "Company", 0.0, 40, 9.90);
        WageEmployee wageEmployee02 =
                new WageEmployee("Wage-Employee2", 777772, 50, "Company", 0.0, 20, 12.50);

        Employee[] emps = new Employee[]{manager01, manager02, salesMan01, salesMan02, wageEmployee01, wageEmployee02};
        printAllEmployees(emps);
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee e : emps) {
            System.out.println(e);
        }
    }


}
