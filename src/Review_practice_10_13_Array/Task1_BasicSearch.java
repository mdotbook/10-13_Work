package Review_practice_10_13_Array;

public class Task1_BasicSearch
{
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 5}; // (1) predefined array
        int target = 9;                  // (2) number to search

        int index = search(numbers, target); // (3) call search method
        System.out.println("Index: " + index); // (4) print result
    }

    // (5) Method to search for a number
    static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) { // (6) loop through array
            if (array[i] == value) {            // (7) check for match
                return i;                        // (8) return index if found
            }
        }
        return -999; // (9) return -999 if not found

    }
}
