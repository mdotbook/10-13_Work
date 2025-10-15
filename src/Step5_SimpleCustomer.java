public class Step5_SimpleCustomer
{

    // (1) A tiny Customer class with public fields
    static class Customer5 {
        public String name; // (2) public field - accessible directly
        public int age; // (3) public field - accessible directly

        // (4) constructor to set fields
        public Customer5 (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // (5) create a customer and use public fields directly
        Customer5 c = new Customer5(" Ivy ", 6);
        System.out.println(" Customer: " + c.name + " - age " + c.age);
    }
}
