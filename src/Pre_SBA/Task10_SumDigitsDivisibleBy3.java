package Pre_SBA;

public class Task10_SumDigitsDivisibleBy3 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); // (1) Scanner

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // (2) Read number

        int sum = 0; // (3) Initialize sum

        while(num > 0) {           // (4) Loop through digits
            int digit = num % 10;  // (5) Extract last digit
            if(digit % 3 == 0) {   // (6) Check divisibility by 3
                sum += digit;      // (7) Add to sum
            }
            num /= 10;             // (8) Remove last digit
        }

        System.out.println("Sum of digits divisible by 3: " + sum); // (9) Output sum
    }
}



