package Pre_SBA;

public class Task8_SmallestDigit
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); // (1) Scanner

        System.out.print("Enter a number: ");

        int num = sc.nextInt(); // (2) Read number

        int min = 9; // (3) Initialize min

        while(num > 0) {       // (4) Loop through digits
            int digit = num % 10;     // (5) Extract last digit
            if(digit < min) {         // (6) Compare with min
                min = digit;          // (7) Update min if digit is smaller
            }
            num /= 10;                // (8) Remove last digit
        }

        System.out.println("Smallest digit: " + min); // (9) Output min
    }
}

