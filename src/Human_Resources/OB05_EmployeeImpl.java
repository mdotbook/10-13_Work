package Human_Resources;

public class OB05_EmployeeImpl
{
    public static void main(String args[])
    {
        /* Create two objects using constructor */
        OB05_Employee empOne = new OB05_Employee("James Smith");
        OB05_Employee empTwo = new OB05_Employee("Mary Anne");


        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }

}
