package Review_practice_10_13_Array;

public class Task2_FindMax
{
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5};                       // (1) create array
        int max = numbers[0];                                   // (2) initialize max

        for (int i = 1; i < numbers.length; i++) {             // (3) loop through array
            if (numbers[i] > max) {                            // (4) check if current > max
                max = numbers[i];                               // (5) update max
            }
        }

        System.out.println("Maximum value is: " + max);        // (6) print result

    }
}
