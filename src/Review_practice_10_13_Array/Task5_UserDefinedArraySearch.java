package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task5_UserDefinedArraySearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // fill array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found at index: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println(-999); // not found
        }

        sc.close();

    }
}
