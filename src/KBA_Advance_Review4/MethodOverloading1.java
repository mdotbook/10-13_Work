package KBA_Advance_Review4;

class Invoice {
    // (1) total for 2 items
    double calculateTotal(double item1, double item2) {
        return item1 + item2;
    }

    // (2) total for 3 items
    double calculateTotal(double item1, double item2, double item3) {
        return item1 + item2 + item3;
    }

    // (3) total for array of items
    double calculateTotal(double[] items) {
        double total = 0;
        for(double item : items) total += item;
        return total;
    }
}

public class MethodOverloading1 {
    public static void main(String[] args) {
        Invoice inv = new Invoice();

        System.out.println("Total 2 items: " + inv.calculateTotal(100, 50));
        System.out.println("Total 3 items: " + inv.calculateTotal(100, 50, 25));
        double[] items = {100, 50, 25, 10};
        System.out.println("Total array items: " + inv.calculateTotal(items));
    }
}

