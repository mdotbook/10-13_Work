package Pre_SBA;

public class Task7_LargestDigit
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); // (1) Scanner

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // (2) Read number

        int max = 0; // (3) Initialize max

        while(num > 0) {       // (4) Loop through digits
            int digit = num % 10;     // (5) Extract last digit
            if(digit > max) {         // (6) Compare with max
                max = digit;          // (7) Update max if digit is larger
            }
            num /= 10;                // (8) Remove last digit
        }

        System.out.println("Largest digit: " + max); // (9) Output max
    }
}

