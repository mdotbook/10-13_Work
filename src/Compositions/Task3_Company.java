package Compositions;

public class Task3_Company {
    public static void main(String[] args) {


        Employee[] empArr = {
                new Employee("Alice", 60000),
                new Employee("Bob", 45000),
                new Employee("Charlie", 70000)
        };
        //  Create array
        Company comp = new Company(empArr);
        comp.displayHighSalary();
    }

}
