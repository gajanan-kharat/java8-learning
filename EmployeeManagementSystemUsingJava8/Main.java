package EmployeeManagementSystemUsingJava8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service ems = new Service();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee by ID");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. List Employees");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1: // Add Employee
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    ems.Addemployee(new Employee(id, name, department));
                    break;

                case 2: // Get Employee by ID
                    System.out.print("Enter Employee ID: ");
                    int searchId = scanner.nextInt();
                    ems.getEmployeeById(searchId)
                            .ifPresentOrElse(
                                    emp -> System.out.println("Employee Found: " + emp),
                                    () -> System.out.println("Employee not found.")
                            );
                    break;

                case 3: // Update Employee
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Department: ");
                    String newDepartment = scanner.nextLine();
                    if (ems.updateEmployee(updateId, newName, newDepartment)) {
                        System.out.println("Employee updated successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4: // Delete Employee
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    if (ems.deleteEmployee(deleteId)) {
                        System.out.println("Employee deleted successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5: // List Employees
                    System.out.println("Employees:");
                    ems.listEmployees().forEach(System.out::println);
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
