package Compositions;

public class Garage
{
    Car[] cars;

    Garage(Car[] cars) {
        this.cars = cars;
    }

    void mostExpensiveCar() {  // find most expensive car
        if (cars.length == 0) return;  // check empty
        Car max = cars[0];  // aasume first is max
        for (Car c : cars) {  // loop
            if (c.price > max.price) {  // compare
                max = c;  // update max
            }
        }
        System.out.printf("Most Expensive Car: %s, Price: %.2f%n", max.brand, max.price);
    }



}
