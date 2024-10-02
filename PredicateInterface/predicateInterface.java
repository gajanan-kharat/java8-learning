package PredicateInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
class Employee {
    String name;
    int age;
    String department;

    Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}
public class predicateInterface {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, "HR"));
        employees.add(new Employee("Bob", 45, "IT"));
        employees.add(new Employee("Charlie", 25, "Finance"));
        employees.add(new Employee("Diana", 50, "IT"));

        // Predicate to check if the employee is above a certain age
        Predicate<Employee> isAdult = emp -> emp.age > 30;

        // Predicate to check if the employee is in the IT department
        Predicate<Employee> isInIT = emp -> emp.department.equals("IT");

        // Filtering employees who are adults
        List<Employee> adults = employees.stream()
                .filter(isAdult)
                .collect(Collectors.toList());

        System.out.println("Employees older than 30: " + adults);

        // Filtering employees who are in the IT department
        List<Employee> itEmployees = employees.stream()
                .filter(isInIT)
                .collect(Collectors.toList());

        System.out.println("Employees in IT department: " + itEmployees);

        // Combining predicates: Employees who are in IT and older than 40
        List<Employee> itAdults = employees.stream()
                .filter(isInIT.and(isAdult))
                .collect(Collectors.toList());

        System.out.println("IT employees older than 40: " + itAdults);
    }
}

