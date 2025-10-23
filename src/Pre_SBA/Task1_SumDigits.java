package Pre_SBA;

public class Task1_SumDigits
{
    public static void main(String[] args) {
        // Import Scanner for user input
        java.util.Scanner sc = new java.util.Scanner(System.in);

        //Ask user for input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Read the number

        int sum = 0;  // Initialize sum

        // Loop to extract each digit
        while(num > 0) {
               int digit = num % 10;  // Get last digit using modulus
               sum += digit;  // Add digit to sum = sum 4+digit5=9+2
               num /= 10;  // Remove last digit 2
        }

        // Display the sum of digits
        System.out.println("Sum of digits: " + sum);  // Output results
    }
}
