package Review_practice_10_13_Array;

public class Task8_displayReverse
{
    static void displayReverse(int[] arrayIn) {                // (1) method
        System.out.println("Array in reverse:");
        for (int i = arrayIn.length - 1; i >= 0; i--) {       // (2) loop backward
            System.out.println("array[" + i + "] = " + arrayIn[i]);
        }
    }




}
