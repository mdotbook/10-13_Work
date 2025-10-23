package KBA_Advance_Review4;

class Circle {
    static final double PI = 3.14159; // (1) static constant
    double radius;

    Circle(double radius) { // (2) constructor
        this.radius = radius;
    }

    double area() { // (3) use static constant
        return PI * radius * radius;
    }
}

public class StaticConstantExample {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of circle: " + c.area());
    }
}

