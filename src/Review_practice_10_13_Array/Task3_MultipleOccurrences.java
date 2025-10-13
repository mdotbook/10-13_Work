package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task3_MultipleOccurrences
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 7, 1, 9, 5, 7, 9}; // array with duplicates

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found at index: " + i); // print each index
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found"); // if number not in array
        }

        sc.close();

    }
}
