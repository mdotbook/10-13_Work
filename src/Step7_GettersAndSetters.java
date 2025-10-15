public class Step7_GettersAndSetters
{
    static class Customer7 {
        // (1) Customer class with private fields, getters and setters
        private String name;
        private int age;

        public Customer7 (String name, int age) {
            this.name = name;
            this.age = age;
        }

        // (5) getter for name
        public String getName () {
            return name;
        }

        // (6) setter for name
        public void setName (String name) {
            this.name = name; //(6a) directly assign (no validation yet)

        }

        // (7) getter for age
        public int getAge () {
            return age;
        }

        // (8) setter for age
        public void setAge (int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Customer7 c = new Customer7( " Nia ", 10);
        System.out.println( " Before: " + c.getName() + " - age " + c.getAge());

        // (11) change values using setters
        c.setName(" Nina ");
        c.setAge(11);

        System.out.println("After: " + c.getName() + " - age " + c.getAge());
    }
}
