package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task4_CheckMembership
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 7, 2, 9, 5};

        System.out.print("Enter number to find: ");
        int searchNum = sc.nextInt();                            // (1) user input
        boolean found = false;                                   // (2) flag

        for (int num : numbers) {                                // (3) loop through array
            if (num == searchNum) {                              // (4) check match
                found = true;
                break;                                           // (5) exit loop
            }
        }

        System.out.println(found ? searchNum + " is in the array"
                : searchNum + " is not in the array"); // (6) print result
        sc.close();
    }

}

