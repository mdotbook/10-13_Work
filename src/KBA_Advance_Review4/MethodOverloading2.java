package KBA_Advance_Review4;

class Employee {
    // (1) manager bonus
    double calculateBonus(double base) {
        return base * 0.20;
    }

    // (2) developer bonus
    double calculateBonus(double base, double extra) {
        return (base + extra) * 0.10;
    }

    // (3) hourly employee bonus
    double calculateBonus(int hours, double rate) {
        return hours * rate * 0.05;
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println("Manager bonus: " + emp.calculateBonus(5000));
        System.out.println("Developer bonus: " + emp.calculateBonus(4000, 500));
        System.out.println("Hourly employee bonus: " + emp.calculateBonus(100, 20));
    }
}
