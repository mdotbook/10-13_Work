package Review_practice_10_13_Array;

public class s02d_ArraysSearch
{
    public static void main(String[] args) {
        int[] someArray = {9, 2, 8, 4, 5, 6}; // (2) create and fill an integer array

        // (3) Show what we are trying to do
        System.out.println("If the number is in the array, what is its index?");

        // (4) Call the search() method to find the index of number 6
        System.out.println(search(someArray, 6));
    }

    /*
     (5) Method: search
         Returns the index of a value in the array, or -999 if not found
    */
    static int search(int[] arrayIn, int valueIn) {
        // (6) loop through each element using its index
        for (int i = 0; i < arrayIn.length; i++) {
            // (7) if current element equals the value, return the index
            if (arrayIn[i] == valueIn) {
                return i; // (8) exit method with the index
            }
        }
        return -999; // (9) value not found

    }
}
