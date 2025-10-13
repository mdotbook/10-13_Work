package Review_practice_activities_10_13_page2;

public class Step4_BreakAndContinueTogether_ex03
{
    public static void main(String[] args) {
        // (1) Loop 1 to 10
        for (int i = 1; i <= 10; i++) {
            // (2) Skip even numbers
            if (i % 2 == 0) {
                continue; // (3)
            }
            // (4) If number is 5, stop the loop
            if (i == 5) {
                System.out.println("Reached 5 — breaking the loop.");
                break; // (5)
            }
            // (6) Print odd numbers before 5
            System.out.println(i); // expected 1,3
        }

    }
}
