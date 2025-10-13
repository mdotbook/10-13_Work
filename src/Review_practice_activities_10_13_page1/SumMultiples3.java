package Review_practice_activities_10_13_page1;

import java.util.Scanner;

public class SumMultiples3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {   // (1) divisible by 3
                sum += i;       // (2) add to sum
            }
        }

        System.out.println("Sum of multiples of 3 = " + sum);
        sc.close();

    }
}
