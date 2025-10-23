package Pre_SBA;

public class Task9_SumOddPositionDigits
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); // (1) Scanner

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // (2) Read number

        int sum = 0;         // (3) Initialize sum
        int position = 1;    // (4) Initialize position

        while(num > 0) {             // (5) Loop through digits
            int digit = num % 10;    // (6) Extract last digit
            if(position % 2 != 0) {  // (7) Check odd position
                sum += digit;        // (8) Add to sum
            }
            num /= 10;               // (9) Remove last digit
            position++;              // (10) Increment position
        }

        System.out.println("Sum of digits at odd positions: " + sum); // (11)
    }
}

