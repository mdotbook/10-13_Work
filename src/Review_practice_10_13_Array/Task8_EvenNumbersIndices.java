package Review_practice_10_13_Array;

public class Task8_EvenNumbersIndices
{
    public static void main(String[] args) {
        int[] numbers = {3, 7, 4, 9, 6, 8};

        System.out.println("Indices of even numbers:");
        for (int i = 0; i < numbers.length; i++) { // loop through array
            if (numbers[i] % 2 == 0) {             // check even
                System.out.println(i);             // print index
            }
        }

    }
}
