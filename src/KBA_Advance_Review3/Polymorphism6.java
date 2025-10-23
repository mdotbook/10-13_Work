package KBA_Advance_Review3;

//abstract class Employee {
//    protected String name;
//    public Employee(String name) { this.name = name; }
//    public abstract double calculateSalary(); // (1)
//}
//
//class Manager extends Employee {
//    private double bonus;
//    public Manager(String name, double bonus) { super(name); this.bonus = bonus; }
//    @Override
//    public double calculateSalary() { return 5000 + bonus; }
//}
//
//class Developer extends Employee {
//    private double overtime;
//    public Developer(String name, double overtime) { super(name); this.overtime = overtime; }
//    @Override
//    public double calculateSalary() { return 4000 + overtime; }
//}
//
//class Intern extends Employee {
//    public Intern(String name) { super(name); }
//    @Override
//    public double calculateSalary() { return 1500; }
//}
//
//public class Polymorphism6 {
//    public static void main(String[] args) {
//        Employee[] staff = {
//                new Manager("Alice", 1000),
//                new Developer("Bob", 500),
//                new Intern("Charlie")
//        };
//        for(Employee e : staff) {
//            System.out.println(e.name + " salary: " + e.calculateSalary());
//        }
//    }
//}
