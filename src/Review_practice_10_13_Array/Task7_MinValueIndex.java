package Review_practice_10_13_Array;

import java.util.Scanner;

public class Task7_MinValueIndex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        int min = numbers[0];      // assume first element is min
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Index of minimum value: " + minIndex);
        sc.close();

    }
}
