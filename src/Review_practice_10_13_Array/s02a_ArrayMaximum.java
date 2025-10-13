package Review_practice_10_13_Array;

public class s02a_ArrayMaximum
{
    public static void main(String[] args) {
        int[] someArray = {9, 2, 8, 4, 5, 6}; // (2) create and fill an integer array

        System.out.println("Max number is");   // (3) display message before result

        // (4) call the max() method and print the returned maximum number
        System.out.println(max(someArray));
    }

    /*
     (5) Method: max
         Finds and returns the largest number in the array.
    */
    static int max(int[] arrayIn) {
        int result = arrayIn[0]; // (6) assume the first element is the largest so far

        // (7) loop from the second element (index 1) to the last
        for (int i = 1; i < arrayIn.length; i++) {
            // (8) if current element is greater than result, update result
            if (arrayIn[i] > result) {
                result = arrayIn[i]; // (9) new maximum found
            }
        }

        return result; // (10) return the largest number found

    }
}
