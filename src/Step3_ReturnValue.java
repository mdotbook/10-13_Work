public class Step3_ReturnValue
{
    public static void main(String[] args) {
        // (1) Call static method that returns an int
        int s = sum(5, 6); // (2) capture return value
        System.out.println("Sum returned: " + s); // (3) print the returned value
    }

    // (4) public static method returns an int
    public static int sum(int a, int b) {
        return a + b; // (5) return the result to the caller
    }

}
