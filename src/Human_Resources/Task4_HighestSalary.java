package Human_Resources;

public class Task4_HighestSalary
{
    public static void main(String[] args) {
        // Create 2 employees
        OB05_Employee e1 = new OB05_Employee(" Noah ");
        OB05_Employee e2 = new OB05_Employee(" Olivia ");

        // Set salaries
        e1.empSalary(70000);
        e2.empSalary(85000);

        if (e1.salary > e2.salary) {
            System.out.println(e1.name + " has the higher salary. ");

        } else
        {
            System.out.println(e2.name + " has the higher salary. ");
        }
    }

}
