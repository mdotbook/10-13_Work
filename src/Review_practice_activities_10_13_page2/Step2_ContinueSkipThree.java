package Review_practice_activities_10_13_page2;

public class Step2_ContinueSkipThree
{
    public static void main(String[] args) {
        // (1) Loop 1 to 5
        for (int i = 1; i <= 5; i++) {
            // (2) If number is 3, skip this turn and continue with next iteration
            if (i == 3) {
                System.out.println("Skipping 3 using continue");
                continue; // (3) jump to the next i (4)
            }
            // (4) Printed only when i is not 3
            System.out.println(i); // (5)
        }
        // (6) After loop
        System.out.println("Done with loop.");

    }
}
