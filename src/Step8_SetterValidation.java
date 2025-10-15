public class Step8_SetterValidation
{
    static class Customer8 {
        private String name;
        private int age;

        public Customer8 (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        // (6) setter with validation for age
        public void setAge (int age) {
            if (age < 0 ) {  // (6a) invalid age
                System.out.println( " Invalid age: " + age + " . Age not changed.");
                return;
            }

            this.age = age;
        }
    }

    public static void main(String[] args) {
        Customer8 c = new Customer8(" Sam ", 20);
        System.out.println(" Initial age = " + c.getAge());

        c.setAge(-5);  // (9) try invalid age -> should be rejected
        System.out.println(" After invalid set attempt: age = " + c.getAge());

        c.setAge(21);  // (11) valid change
        System.out.println("After valid set: age = " + c.getAge());

    }
}
