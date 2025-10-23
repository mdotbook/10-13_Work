package KBA_Advance_Review3;

abstract class Shape {
    public abstract double area(); // (1) abstract method
}

class Circle extends Shape {
    private double radius; // (2)
    public Circle(double radius) { this.radius = radius; } // (3)

    @Override
    public double area() { // (4) overridden method
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height; // (5)
    public Rectangle(double w, double h) { width = w; height = h; } // (6)

    @Override
    public double area() { // (7)
        return width * height;
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5); // (8)
        Shape s2 = new Rectangle(3,4); // (9)

        System.out.println("Circle area: " + s1.area()); // (10)
        System.out.println("Rectangle area: " + s2.area()); // (11)
    }
}
