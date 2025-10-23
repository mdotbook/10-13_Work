package Pre_SBA;

public class Task2_ReverseNumber
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); //Scanner for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read number

        int reverse = 0; // Initialize reverse

        while (num > 0) { // Loop until number is 0
            int digit = num % 10; // Extract last digit
            reverse = reverse * 10 + digit;  // Append digit to reverse
            num /= 10;  // Remove last digit
        }
        System.out.println("Reversed number: " + reverse);  //Output reversed
    }
}
