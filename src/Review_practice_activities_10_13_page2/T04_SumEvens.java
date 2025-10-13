package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class T04_SumEvens
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);              // (1)
        System.out.print("Enter N: ");                    // (2)
        int N = sc.nextInt();                             // (3)

        int sum = 0;                                      // (4)
        for (int i = 1; i <= N; i++) {                    // (5)
            if (i % 2 != 0) continue;                     // (6) skip odds
            sum += i;                                     // (7)
        }

        System.out.println("Sum of even numbers up to " + N + " = " + sum); // (8)
        sc.close();                                       // (9)

    }
}
