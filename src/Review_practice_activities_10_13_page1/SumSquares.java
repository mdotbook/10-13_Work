package Review_practice_activities_10_13_page1;

import java.util.Scanner;

public class SumSquares
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i * i; // (1) add square of i
        }

        System.out.println("Sum of squares = " + sum);
        sc.close();

    }
}
