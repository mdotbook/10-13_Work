public class Step1_PrintHello
{
    public static void main(String[] args) {
        // (1) Call the static helper method to print a greeting
        printHello();
    }

    // (2) public static method -- can be called without creating an object
    public static void printHello() {
        System.out.println("Hello from printHello()!"); // (3) the message
    }

}
