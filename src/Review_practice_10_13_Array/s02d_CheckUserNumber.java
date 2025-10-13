package Review_practice_10_13_Array;

import java.util.Scanner;

public class s02d_CheckUserNumber
{
    public static void main(String[] args) {
        int[] someArray = {9, 2, 8, 4, 5, 6}; // (2) fixed array
        Scanner sc = new Scanner(System.in);  // (3) create Scanner

        System.out.print("Enter a number to search: "); // (4)
        int num = sc.nextInt();                         // (5) read number

        // (6) call helper method
        boolean found = contains(someArray, num);

        System.out.println("Found? " + found); // (7) display result

        sc.close(); // (8)
    }

    // (9) method to check if number is in array
    static boolean contains(int[] arrayIn, int valueIn) {
        for (int current : arrayIn) {        // (10)
            if (current == valueIn) return true; // (11)
        }
        return false; // (12)

    }
}
