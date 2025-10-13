package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task4_MaxMethod
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many elements? ");
        int size = keyboard.nextInt();

        int[] arr = new int[size];
        fillArray(arr, keyboard);

        int max = getMax(arr);
        System.out.println("Largest number = " + max);
        keyboard.close();
    }

    static void fillArray(int[] arr, Scanner input) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max)
                max = val;
        }
        return max;


    }
}
