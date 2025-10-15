package Human_Resources;

public class Task7_AverageSalary {
    static class OB05_Employee {
        String name;
        int age;
        String designation;
        double salary;

        public OB05_Employee(String name) { this.name = name; }
        public void empAge(int empAge) { age = empAge; }
        public void empDesignation(String empDesig) { designation = empDesig; }
        public void empSalary(double empSalary) { salary = empSalary; }
        public void printEmployee() {
            System.out.println(name + " - " + designation + " - $" + salary);
        }
    }

    public static void main(String[] args) {
        // (1) create employees array and fill details
        OB05_Employee[] emps = new OB05_Employee[3];
        emps[0] = new OB05_Employee("Emma"); emps[0].empSalary(60000);
        emps[1] = new OB05_Employee("Noah"); emps[1].empSalary(75000);
        emps[2] = new OB05_Employee("Olivia"); emps[2].empSalary(90000);

        // (2) compute sum
        double sum = 0.0; // (3)
        for (int i = 0; i < emps.length; i++) {
            sum += emps[i].salary; // (4)
        }

        // (5) compute average (guard against zero-length)
        double average = emps.length > 0 ? sum / emps.length : 0.0; // (6)
        System.out.println("Average salary = $" + average); // (7)
    }
}
