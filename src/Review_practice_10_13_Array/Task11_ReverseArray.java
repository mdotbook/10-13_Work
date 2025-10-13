package Review_practice_10_13_Array;

public class Task11_ReverseArray
{
    public static void main(String[] args) {
        int[] numbers = {3, 7, 4, 9, 6};

        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) { // (1) loop backward
            System.out.println("numbers[" + i + "] = " + numbers[i]); // (2) print element
        }

    }
}
