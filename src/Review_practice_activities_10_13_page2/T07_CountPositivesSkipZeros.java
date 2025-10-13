package Review_practice_activities_10_13_page2;

public class T07_CountPositivesSkipZeros
{
    public static void main(String[] args) {
        int[] arr = {0, 5, -2, 3, 0, 1}; // (1) sample
        int count = 0; // (2) positives counter
        // (3) Loop
        for (int v : arr) {
            // (4) Skip zeros
            if (v == 0) {
                continue; // (5)
            }
            // (6) Count positives only
            if (v > 0) count++; // (7)
        }
        // (8) Show result
        System.out.println("Positive numbers (excluding zeros): " + count); // expected 3

    }
}
