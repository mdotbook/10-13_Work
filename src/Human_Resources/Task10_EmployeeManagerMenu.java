package Human_Resources;

import java.util.ArrayList;
import java.util.Scanner;

public class Task10_EmployeeManagerMenu
{
    // (1) Reuse EmployeeSafe from Task9 but add raiseSalary method
    static class EmployeeSafe {
        private String name;
        private int age;
        private String designation;
        private double salary;

        public EmployeeSafe(String name) { this.name = name; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getDesignation() { return designation; }
        public double getSalary() { return salary; }
        public void setAge(int age) { this.age = age; }
        public void setDesignation(String designation) { this.designation = designation; }
        public void setSalary(double salary) { this.salary = salary; }

        // (2) raise salary by percent
        public void raiseSalary(double percent) {
            if (percent <= 0) return;
            salary += salary * (percent / 100.0);
        }

        public void printEmployeeShort(int index) {
            System.out.printf("[%d] %s, %s, $%.2f%n", index, name, designation, salary);
        }

        public void printEmployeeFull() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: $" + salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                     // (3) input
        ArrayList<EmployeeSafe> list = new ArrayList<>();// (4) store employees

        OB05_Employee[] emps = new OB05_Employee[3];

        emps[0] = new OB05_Employee("Mike");
        emps[0].empAge(24);
        emps[0].empDesignation("Intern");
        emps[0].empSalary(30000);
        emps[1] = new OB05_Employee("Mia");
        emps[1].empAge(30);
        emps[1].empDesignation("Developer");
        emps[1].empSalary(65000);
        emps[2] = new OB05_Employee("Mya");
        emps[2].empAge(40);
        emps[2].empDesignation("Team Lead");
        emps[2].empSalary(90000);

        while (true) {                                          // (5) menu loop
            printMenu();
            int choice = readInt(sc, "Choose option: ");
            switch (choice) {
                case 1:
                    addEmployee(sc, list);                      // (6)
                    break;
                case 2:
                    listEmployees(list);                        // (7)
                    break;
                case 3:
                    giveRaise(sc, list);                        // (8)
                    break;
                case 4:
                    averageSalary(list);                        // (9)
                    break;
                case 0:
                    System.out.println("Goodbye!"); sc.close(); // (10)
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void printMenu() {
        System.out.println("\nEmployee Manager Menu:");
        System.out.println("[1] Add employee");
        System.out.println("[2] List employees");
        System.out.println("[3] Give raise to an employee (by index)");
        System.out.println("[4] Average salary");
        System.out.println("[0] Exit");
    }

    // (11) safe integer read
    static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try { return Integer.parseInt(line); }
            catch (NumberFormatException e) { System.out.println("Please enter a valid integer."); }
        }
    }

    // (12) safe double read
    static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try { return Double.parseDouble(line); }
            catch (NumberFormatException e) { System.out.println("Please enter a valid number."); }
        }
    }

    static void addEmployee(Scanner sc, ArrayList<EmployeeSafe> list) {
        System.out.print("Enter name: ");
        String name = sc.nextLine().trim();
        int age = readInt(sc, "Enter age: ");
        System.out.print("Enter designation: ");
        String desig = sc.nextLine().trim();
        double salary = readDouble(sc, "Enter salary: ");
        EmployeeSafe e = new EmployeeSafe(name);
        e.setAge(age);
        e.setDesignation(desig);
        e.setSalary(salary);
        list.add(e);
        System.out.println("Employee added.");
    }

    static void listEmployees(ArrayList<EmployeeSafe> list) {
        if (list.isEmpty()) {
            System.out.println("No employees to show.");
            return;
        }
        System.out.println("Employees:");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).printEmployeeShort(i); // short summary
        }
    }

    static void giveRaise(Scanner sc, ArrayList<EmployeeSafe> list) {
        if (list.isEmpty()) { System.out.println("No employees."); return; }
        listEmployees(list);
        int idx = readInt(sc, "Enter employee index for raise: ");
        if (idx < 0 || idx >= list.size()) {
            System.out.println("Invalid index.");
            return;
        }
        double percent = readDouble(sc, "Enter raise percent (e.g., 5 for 5%): ");
        list.get(idx).raiseSalary(percent);
        System.out.println("Raise applied. New salary: $" + list.get(idx).getSalary());
    }

    static void averageSalary(ArrayList<EmployeeSafe> list) {
        if (list.isEmpty()) { System.out.println("No employees."); return; }
        double sum = 0.0;
        for (EmployeeSafe e : list) sum += e.getSalary();
        double avg = sum / list.size();
        System.out.printf("Average salary = $%.2f%n", avg);
    }

}
