package com.company.employee;

public class Employee
{
    protected double salary; // accessible by other classes in same package
}

class Manager {
    public void showSalary() {
        Employee e = new Employee();
        e.salary = 5000; // allowed, same package
        System.out.println("Salary: " + e.salary);
    }

}
