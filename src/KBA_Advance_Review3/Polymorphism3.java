package KBA_Advance_Review3;


class Employee {
    protected String name;
    public Employee(String name) { this.name = name; } // (1)
    public double calculateSalary() { return 0; }      // (2) default
}

class Manager extends Employee {
    private double bonus;
    public Manager(String name, double bonus) { super(name); this.bonus = bonus; } // (3)
    @Override
    public double calculateSalary() { return 5000 + bonus; } // (4)
}

class Developer extends Employee {
    private double overtime;
    public Developer(String name, double overtime) { super(name); this.overtime = overtime; } // (5)
    @Override
    public double calculateSalary() { return 4000 + overtime; } // (6)
}

public class Polymorphism3 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Alice", 1000),
                new Developer("Bob", 500)
        }; // (7)

        for (Employee e : employees) { // (8)
            System.out.println(e.name + " salary: " + e.calculateSalary()); // (9)
        }
    }
}
