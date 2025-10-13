package Review_practice_activities_10_13_page2;

public class Step6_FindInArrayWithBreak
{
    public static void main(String[] args) {
        int[] numbers = {2, 7, 3, 9, 5}; // (1) example array
        int target = 3;                  // (2) value to find
        boolean found = false;           // (3) flag to track if found

        // (4) loop through array indices
        for (int i = 0; i < numbers.length; i++) {
            // (5) check if current element matches
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index " + i); // (6)
                found = true;              // (7) set flag
                break;                     // (8) stop searching further
            }
        }

        // (9) if not found after loop
        if (!found) {
            System.out.println(target + " not found in the array.");
        }


    }
}
