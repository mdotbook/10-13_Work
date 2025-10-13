package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task3_SumMethod
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many elements? ");
        int size = keyboard.nextInt();

        int[] arr = new int[size];
        fillArray(arr, keyboard);

        int total = getSum(arr);
        System.out.println("Total Sum = " + total);
        keyboard.close();
    }

    static void fillArray(int[] arr, Scanner input) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;

    }
}
