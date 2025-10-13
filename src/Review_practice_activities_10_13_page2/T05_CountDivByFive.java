package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class T05_CountDivByFive
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // (1)
        System.out.print("Enter A (start): ");              // (2)
        int A = sc.nextInt();
        System.out.print("Enter B (end): ");                // (3)
        int B = sc.nextInt();

        int count = 0;                                      // (4)
        for (int i = A; i <= B; i++) {                      // (5)
            if (i % 5 == 0) count++;                       // (6)
        }

        System.out.println("Count divisible by 5 between " + A + " and " + B + " = " + count); // (7)
        sc.close();

    }
}
