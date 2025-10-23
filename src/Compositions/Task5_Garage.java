package Compositions;

public class Task5_Garage {
    public static void main(String[] args) {
        Car[] carArr = {
                new Car("Toyota", 25000),
                new Car("BMW", 55000),
                new Car("Audi", 60000)
        };

        Garage garage = new Garage(carArr);
        garage.mostExpensiveCar();
    }
}
