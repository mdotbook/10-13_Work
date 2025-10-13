package Review_practice_activities_10_13_page1;

import java.util.Scanner;

public class SumUntilZero
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
            sum += num; // (1)
        } while (num != 0);

        System.out.println("Total sum = " + sum);
        sc.close();

    }
}
