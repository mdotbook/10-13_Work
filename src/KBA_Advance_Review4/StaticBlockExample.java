package KBA_Advance_Review4;

class Demo {
    static String greeting; // (1) static variable

    static { // (2) static block runs once when class is loaded
        greeting = "Hello, World!";
        System.out.println("Static block executed");
    }
}

public class StaticBlockExample {
    public static void main(String[] args) {
        System.out.println(Demo.greeting); // (3) access static variable
    }
}

