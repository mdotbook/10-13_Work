package Review_practice_activities_10_13_page1;

import java.util.Scanner;

public class SumOddToN
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // (1)
        System.out.print("Enter N: ");       // (2)
        int N = sc.nextInt();
        int sum = 0;                         // (3)

        for (int i = 1; i <= N; i++) {      // (4)
            if (i % 2 != 0) {               // (5) check odd
                sum += i;                    // (6)
            }
        }

        System.out.println("Sum of odd numbers = " + sum); // (7)
        sc.close();                         // (8)

    }
}
