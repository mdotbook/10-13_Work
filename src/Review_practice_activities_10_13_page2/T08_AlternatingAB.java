package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class T08_AlternatingAB
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               // (1)
        System.out.print("Enter N: ");                     // (2)
        int N = sc.nextInt();                              // (3)

        for (int i = 1; i <= N; i++) {                     // (4)
            if (i % 2 == 1) {                              // (5)
                System.out.println(i + ": A");             // (6)
            } else {
                System.out.println(i + ": B");             // (7)
            }
        }

        sc.close();

    }
}
