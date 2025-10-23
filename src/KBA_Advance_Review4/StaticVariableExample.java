package KBA_Advance_Review4;

class Counter {
    static int count = 0; // (1) static variable shared by all objects

    Counter() { // (2) constructor
        count++; // (3) increment count whenever a new object is created
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // (4) first object
        Counter c2 = new Counter(); // (5) second object
        Counter c3 = new Counter(); // (6) third object

        System.out.println("Number of Counter objects created: " + Counter.count); // (7) shared variable
    }
}
