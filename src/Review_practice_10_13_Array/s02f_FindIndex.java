package Review_practice_10_13_Array;

public class s02f_FindIndex
{
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 8, 2, 9};

        int index = findIndex(numbers, 8);
        System.out.println("Index of 8: " + index);
    }

    static int findIndex(int[] arrayIn, int valueIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] == valueIn)
                return i; // found position
        }
        return -1; // not found

    }
}
