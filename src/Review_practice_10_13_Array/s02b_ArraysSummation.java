package Review_practice_10_13_Array;

import static java.lang.Long.sum;

public class s02b_ArraysSummation
{
    public static void main(String[] args) {
        int[] someArray = {9, 2, 8, 4, 5, 6}; // (2) create and fill an integer array

        System.out.println("Sum of all numbers is:"); // (3) show what we'll print next

        // (4) call the sum() method and print its return value
        System.out.println(sum(someArray));
    }
    /*
     (5) Method: sum
         Adds all numbers in the array and returns the total.
    */
    static int sum(int[] arrayIn ) {
        int total = 0; // (6) start total at zero

        // (7) loop through each number in the array using a for-each loop
        for (int currentElement : arrayIn) {
            int Total = total = +currentElement; // (8) add current number to total
        }

        return total; // (9) give back the total sum


    }
}
