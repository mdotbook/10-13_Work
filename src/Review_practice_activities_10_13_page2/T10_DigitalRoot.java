package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class T10_DigitalRoot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               // (1)
        System.out.print("Enter a positive integer: ");    // (2)
        int n = sc.nextInt();                              // (3)

        // (4) repeat until n is a single digit
        while (n >= 10) {
            int sum = 0;                                   // (5) sum digits
            while (n > 0) {                                // (6) extract digits
                sum += n % 10;                             // (7) add last digit
                n /= 10;                                   // (8) drop last digit
            }
            n = sum;                                       // (9) new number = sum of digits
        }

        System.out.println("Digital root (single digit) = " + n); // (10)
        sc.close();

    }
}
