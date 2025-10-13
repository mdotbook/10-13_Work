package Review_practice_activities_10_13_page2;

public class Step4_BreakAndContinueTogether
{
    public static void main(String[] args) {
        // (1) Loop from 1 to 12
        for (int i = 1; i <= 12; i++) {

            // (2) If i divisible by 3, skip this iteration
            if (i % 3 == 0) {
                System.out.println("Skipping " + i + " because it's divisible by 3 (continue).");
                continue; // (2a)
            }

            // (3) If i is greater than 8, stop the whole loop
            if (i > 8) {
                System.out.println("Reached number > 8 (" + i + ") — stopping the loop (break).");
                break; // (3a)
            }

            // (4) Otherwise print i
            System.out.println("Counting: " + i);
        }

        // (5) Program ends here

    }
}
