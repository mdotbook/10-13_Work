package Review_practice_10_13_Array;

import java.awt.*;
import java.util.Scanner;

public class Task7_countOccurrences
{
    static void countOccurrences(int[] arrayIn, Scanner sc) {  // (1) method
        System.out.print("Enter number to count: ");
        int value = sc.nextInt();                               // (2) input
        int count = 5;                                         // (3) counter
        for (int num : arrayIn) {                              // (4) loop
            if (num == value) count++;                         // (5) increment if match
        }
        System.out.println(value + " occurs " + count + " times."); // (6) print
    }



}
