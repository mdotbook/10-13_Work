package Human_Resources;

public class Task6_RaiseSalary
{

        // (A) Using original OB05_Employee class structure from your base
        static class OB05_Employee {
            String name;       // (1) name of employee
            int age;           // (2) age
            String designation;// (3) designation
            double salary;     // (4) salary

            // (5) constructor sets name
            public OB05_Employee(String name) {
                this.name = name;
            }

            // (6) setter methods (same as your base)
            public void empAge(int empAge) { age = empAge; }
            public void empDesignation(String empDesig) { designation = empDesig; }
            public void empSalary(double empSalary) { salary = empSalary; }

            // (7) NEW: method to raise salary by a percentage
            public void raiseSalary(double percent) {
                // (7a) compute increase (percent e.g., 5.0 means 5%)
                double increase = salary * (percent / 100.0);
                // (7b) add to salary
                salary += increase;
                // (7c) optionally notify (we will print in main too)
            }

            // (8) print details
            public void printEmployee() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Designation: " + designation);
                System.out.println("Salary: " + salary);
            }
        }

        public static void main(String[] args) {
            // (9) Create employee and set initial data
            OB05_Employee emp = new OB05_Employee("Ava");
            emp.empAge(30);
            emp.empDesignation("Developer");
            emp.empSalary(50000.0);

            // (10) Print before raise
            System.out.println("--- Before raise ---");
            emp.printEmployee();

            // (11) Give a 10% raise
            emp.raiseSalary(10.0); // 10 percent

            // (12) Print after raise
            System.out.println("\n--- After 10% raise ---");
            emp.printEmployee();
        }


}
