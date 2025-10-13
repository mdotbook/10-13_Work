package Review_practice_activities_10_13_page1;

import java.util.Scanner;

public class SumEvenArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {  // (1) check even
                sum += arr[i];       // (2) add to sum
            }
        }

        System.out.println("Sum of even elements = " + sum);
        sc.close();

    }
}
