package Review_practice_10_13_Array;

import java.util.Scanner;

public class s02e_CountMatches
{
    public static void main(String[] args) {
        int[] data = {9, 2, 8, 4, 5, 6, 4, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to count: ");
        int num = sc.nextInt();

        int count = countMatches(data, num);
        System.out.println(num + " appears " + count + " times.");

        sc.close();
    }

    static int countMatches(int[] arrayIn, int valueIn) {
        int count = 0;
        for (int n : arrayIn) {
            if (n == valueIn) count++;
        }
        return count;

    }
}
