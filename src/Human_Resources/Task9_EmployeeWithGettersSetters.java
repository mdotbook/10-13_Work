package Human_Resources;

public class Task9_EmployeeWithGettersSetters
{
    // (1) safer Employee class with private fields
    static class EmployeeSafe {
        private String name;        // (2) private name
        private int age;            // (3) private age
        private String designation; // (4)
        private double salary;      // (5)

        // (6) constructor to set name
        public EmployeeSafe(String name) {
            this.name = name;
        }

        // (7) getters
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getDesignation() { return designation; }
        public double getSalary() { return salary; }

        // (8) setters
        public void setAge(int age) { this.age = age; }
        public void setDesignation(String designation) { this.designation = designation; }
        public void setSalary(double salary) { this.salary = salary; }

        // (9) helper to print employee data
        public void printEmployee() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        // (10) create and use EmployeeSafe
        EmployeeSafe e = new EmployeeSafe("Sophia");
        e.setAge(29);                   // (11) set age via setter
        e.setDesignation("Designer");   // (12)
        e.setSalary(72000.0);           // (13)

        // (14) read values via getters and print
        System.out.println(e.getName() + " - " + e.getDesignation() + " - $" + e.getSalary()); // (15)
        System.out.println("\nFull details:");
        e.printEmployee(); // (16)
    }

}
