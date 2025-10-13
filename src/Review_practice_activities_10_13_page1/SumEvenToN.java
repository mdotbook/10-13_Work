package Review_practice_activities_10_13_page1;

import java.util.Scanner;

public class SumEvenToN
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // (1) Scanner
        System.out.print("Enter N: ");       // (2) Prompt N
        int N = sc.nextInt();
        int sum = 0;                         // (3) Initialize sum

        for (int i = 1; i <= N; i++) {      // (4) Loop 1 to N
            if (i % 2 == 0) {               // (5) Check even
                sum += i;                    // (6) Add even number
            }
        }

        System.out.println("Sum of even numbers = " + sum); // (7) Print
        sc.close();                         // (8) Close scanner

    }
}
