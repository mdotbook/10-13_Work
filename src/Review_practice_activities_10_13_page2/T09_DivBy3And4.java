package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class T09_DivBy3And4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               // (1)
        System.out.print("Enter an integer: ");            // (2)
        int n = sc.nextInt();                              // (3)

        boolean by3 = (n % 3 == 0);                        // (4)
        boolean by4 = (n % 4 == 0);                        // (5)

        if (by3 && by4) {
            System.out.println(n + " is divisible by both 3 and 4."); // (6)
        } else if (by3) {
            System.out.println(n + " is divisible by 3 only.");      // (7)
        } else if (by4) {
            System.out.println(n + " is divisible by 4 only.");      // (8)
        } else {
            System.out.println(n + " is divisible by neither 3 nor 4."); // (9)
        }

        sc.close();

    }
}
