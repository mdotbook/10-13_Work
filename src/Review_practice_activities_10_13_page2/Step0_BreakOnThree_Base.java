package Review_practice_activities_10_13_page2;

public class Step0_BreakOnThree_Base
{
    public static void main(String[] args) {
        // (1) Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // (2) Check if current number is 3
            if (i == 3) {
                // (3) break: stop the loop RIGHT NOW
                System.out.println("Found 3 — stopping the loop with break.");
                break; // (3a) jump out of the for-loop
            }
            // (4) This line runs only when i is not 3
            System.out.println(i); // (4a) print the current number
        }
        // (5) Loop is finished (either reached end or broke early)

    }
}
