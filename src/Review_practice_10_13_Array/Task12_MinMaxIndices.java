package Review_practice_10_13_Array;

public class Task12_MinMaxIndices
{
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 5, 9};

        int min = numbers[0];      // (1) initialize min
        int minIndex = 0;          // (2) initialize min index
        int max = numbers[0];      // (3) initialize max
        int maxIndex = 0;          // (4) initialize max index

        for (int i = 1; i < numbers.length; i++) { // (5) loop through array
            if (numbers[i] < min) {               // (6) check for new min
                min = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > max) {               // (7) check for new max
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("Index of minimum value: " + minIndex);
        System.out.println("Index of maximum value: " + maxIndex);

    }
}
