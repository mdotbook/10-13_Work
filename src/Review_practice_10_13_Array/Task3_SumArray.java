package Review_practice_10_13_Array;

public class Task3_SumArray
{
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5};                     // (1) create array
        int sum = 0;                                         // (2) initialize sum

        for (int num : numbers) {                            // (3) loop through array
            sum += num;                                      // (4) add to sum
        }

        System.out.println("Sum of array values = " + sum);  // (5) print result

    }
}
