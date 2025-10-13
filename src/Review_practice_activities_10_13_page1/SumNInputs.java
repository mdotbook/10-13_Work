package Review_practice_activities_10_13_page1;

import java.util.Scanner;

public class SumNInputs
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers to sum? ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("Total sum = " + sum);
        sc.close();

    }
}
