package Pre_SBA;

public class Task4_SumEvenDigits
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); // (1) Scanner for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // (2) Read number

        int sum = 0; // (3) Initialize sum

        while(num > 0) { // (4) Loop through digits
            int digit = num % 10;      // (5) Extract last digit
            if(digit % 2 == 0) {       // (6) Check if digit is even
                sum += digit;          // (7) Add to sum
            }
            num /= 10;                  // (8) Remove last digit
        }

        System.out.println("Sum of even digits: " + sum); // (9) Output sum
    }

}
