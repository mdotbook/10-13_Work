package Review_practice_activities_10_13_page1;

import java.util.Scanner;

public class Sum1ToN
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // (1) Create scanner

        System.out.print("Enter N: ");      // (2) Prompt for N
        int N = sc.nextInt();               // (3) Read N

        int sum = 0;                        // (4) Initialize sum

        for (int i = 1; i <= N; i++) {     // (5) Loop from 1 to N
            sum += i;                       // (6) Add i to sum
        }

        System.out.println("Sum = " + sum); // (7) Print result
        sc.close();                         // (8) Close scanner

    }
}
