package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task2_FillArrayMethod
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many elements to store? ");
        int size = keyboard.nextInt();

        int[] someArray = new int[size];
        displayTempsAndFill(someArray, keyboard);
        keyboard.close();
    }

    static void displayTempsAndFill(int[] arr, Scanner input) {
        System.out.println("*** Your Array size is *** " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nYou entered:");
        for (int val : arr) {
            System.out.println(val);
        }
    }

}

