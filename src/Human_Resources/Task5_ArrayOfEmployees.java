package Human_Resources;

public class Task5_ArrayOfEmployees
{
    public static void main(String[] args) {
        // Create array of 3 employees
        OB05_Employee[] emps = new OB05_Employee[3];

        // Fill objects
        emps[0] = new OB05_Employee("Mia");
        emps[0].empAge(24);
        emps[0].empDesignation("Intern");
        emps[0].empSalary(30000);
        emps[1] = new OB05_Employee("Lucas");
        emps[1].empAge(30);
        emps[1].empDesignation("Developer");
        emps[1].empSalary(65000);
        emps[2] = new OB05_Employee("Sophia");
        emps[2].empAge(40);
        emps[2].empDesignation("Team Lead");
        emps[2].empSalary(90000);
        // (3) Loop to print all
        for (int i = 0; i < emps.length; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");
            emps[1].printEmployee();
        }
    }
}
