package Review_practice_activities_10_13_page2;

public class Step4_BreakAndContinueTogether_ex01
{
    public static void main(String[] args) {
        // (1) Loop from 1 to 6
        for (int i = 1; i <= 6; i++) {
            // (2) If i is even, skip this iteration
            if (i % 2 == 0) {
                continue; // (3) go to next i
            }
            // (4) Print only odd numbers
            System.out.println(i); // e.g. 1,3,5
        }

    }
}
