package lesson27.appl;

import lesson27.dto.*;
import lesson27.model.Company;

public class CompanyAppl {
    public static void main(String[] args) {
        Employee m1 = new Manager("Ivanov", 1000, 23, "H&M", 1500, 3);
        Employee m2 = new Manager("Petrov", 1001, 28, "H&M", 1700, 2);
        Employee m3 = new Manager("Kuzin", 1008, 30, "H&M", 1900, 1);
        Employee sm1 = new SalesMan("Sidorov", 1002, 33, "H&M", 1500, 324300.9, 12);
        Employee sm2 = new SalesMan("Durov", 1900, 34, "H&M", 2000, 102999.99, 20);
        Employee sm3 = new SalesMan("Gurov", 1909, 44, "H&M", 2000, 1233999.99, 30);
        Employee we1 = new WageEmployee("Rogov", 1200, 34, "H&M", 0, 23, 13.54);
        Employee we2 = new WageEmployee("Pirogov", 1202, 36, "H&M", 0, 34, 14.9);
        Employee we3 = new WageEmployee("Permyakov", 1222, 38, "H&M", 0, 39, 14.9);
        Employee[] emps = new Employee[]{m1, m2, m3, sm1, sm2, sm3, we1, we2, we3};

        Company company = new Company("Company", "Address");
                System.out.println(company);
    }
}
