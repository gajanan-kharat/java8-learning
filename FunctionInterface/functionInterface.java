package FunctionInterface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class functionInterface {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 75000));
        employees.add(new Employee("Charlie", 60000));

        // Define a Function that extracts the salary of an employee
        Function<Employee, Double> getSalary = employee -> employee.salary;

        // Use the Function to get the list of salaries
        List<Double> salaries = employees.stream()
                .map(getSalary)  // Use Function to map Employee -> Salary
                .collect(Collectors.toList());

        // Print the list of salaries
        System.out.println(salaries);  // Output: [50000.0, 75000.0, 60000.0]
    }
}

