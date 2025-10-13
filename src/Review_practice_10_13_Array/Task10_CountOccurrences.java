package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task10_CountOccurrences
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 7, 4, 3, 6, 3};

        System.out.print("Enter number to count: ");
        int searchNum = sc.nextInt();
        int count = 0; // (1) initialize counter

        for (int i = 0; i < numbers.length; i++) { // (2) loop through array
            if (numbers[i] == searchNum) {          // (3) check match
                count++;                             // (4) increment counter
            }
        }

        System.out.println(searchNum + " occurs " + count + " times.");
        sc.close();

    }
}
