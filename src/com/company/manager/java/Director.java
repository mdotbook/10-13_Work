package com.company.manager.java;

import com.company.employee.Employee;

public class Director extends Employee {
    public void displaySalary() {
        this.salary = 10000; // allowed, protected accessible in subclass
        System.out.println("Director salary: " + this.salary);
    }
}
