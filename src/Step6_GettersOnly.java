public class Step6_GettersOnly
{
    // (1) Customer class with private fields and public getters
    static class Customer6 {
        private String name;  // (2) private: cannot be accessed directly outside class
        private int age;

        // (4) constructor to initialize fields
        public Customer6(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // (5) getter for name
        public String getName() {
            return name;
        }

        // (6) getter for age
        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        // (7) create a customer object
        Customer6 c = new Customer6(" Leo ",  12);

        // (9) read values using getters (no direct field access)
        System.out.println(" Customer: " + c.getName() + " - age " + c.getAge());
    }





}
