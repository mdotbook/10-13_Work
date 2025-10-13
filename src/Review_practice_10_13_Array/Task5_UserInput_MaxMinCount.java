package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task5_UserInput_MaxMinCount
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = keyboard.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = keyboard.nextInt();
        }

        int maxVal = max(arr);
        int minVal = min(arr);
        int count = 0;

        for (int val : arr) {
            if (val == maxVal)
                count++;
        }

        System.out.println("\nMax = " + maxVal);
        System.out.println("Min = " + minVal);
        System.out.println("Max appears " + count + " times");

        keyboard.close();
    }

    static int max(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++)
            if (arrayIn[i] > result)
                result = arrayIn[i];
        return result;
    }

    static int min(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++)
            if (arrayIn[i] < result)
                result = arrayIn[i];
        return result;

    }
}
