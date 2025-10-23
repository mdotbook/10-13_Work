package KBA_Advance_Review1;

public class Program1_Helloable
{
    // 1. Define the interface (a "contract") with one action
    interface Helloable {     // (1) interface declaration
        void sayHello();  // (2) method signature (no body)
    }

    static class Kid implements Helloable {
        String name;
        Kid(String name) {  // (4) constructor
            this.name=name;  // (5) save the name

        }
        @Override
        public void sayHello() {  // (6) implement the method
            System.out.println("Hi! I'm" + name + " - nice to meet you!");
        }

    }

    public static void main(String[] args) {
        Kid k = new Kid(" Mike ");  // (8) create a Kid object
        k.sayHello();  // (9) call the interface method
    }
}
