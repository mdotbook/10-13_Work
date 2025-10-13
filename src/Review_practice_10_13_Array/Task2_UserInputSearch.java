package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task2_UserInputSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 7, 1, 9, 5}; // predefined array

        System.out.print("Enter number to search: ");
        int target = sc.nextInt(); // user input

        int index = search(numbers, target); // call search method
        System.out.println("Index: " + index);

        sc.close();
    }

    static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -999;

    }
}
