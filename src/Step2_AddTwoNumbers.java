public class Step2_AddTwoNumbers
{
    public static void main(String[] args) {
        // (1) Call static method with two integer arguments
        add(3, 4); // expecting 3 + 4 = 7
    }

    // (2) static method with parameters
    public static void add(int a, int b) {
        int result = a + b; // (3) compute sum
        System.out.println(a + " + " + b + " = " + result); // (4) print result
    }

}
