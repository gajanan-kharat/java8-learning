package EmployeeManagementSystemUsingJava8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Service {
    List<Employee> employees;

    public Service() {
        this.employees = new ArrayList<>();
    }


    public List<Employee> listEmployees() {
        return new ArrayList<>(employees);
    }
    public Optional<Employee> getEmployeeById(int id) {
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst();
    }
    public boolean updateEmployee(int id, String name, String department) {
        Optional<Employee> employeeOpt = getEmployeeById(id);
        if (employeeOpt.isPresent()) {
            Employee employee = employeeOpt.get();
            employees.remove(employee);
            employees.add(new Employee(id, name, department));
            return true;
        }
        return false;
    }
    public boolean deleteEmployee(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }
    public void Addemployee(Employee emp){
        employees.add(emp);
        System.out.println("Successfully addd");
    }

}
