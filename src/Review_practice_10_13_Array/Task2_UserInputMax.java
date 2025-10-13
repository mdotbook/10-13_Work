package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task2_UserInputMax
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many elements? ");
        int size = keyboard.nextInt();

        int[] someArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            someArray[i] = keyboard.nextInt();
        }

        System.out.println("Maximum number is " + max(someArray));
        keyboard.close();
    }

    static int max(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++) {
            if (arrayIn[i] > result)
                result = arrayIn[i];
        }
        return result;

    }
}
