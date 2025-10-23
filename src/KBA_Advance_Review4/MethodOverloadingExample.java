package KBA_Advance_Review4;

class Calculator {
    // (1) add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // (2) add three numbers (overloaded method)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // (3) add two double numbers (overloaded by type)
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // (4) create object

        System.out.println("2 + 3 = " + calc.add(2, 3)); // (5) calls first method
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3)); // (6) calls second method
        System.out.println("2.5 + 3.5 = " + calc.add(2.5, 3.5)); // (7) calls third method
    }
}

