package KBA_Advance_Review1;

import java.util.ArrayList;
import java.util.List;

public class Program6_SellableShop
{
    interface Sellable {
        String getName();
        double getPrice();
    }
    static class Book implements Sellable {
        String title;
        double price;

        Book(String title, double price) {
            this.title=title;
            this.price=price;
        }
        @Override
        public String getName() {
            return title;
        }
        @Override
        public double getPrice() {
            return price;
        }
    }
    static class Game implements Sellable {
        String name;
        double price;

        Game(String name, double price) {
            this.name=name;
            this.price=price;
        }
        @Override
        public String getName() {
            return name;
        }
        @Override
        public double getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        List<Sellable> shop = new ArrayList<>(); // (20)
        shop.add(new Book("Magic Trees", 12.99)); // (21)
        shop.add(new Game("Space Adventure", 29.99)); // (22)
        shop.add(new Book("Ocean Tales", 8.50));  // (23)

        double total = 0;                          // (24)
        System.out.println("Shop items:");        // (25)
        for (Sellable s : shop) {                 // (26)
            System.out.printf("- %s : $%.2f%n", s.getName(), s.getPrice()); // (27)
            total += s.getPrice();                // (28)
        }
        System.out.printf("Total price: $%.2f%n", total); // (29)
    }

}
