package KBA_Advance_Review1;

public class Program2_ManyGreeters
{
    interface Greeter {
        void greet();
    }

    static class Robot implements Greeter {

        @Override
        public void greet() {
            System.out.println("Robot: Beep beep! I greet you politely.");
        }
    }
    static class Dog implements Greeter {
        @Override
        public void greet(){
            System.out.println("Dog: Woof! Happy to see you!");
        }
    }

    public static void main(String[] args) {
        Greeter r = new Robot();        // (7) use interface type
        Greeter d = new Dog();          // (8) same interface type
        r.greet();                      // (9)
        d.greet();

    }
}
