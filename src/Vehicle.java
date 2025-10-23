public class Vehicle
{
    int wheels;

    public void move() {
        System.out.println("Vehicle is moving with " + wheels + " wheels.");
    }

    public void engineType() {
    }
}

// Child class
class Car extends Vehicle {
    int doors;

    public void honk() {
        System.out.println("Car honks! Beep Beep!");
    }
}

