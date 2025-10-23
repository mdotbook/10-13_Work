package Compositions;

public class Company
{
    Employee[] employees;  // Array of employees

    Company(Employee[] employees) {  // constructor
        this.employees = employees;
    }

    void displayHighSalary() {  // display employees with salary > 50k
        System.out.println("Employees earning above $50,000: ");
        for (Employee e : employees) {  // for-each
            if (e.salary > 50000) {  // condition
                System.out.printf("Name: %s, Salary: %.2f%n", e.name, e.salary);
            }
        }
    }
}
