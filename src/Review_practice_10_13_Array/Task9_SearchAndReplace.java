package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task9_SearchAndReplace
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 7, 1, 9, 5};

        System.out.print("Enter number to search: ");
        int searchNum = sc.nextInt();
        System.out.print("Enter number to replace with: ");
        int replaceNum = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNum) { // check match
                numbers[i] = replaceNum;   // replace element
            }
        }

        System.out.println("Updated array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        sc.close();

    }
}
