package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task5_SearchArrayIndex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 7, 2, 9, 5};

        System.out.print("Enter number to find index: ");
        int searchNum = sc.nextInt();                            // (1) user input
        int index = -999;                                        // (2) default if not found

        for (int i = 0; i < numbers.length; i++) {              // (3) loop through array
            if (numbers[i] == searchNum) {                      // (4) check match
                index = i;                                      // (5) store index
                break;                                          // (6) exit loop
            }
        }

        System.out.println("Index of " + searchNum + " = " + index); // (7) print result
        sc.close();

    }
}
