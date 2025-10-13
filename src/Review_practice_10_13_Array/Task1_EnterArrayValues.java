package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task1_EnterArrayValues
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                  // (1) Scanner for input
        System.out.print("How many numbers to store? ");
        int size = sc.nextInt();                               // (2) read size
        int[] numbers = new int[size];                         // (3) create array

        for (int i = 0; i < numbers.length; i++) {            // (4) loop through array
            System.out.print("Enter number " + i + ": ");
            numbers[i] = sc.nextInt();                         // (5) store input
        }

        System.out.println("Array entered:");
        for (int i = 0; i < numbers.length; i++) {            // (6) print array
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        sc.close();

    }
}
