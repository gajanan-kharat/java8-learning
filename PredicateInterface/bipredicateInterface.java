package PredicateInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

class Employee1 {
    String name;
    String department;
    double salary;

    Employee1(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}

public class bipredicateInterface {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("Alice", "HR", 50000));
        employees.add(new Employee1("Bob", "IT", 80000));
        employees.add(new Employee1("Charlie", "Finance", 60000));
        employees.add(new Employee1("Diana", "IT", 90000));

        // BiPredicate to check if the employee belongs to IT and has a salary above 75,000
        BiPredicate<Employee1, Double> isHighEarningIT = (employee, salary) ->
                employee.department.equals("IT") && employee.salary > salary;

        // Filtering employees who belong to IT and have a salary above 75,000
        for (Employee1 emp : employees) {
            if (isHighEarningIT.test(emp, 75000.0)) {
                System.out.println(emp);
            }
        }
    }
}

