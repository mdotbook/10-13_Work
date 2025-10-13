package Review_practice_10_13_Array;

public class Task6_MaxValueIndex
{
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 5, 9};

        int max = numbers[0];      // (1) assume first element is max
        int maxIndex = 0;          // (2) track index of max

        for (int i = 1; i < numbers.length; i++) { // (3) loop through array
            if (numbers[i] > max) {                // (4) compare
                max = numbers[i];                  // (5) update max
                maxIndex = i;                      // (6) update index
            }
        }

        System.out.println("Index of maximum value: " + maxIndex); // (7) output

    }
}
