package Pre_SBA;

public class Task3_PalindromeNumber
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);//Scanner

        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // Read input
        int original = num; // Store original number
        int reverse = 0;  // Initialize reverse

        while (num > 0) {  // Reverse the number
            int digit = num % 10;  // Get last digit
            reverse = reverse * 10 + digit;  // Build reverse
            num /= 10;  // remove last digit
        }
        if (reverse == original) {  // Check palindrome
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }


}
