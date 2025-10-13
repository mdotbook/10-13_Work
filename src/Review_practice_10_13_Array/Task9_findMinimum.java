package Review_practice_10_13_Array;

public class Task9_findMinimum
{
    static void findMinimum(int[] arrayIn) {                   // (1) method
        int min = arrayIn[0];                                  // (2) initialize min
        for (int i = 1; i < arrayIn.length; i++) {            // (3) loop
            if (arrayIn[i] < min) min = arrayIn[i];           // (4) update min
        }
        System.out.println("Minimum value = " + min);         // (5) print
    }


}
