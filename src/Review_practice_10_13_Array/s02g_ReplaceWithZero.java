package Review_practice_10_13_Array;

import java.util.Arrays;
import java.util.Scanner;

public class s02g_ReplaceWithZero
{
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 4, 7, 4};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to replace with 0: ");
        int num = sc.nextInt();

        replaceWithZero(nums, num);

        System.out.println("Updated array: " + Arrays.toString(nums));
        sc.close();
    }

    static void replaceWithZero(int[] arrayIn, int valueIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] == valueIn)
                arrayIn[i] = 0;
        }

    }
}
