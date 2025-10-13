package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task4_SearchAndCount
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 7, 1, 9, 5, 7, 9};

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found at index: " + i);
                count++;
            }
        }

        System.out.println("Total occurrences: " + count);

        sc.close();

    }
}
